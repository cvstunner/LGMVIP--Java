import java.lang.Character;

public class Dijkstra{
	private char operators[];
	private String postfixExp[];
	private String numbers[];
	private int top;
	private int topNum;
	private int front;
	private int rear;
	private int size;

	public Dijkstra(int size){
		operators = new char[size];
		postfixExp = new String[size];
		numbers = new String[size];
		this.size = size;
		top = front = rear = -1;
	}

	public void push(char data){
		if (isStackFull()) {
			System.out.println("Stack is Full!");
			return;
		}
		operators[++top] = data;
	}

	public char pop(){
		if (isStackEmpty()) {			
			System.out.println("Stack is Empty!");
			return '\0';
		}
		return operators[top--];
	}

	public boolean isStackEmpty(){
		return top == -1;
	}

	public boolean isStackFull(){
		return top == size-1;
	}

	public char peekStack(){
		return operators[top];
	}

	public void enQueue(String data){
		if (isQueueFull()) {
			System.out.println("Queue is Full!");
			return;
		}
		else {
			if (isQueueEmpty()) {
				front = 0;
			}
			postfixExp[++rear] = data;
		}
	}

	public String deQueue(){
		String data;
		if (isQueueEmpty()) {			
			System.out.println("Queue is Empty!");
			return "";
		}
		else{
			data = postfixExp[front];
			if (front >= rear){
				front = rear = -1;
			}
			else{
				front++;
			}
			return data;
		}
	}

	public boolean isQueueEmpty(){
		return front == -1;
	}

	public boolean isQueueFull(){
		return front == 0 && rear == size-1;
	}

	public void pushNumber(String data){
		if (isFullNumber()) {
			System.out.println("Stack is Full!");
			return;
		}
		numbers[++top] = data;
	}

	public String popNumber(){
		if (isEmptyNumber()) {			
			System.out.println("Stack is Empty!");
			return "";
		}
		return numbers[top--];
	}

	public boolean isEmptyNumber(){
		return top == -1;
	}

	public boolean isFullNumber(){
		return top == size-1;
	}

	public void displayStack(){
		for (int i=0; i <= top; i++) {
			System.out.println(i + ": " + numbers[i]);
		}
	}

	public void displayQueue(){
		for (int i=front; i <= rear; i++) {
			System.out.println(i + ": " + postfixExp[i]);
		}
	}

	public boolean isNum(String str){
		if (str == String.valueOf('\0') || str == ""){
			return false;
		}
		try{
			Double.parseDouble(String.valueOf(str));
		}
		catch (NumberFormatException ex) {
			return false;
		}
		return true;
	}

	public boolean isLetter(String str){
		if (str == String.valueOf('\0') || str == ""){
			return false;
		}
		try{
			Double.parseDouble(String.valueOf(str));
		}
		catch (NumberFormatException ex) {
			return false;
		}
		return true;
	}

	public boolean isTrigoFunc(String str){
		if (str == "sin" || str == "cos" || str == "tan" || str == "cos" || str == "sin" || str == "cos"){
			return true;
		}
		else{
			return false;
		}
	}

	public int getPrecedence(char c){
		if (c == '(') {
			return 0;
		}
		else if (c == '+' || c == '-') {
			return 1;
		}
		else if (c == '*' || c == '/') {
			return 2;
		}
		else if (c == '^') {
			return 3;
		}
		return -1;
	}

 	public void createRPN(String exp){
		String expression = "(" + exp + ")";
		String digit = "";
		char c = '\0';
		for (int i = 0; i < expression.length(); ++i) {
			c = expression.charAt(i);
			if (isNum(String.valueOf(c)) || c == '.') {
				digit += c;
			}
			else if (c == '(') {
				if (digit != "") {
					enQueue(digit);
					digit = "";
				}
				push('(');
			}
			else if (c == ')') {
				if (digit != "") {
					enQueue(digit);
					digit = "";
				}
				while (!isStackEmpty() && peekStack() != '(') {
					enQueue(String.valueOf(pop()));
				}
				pop();		
			}
			else{			
				if (digit != "") {
					enQueue(digit);
					digit = "";
				}
				while (!isStackEmpty() && getPrecedence(c) <= getPrecedence(peekStack())){
					enQueue(String.valueOf(pop()));
				}
				push(c);
			}
		}

		while(!isStackEmpty()){
			if (peekStack() == '(') {
				System.out.println("Invalid Expression!");
			}
			enQueue(String.valueOf(pop()));
			top = -1;
		}
	}

	public String evaluateRPN(){
		String data = "";
		double operand1 = 0;
		double operand2 = 0;
		for(int i = front; i <= rear; i++){
			data = deQueue();
			if (isNum(data)) {
				pushNumber(data);
			}
			else{
				operand2 = Double.parseDouble(popNumber());
				operand1 = Double.parseDouble(popNumber());
				pushNumber(String.valueOf(evaluateArithmetic(data, operand1, operand2)));
			}
		}
		data = popNumber();
		top = -1;
		return data;
	}

	public double evaluateArithmetic(String operation, double operand1, double operand2){
		double ans = 0;
		switch (operation) {
			case "*":
				ans = operand1*operand2;
				break;
			case "/":
				ans = operand1/operand2;
				break;
			case "+":
				ans = operand1+operand2;
				break;
			case "-":
				ans = operand1-operand2;
				break;
			default:
				System.out.println("Invalid Expression!");
				break;
		}
		return ans;
	}

	public String calculate(String exp){
		createRPN(exp);
		return evaluateRPN();
	}

	public static void main(String[] args){
		Dijkstra dj = new Dijkstra(100);
		// System.out.println(dj.calculate("1+2"));
		// System.out.println(dj.calculate("1+2"));
		dj.createRPN("1+2");
		dj.displayQueue();
		// dj.calculate("sin(90)")
	}
}
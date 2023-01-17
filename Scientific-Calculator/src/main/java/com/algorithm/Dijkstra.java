package com.algorithm;

import java.lang.Character;
import java.lang.Math;

// Implementation of Dijkstras Shunting Yard Algorithm
public class Dijkstra{
	private String operators[];
	private String postfixExp[];
	private String numbers[];
	private int top;
	private int topNum;
	private int front;
	private int rear;
	private int size;
	private boolean isUndefined = false;

	public Dijkstra(int size){
		operators = new String[size];
		postfixExp = new String[size];
		numbers = new String[size];
		this.size = size;
		top = front = rear = -1;
	}

	public void push(String data){
		if (isStackFull()) {
			System.out.println("Stack is Full!");
			return;
		}
		operators[++top] = data;
	}

	public String pop(){
		if (isStackEmpty()) {			
			System.out.println("Stack is Empty!");
			return "";
		}
		return operators[top--];
	}

	public boolean isStackEmpty(){
		return top == -1;
	}

	public boolean isStackFull(){
		return top == size-1;
	}

	public String peekStack(){
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
			System.out.println(i + ": " + operators[i]);
		}
	}

	public void displayNumStack(){
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
		if (str.equals("sin") || str.equals("cos") || str.equals("tan") || str.equals("asin") || str.equals("acos") || str.equals("atan")){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean isUnaryOperator(char c){
		if (c == '+' || c == '-') {
			return true;
		}
		else{
			return false;
		}
	}

	public boolean isOperator(char c){
		if (c == '(' || c == '+' || c == '-' ||  c == '*' ||  c == '/') {
			return true;
		}
		else{
			return false;
		}
	}

	public boolean isArithmeticOperator(char c){
		if (c == '+' || c == '-' ||  c == '*' ||  c == '/') {
			return true;
		}
		else{
			return false;
		}
	}

	public boolean isLogFunc(String str){
		if (str.equals("log") || str.equals("ln")) {
			return true;
		}
		else{
			return false;
		}
	}

	public boolean isSqrt(String str){
		if (str.equals("sqrt")) {
			return true;
		}
		else{
			return false;
		}
	}

	public boolean isSqrt(char c){
		if (c == '^') {
			return true;
		}
		else{
			return false;
		}
	}

	public int getPrecedence(String str){
		if (str.equals("(")) {
			return 0;
		}
		else if (str.equals("+") || str.equals("-")) {
			return 1;
		}
		else if (str.equals("*") || str.equals("/")) {
			return 2;
		}
		else if (str.equals("^")) {
			return 3;
		}
		else if (str.equals("sin") || str.equals("cos") || str.equals("tan") || str.equals("asin") || str.equals("acos") || str.equals("atan") || str.equals("log") || str.equals("ln")) {
			return 4;
		}
		return -1;
	}

 	public void createRPN(String exp){
		String expression = "(" + exp + ")";
		String digit = "";
		char c = '\0';
		char pc = '\0';
		for (int i = 0; i < expression.length(); ++i) {
			c = expression.charAt(i);
			if (i > 0) {
				pc = expression.charAt(i-1);
			}
			if (isNum(String.valueOf(c)) || (isOperator(pc) && isUnaryOperator(c)) || c == '.') {
				digit += c;
			}
			else if (Character.isLetter(c)){
				if (c != 'e') {
					digit += c;
				}
				else{
					digit = "2.718281828459045235360287";
				}
			}
			else if (c == '(') {
				if(isTrigoFunc(digit) || isLogFunc(digit) || isSqrt(digit)){
					push(digit);
					digit = "";
				}
				else if (!digit.equals("") && !isTrigoFunc(digit) && !isLogFunc(digit) && !isSqrt(digit) && !Character.isLetter(c)) {
					enQueue(digit);
					digit = "";
				}
				push("(");
			}
			else if (c == ')') {
				if (digit.equals("pi")) {
					digit = "3.141592653589793238462643";
					enQueue(digit);
					digit = "";
				}
				else if (!digit.equals("")){
					enQueue(digit);
					digit = "";
				}
				while (!isStackEmpty() && !peekStack().equals("(")) {
					enQueue(pop());
				}
				pop();		
			}
			else{		
				if (digit.equals("pi")) {
					digit = "3.141592653589793238462643";
					enQueue(digit);
					digit = "";
				}
				else if (!digit.equals("")){
					enQueue(digit);
					digit = "";
				}
				while (!isStackEmpty() && getPrecedence(String.valueOf(c)) <= getPrecedence(peekStack()) && isArithmeticOperator(c)){
					enQueue(pop());
				}
				push(String.valueOf(c));
			}
		}       

		while(!isStackEmpty()){
			if (peekStack() == "(") {
				System.out.println("Invalid Expression!");
			}
			enQueue(pop());
			top = -1;
		}
	}

	public String evaluateRPN(){
		String data = "";
		Double operand1 = 0.0;
		Double operand2 = 0.0;
		for(int i = front; i <= rear; i++){
			data = deQueue();
			if (isNum(data)) {
				pushNumber(data);
			}
			else{
				if (isTrigoFunc(data) || isLogFunc(data) || isSqrt(data)) {
					operand1 = Double.parseDouble(popNumber());
				}
				else {
					System.out.println("issh: " + isTrigoFunc(data));
					operand2 = Double.parseDouble(popNumber());
					operand1 = Double.parseDouble(popNumber());
				}
				pushNumber(String.valueOf(evaluateOperation(data, operand1, operand2)));
			}
		}
		data = popNumber();
		top = -1;
		return data;
	}

	public double evaluateOperation(String operation, double operand1, double operand2){
		double ans = 0;
		double round = 10000000.0;
		System.out.println(operation + " " + operand1);
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
			case "^":
				ans = Math.pow(operand1, operand2);
				break;
			case "sqrt":
				ans = Math.sqrt(operand1);
				break;
			case "sin":
				ans = Math.round(Math.sin(Math.toRadians(operand1))*round)/round;
				break;
			case "cos":
				ans = Math.round(Math.cos(Math.toRadians(operand1))*round)/round;
				break;  
			case "tan":
				ans = Math.round(Math.tan(Math.toRadians(operand1))*round)/round;
				break;   
			case "asin":
				ans = Math.toDegrees(Math.asin(operand1));
				break;
			case "acos":
				ans = Math.toDegrees(Math.acos(operand1));
				break;  
			case "atan":
				ans = Math.toDegrees(Math.atan(operand1));
				break; 
			case "log":
				ans = Math.log10(operand1);
				break;   
			case "ln":
				ans = Math.log(operand1);
				break;     
			default:
				System.out.println("Invalid Expression!");
				break;
		}
		if (ans > 9E8) {
			isUndefined = true;
			return 0;
		}
		isUndefined = false;
		return ans;
	}

	public String calculate(String exp){
		createRPN(exp);
		String calc = evaluateRPN();
		if (!isUndefined) {	
			return calc;	
		}
		return "undefined"; 
	}
}

// pie = 3.1415926535897932384626433832795
// e   = 2.7182818284590452353602874713527
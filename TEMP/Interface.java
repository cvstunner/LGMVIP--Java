interface first {
	public void getData(String data);
}

class User implements first {
	@Override
	public void getData(String data){
		System.out.println(data);
	}
}

public class Interface {
	public static void main(String[] args){
		User user = new User();
		user.getData("Chetan");
	}
} 
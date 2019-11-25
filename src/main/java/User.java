public class User {

	protected int userId = 0000;
	protected String user_name;
	protected String password;

	public static int count = 1;
	protected String loginStatus;

	public User(String user_name, String password){
		this.userId = count++;
		this.password = password;
		this.user_name = user_name;
	}

	public static void login(String user_name,String password){
		for (int i=0; i<=count; i++){
			System.out.println("Please Enter User name:");
		}
	}
	public Boolean verifyLogin() {
		if (true){
			System.out.println("login Successful!");
			return true;
		}else{
			System.out.println("Incorrect Username or PassWord");
			return false;
		}
	}
}

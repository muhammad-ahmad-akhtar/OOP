class UserInfo{

	private static String username = "ahmad";
	private static String password = "123";

	public static boolean validateLogin(String usernameInput, String passwordInput){
	
		if(username.equals(usernameInput) && password.equals(passwordInput)){

			System.out.printf("%n----------------- You have Logged-in Successfuly. -------%n%n");
			return true;
		}

		else{

			System.out.printf("%n----------------- Error :( Login was not Successful. -------%n");
			return false;

		}

	}

}


package predicatePrograms;

import java.util.function.Predicate;

class User {
	String username;
	String pwd;

	User(String username, String pwd) {
		this.username = username;
		this.pwd = pwd;
	}
}

public class CheckUserAuthentication {

	public static void main(String[] args) {
		CheckUserAuthentication cua = new CheckUserAuthentication();
		User user = new User("Akii", "1234");
		cua.checkAuth(user);
	}

	public void checkAuth(User user) {
		Predicate<User> pred = (userParameter) -> (userParameter.username == "Akii") && (userParameter.pwd == "1234");
		System.out.println(pred.test(user));
	}
}

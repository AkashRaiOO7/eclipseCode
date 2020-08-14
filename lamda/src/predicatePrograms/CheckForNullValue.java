package predicatePrograms;

import java.util.function.Predicate;

public class CheckForNullValue {
	public static void main(String[] args) {
		String[] names = { "Akash", " ", null, "", "Amit" };
		Predicate<String> prs= s-> s.length()!=0 && s !=null;
		 
	}
}

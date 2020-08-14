package predicatePrograms;

import java.util.function.Predicate;

public class NameStartsWithK {
	public static void main(String[] args) {
		String[] names = { "Akash", "Kamal", "Abhishek", "Kunal" };
		Predicate<String> ps = s -> s.charAt(0) == 'K' || s.charAt(0) == 'k';
		for (String str : names) {
			if (ps.test(str)) {
				System.out.println(str);
			}
		}
	}
}
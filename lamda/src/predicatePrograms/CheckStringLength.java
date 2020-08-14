package predicatePrograms;

import java.util.function.Predicate;

public class CheckStringLength {
	public static void main(String[] args) {
		Predicate<String> p= s->s.length()>5;
		System.out.println(p.test("Akash"));
	}
}

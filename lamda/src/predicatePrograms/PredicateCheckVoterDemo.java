package predicatePrograms;

import java.util.function.Predicate;

public class PredicateCheckVoterDemo {
	public static void main(String[] args) {
		Predicate<Integer> p = i->i>18;
		System.out.println(p.test(10));
	}
}

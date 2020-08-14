package predicatePrograms;

import java.util.function.Predicate;

public class AndOrNegate {
	public static void main(String[] args) {
		Predicate<Integer> greaterThan10 = i -> i > 10;
		Predicate<Integer> evenOrNot = i -> i % 2 == 0;
		Predicate<Integer> greaterThan10AndEven = greaterThan10.and(evenOrNot);
		Predicate<Integer> greaterThan10OrEven = greaterThan10.or(evenOrNot);
		System.out.println("if number is greater than 10: " + greaterThan10.test(10));
		System.out.println("if number is even: " + evenOrNot.test(9));
		System.out.println("if number is less than 10: " + greaterThan10.negate().test(9));
		System.out.println("if number is greater than 10 and even: " + greaterThan10AndEven.test(40));
		System.out.println("if number is greater than 10 or even: " + greaterThan10OrEven.test(9));
	}
}

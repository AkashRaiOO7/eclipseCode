package functionProgram;

import java.util.function.Function;

public class LengthOfStringUsingFunction {
	public static void main(String[] args) {
		Function<String, Integer> fun= (s)->s.length();
		System.out.println("Length of String: "+fun.apply("Akash"));
		Function<String, String> fun2= (s)->s.replaceAll(" ", "");
		System.out.println("String after removing spaces: "+ fun2.apply("Akash Rai "));
	}
}

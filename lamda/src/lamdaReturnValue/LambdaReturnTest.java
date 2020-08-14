package lamdaReturnValue;

interface InterfaceDemo1 {
	public abstract boolean checkVoter(int age);
}

public class LambdaReturnTest {
	public static void main(String[] args) {
		InterfaceDemo1 id1 = (i) -> i > 18;
		System.out.println(id1.checkVoter(20));
	}
}
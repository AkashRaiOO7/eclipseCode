package supplier;

import java.util.function.Supplier;

public class SupplierDemoPrg {
	public static void main(String[] args) {
		 Supplier<Integer> sl= ()-> (int)(Math.random()* 9);
		 System.out.println(sl.get());
	}
}
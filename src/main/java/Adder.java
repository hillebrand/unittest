public class Adder {

	public int add(int... args) {
		int a = args[0];
		int b = args[1];
		int c = args.length == 3 ? args[2] : 0;
		return a + b + c;
	}
}

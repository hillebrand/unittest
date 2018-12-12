public class Adder {

	public int add(int... args) {
		int result = 0;
		for (int arg : args) {
			result += arg;
		}
		return result;
	}
}

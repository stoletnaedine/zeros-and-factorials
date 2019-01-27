public class Main {

	public static void main(String[] args) {
		for (int i = 1; i <= CUSTOM_NUMBER; i++) {
		factorialZeros(i);
		}
	}

	private static final int CUSTOM_NUMBER = 20;

	public static long factorial(final int N) {
		long result = 1;
		for (long i = 1; i <= N; i++) {
			result *= i;
		}
		return result;
	}

	public static int zeros(long F){
		int counter = 0;
		while (F % 10 == 0) {
			F = F / 10;
			counter += 1;
		}
		return counter;
	}

	public static void factorialZeros(final int N) {
		long F = factorial(N);
		int zeros = zeros(F);
		showResult(N, zeros);
	}

	public static void showResult(final int N, int zeros) {
		System.out.println("Factorial of number " + N + " contains " + zeros + " zeros at the end.");
	}
}
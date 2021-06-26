package defensiveProgramming;

public class MathUtils {
	public static int factorial (int n) throws IllegalArgumentException {
		if (n < 0) {
			throw new IllegalArgumentException(n + " is a negative number, you are wrong.");
		}
		else if (n > 16) {
			throw new IllegalArgumentException(n + " is far too large, you are wrong.");
		}
		
		int fac = 1;
		for (int i=n; i>0; i--)
			fac *= i;
		return fac;
	}
}

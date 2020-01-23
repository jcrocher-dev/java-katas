public class Factorial {

	public static int factoriel (int n) {
		try {
			if (n>=1) 
				return factoriel(n-1)*n;
			return 1;
		} catch (IllegalArgumentException illegalArgumentException) {
			
		}
		return 1;
	}
}

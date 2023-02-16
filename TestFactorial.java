//Hallar el factorial de n numero.

public class TestFactorial {
	public static void main(String[] args) {
		
		int factorial = 1;
		for(int i = 1; i < 11; i++) {
			factorial *= i;
			System.out.println("El factorial de "+i+" es "+factorial);
		}
		
//		int i = 1;
//		int factorial = 1;
//		while(i<10) {
//			factorial *= i;
//			i++;
//			System.out.println("El factorial de "+i+" es "+factorial);
//		}
	}
}

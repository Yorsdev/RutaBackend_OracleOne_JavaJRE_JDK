
public class TasaConIfs_Ejercicio1 {
	public static void main(String[] args) {
		/*	De 1900.0 a 2800.0, el IR es de 7.5% y puede deducir de la declaración el monto de 142.
			De 2800.01 a 3751.0, el IR es del 15% y puede deducir 350.
			De 3751.01 a 4664.00, el IR es 22.5% y puede deducir 636.*/
		
		double salario = 4000.0;
		
		if(salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("Su Ir es de 7.5%");
			System.out.println("Usted puede deducir hasta $142");
		}
		if(salario >= 2800.1 && salario <= 3751.0) {
			System.out.println("Su Ir es de 15%");
			System.out.println("Usted puede deducir hasta $350");
		}
		if(salario >= 3751.1 && salario <= 4664.00) {
			System.out.println("Su Ir es de 22.5%");
			System.out.println("Usted puede deducir hasta $636");
		}
	}
}

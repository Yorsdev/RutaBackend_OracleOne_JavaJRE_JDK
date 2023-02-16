package Practicas;
import java.util.Scanner;

public class SwitchesPractica {

	public static void main(String[] args) {
		
		
		System.out.println("***************Uso de Switches*****************");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int dato = entrada.nextInt();
		
		switch (dato) {
		case 1:
		case 2:
		case 3:
			System.out.println("Pertenece al grupo 1, 2 o 3");
			break;
		case 4:
		case 5:
			System.out.println("Pertence al grupo 4 o 5");
			break;
		case 6:
		case 7:
			System.out.println("Pertenece al grupo 6 o 7");
			break;
		default:
			System.out.println("No pertenece a ninguno de los grupos");
			break;
		}
		entrada.close();
		
	}

}

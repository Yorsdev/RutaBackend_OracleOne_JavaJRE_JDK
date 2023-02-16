
public class EjemploScope {

	public static void main(String[] args) {
		
		int edad = 21;
		int cantidadPersonas = 2;
		
		boolean esPareja;
		
		if(cantidadPersonas > 1) {
			esPareja = true;
		}else {
			esPareja = false;
		}
		
		boolean puedeEntrar = edad >= 18 && esPareja;
		
		System.out.println(puedeEntrar);
		 
		if (puedeEntrar) {
			System.out.println("Sea Bienvenido");
		}else {
			System.out.println("Usted no tiene permitido puede entrar");
		}
		
	}
}

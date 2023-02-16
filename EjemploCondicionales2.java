
public class EjemploCondicionales2 {
	
	public static void main(String[] args) {
		
		int edad = 21;
		int cantidadPersonas = 2;
		
		boolean esPareja = cantidadPersonas > 1;
		boolean puedeEntrar = edad >= 18 && esPareja;
		
		System.out.println(puedeEntrar);
		 
		if (puedeEntrar) {
			System.out.println("Sea Bienvenido");
		}else {
			System.out.println("Usted no tiene permitido puede entrar");
		}
		
	}
}

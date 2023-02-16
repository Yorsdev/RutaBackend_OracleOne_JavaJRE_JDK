
public class EjemploCondicionales {
	
	public static void main(String[] args) {
		System.out.println("hola mundo");
		
		int edad = 8;
		int cantidad = 2;
		
		if (edad >= 18 ) {
			System.out.println("Usted puede entrar");
		}else {
			if (cantidad <= 2) {
				System.out.println("Usted es menor de edad pero puede ingresar porque "
						+ "viene acompaniado de por lo menos un mayor de edad");
			}else {
				System.out.println("No tiene permitido ingresar, andate pa la casa culicagao");
			}
			
		}
		
	}
}

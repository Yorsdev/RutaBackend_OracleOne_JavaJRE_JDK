public class TestAlcance {

    public static void main (String [] args) {
        System.out.println ("pruebas condicionales");

        int edad = 20;
        int cantidadPersonas = 3;
        boolean acompaniado;

        if (cantidadPersonas >= 2) {
        	acompaniado  = true;
        } else {
            acompaniado = false;
        }

        if (edad >= 18 || acompaniado) {
            System.out.println ("Bienvenido");
        } else {
            System.out.println ("desafortunadamente no puedes ingresar");
        }
    }
}
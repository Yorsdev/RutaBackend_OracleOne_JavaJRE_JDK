package Practicas;
import java.util.Scanner;

public class JuegoAhorcado {
	
	  public static void main(String[] args) {
//	    Scanner scanner = new Scanner(System.in);
//
//	    String palabra = "ahorcado"; // palabra a adivinar
//	    int intentos = 6; // cantidad de intentos
//
//	    char[] palabraOculta = new char[palabra.length()]; // arreglo para la palabra oculta
//	    for (int i = 0; i < palabraOculta.length; i++) {
//	      palabraOculta[i] = '_'; // inicializar arreglo con guiones bajos
//	    }
//
//	    while (intentos > 0 && new String(palabraOculta).contains("_")) {
//	      System.out.println("Adivina la palabra: " + new String(palabraOculta));
//	      System.out.println("Te quedan " + intentos + " intentos.");
//
//	      System.out.print("Ingresa una letra: ");
//	      char letra = scanner.nextLine().charAt(0);
//
//	      if (palabra.contains(String.valueOf(letra))) { // si la palabra contiene la letra
//	        for (int i = 0; i < palabra.length(); i++) {
//	          if (palabra.charAt(i) == letra) {
//	            palabraOculta[i] = letra; // reemplazar guión bajo con letra
//	          }
//	        }
//	      } else {
//	        intentos--; // disminuir cantidad de intentos
//	        System.out.println("La letra " + letra + " no está en la palabra.");
//	      }
//	    }
//
//	    if (!new String(palabraOculta).contains("_")) {
//	      System.out.println("¡Felicidades! Ganaste el juego del ahorcado.");
//	    } else {
//	      System.out.println("¡Perdiste! La palabra era: " + palabra);
//	    }
//
//	    scanner.close();
	    
		  	//VERSION SIMPLIFICADA CON USO DE BOOLEAN DATATYPES 
		  
		      Scanner scanner = new Scanner(System.in);

		      String palabra = "ahorcado";
		      int intentos = 6;
		      String palabraOculta = "_".repeat(palabra.length());
		      boolean adivinado = false;

		      while (intentos > 0 && !adivinado) {
		        System.out.println("Adivina la palabra: " + palabraOculta);
		        System.out.println("Te quedan " + intentos + " intentos.");

		        char letra = scanner.nextLine().charAt(0);

		        if (palabra.contains(String.valueOf(letra))) {
		          for (int i = 0; i < palabra.length(); i++) {
		            if (palabra.charAt(i) == letra) {
		              StringBuilder sb = new StringBuilder(palabraOculta);
		              sb.setCharAt(i, letra);
		              palabraOculta = sb.toString();
		            }
		          }
		          adivinado = !palabraOculta.contains("_");
		        } else {
		          intentos--;
		          System.out.println("La letra " + letra + " no está en la palabra.");
		        }
		      }

		      if (adivinado) {
		        System.out.println("¡Felicidades! Ganaste el juego del ahorcado.");
		      } else {
		        System.out.println("¡Perdiste! La palabra era: " + palabra);
		      }

		      scanner.close();
	  }
	}
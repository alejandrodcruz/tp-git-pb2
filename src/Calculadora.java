import java.util.Scanner;

/*
 * public static void main(String[] args) { Integer a = 0; Integer b = 0;
 * Integer opcion = 0; Integer resultado = 0;
 * 
 * Scanner teclado = new Scanner(System.in);
 * 
 * do {
 * 
 * System.out.println(
 * "Ingrese su operación \n 1 para sumar. \n 2 para restar. \n 3 para multiplicar. \n 4 para dividir."
 * ); opcion = teclado.nextInt();
 * 
 * } while (opcion < 1 | opcion > 4);
 * System.out.println("Ingrese el primer numero"); a = teclado.nextInt();
 * System.out.println("Ingrese el segundo numero"); b = teclado.nextInt();
 * switch (opcion) { case 1: resultado = a + b; break; case 2: resultado = a -
 * b; break; case 3: resultado = a * b; break; default: break; }
 * System.out.println("El resultado es " + resultado); } }
 * 
 */

public class Calculadora {
	public static void main(String[] args) {

		Integer opcion = 0;

		do {

			opcion = operacion();

			switch (opcion) {
			case 1:
				sumar();
				break;
			case 2:
				restar();
				break;
			case 3:
				multiplicar();
				break;
			case 4:
				dividir();
				break;
			default:
				System.out.println("Seleccione una opcion valida");
				break;
			}

		} while (opcion < 1 || opcion > 4);
	}

	// GETTER
	public static Integer operacion() {
		Integer seleccionarOpcion = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println(
				"Ingrese su operación \n 1 para sumar. \n 2 para restar. \n 3 para multiplicar. \n 4 para dividir.");
		seleccionarOpcion = teclado.nextInt();
		return seleccionarOpcion;
	}

	// SETTER
	public static void sumar() {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		Integer a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		Integer b = teclado.nextInt();
		Integer resultado = a + b;
		System.out.println("El resultado es " + resultado);
	}

	public static void restar() {

		Scanner teclado = new Scanner(System.in);
		Integer a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		Integer b = teclado.nextInt();
		Integer resultado = a - b;
		System.out.println("El resultado es " + resultado);
	}

	public static void multiplicar() {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		int a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		int b = teclado.nextInt();
		int resultado = a * b;
		System.out.println("El resultado es " + resultado);
	}

	public static void dividir() {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		Integer a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		Integer b = teclado.nextInt();
		Integer resultado = a / b;
		System.out.println("El resultado es " + resultado);
	}

}

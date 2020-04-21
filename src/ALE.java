import java.util.Scanner;

public class ALE {

	public static void main(String[] args) {
		/*
		 * <<<<<<< HEAD Scanner teclado=new Scanner(System.in); String a; String b;
		 * String opcion; Integer resultado = null;
		 * 
		 * do{ System.out.
		 * println("Ingrese su operación /n 1 para dividir /n 2 para multiplicar /n 3 para restar /n 4 para sumar"
		 * ); opcion = teclado.next(); }while(Integer.parseInt(opcion) < 1 &&
		 * Integer.parseInt(opcion) > 4);
		 * System.out.println("Ingrese el primer numero"); a = teclado.next();
		 * System.out.println("Ingrese el segundo numero"); b = teclado.next(); switch
		 * (Integer.parseInt(opcion)) { case 1: resultado = Integer.parseInt(a) /
		 * Integer.parseInt(b); break; case 2: resultado = Integer.parseInt(a) *
		 * Integer.parseInt(b); break; case 3: resultado = Integer.parseInt(a) -
		 * Integer.parseInt(b); break; case 4: resultado = Integer.parseInt(a) +
		 * Integer.parseInt(b); break;
		 * 
		 * 
		 * System.out.println("El resultado es " + resultado.toString()); } =======
		 */
		Integer a = 0;
		Integer b = 0;
		Integer opcion;
		Integer resultado = 0;

		Scanner teclado = new Scanner(System.in);

		do {

			opcion = opcionSeleccionada();
			switch (opcion) {

			case 1:
				hacerSuma();
				break;

			case 2:
				hacerResta();
				break;

			case 3:
				hacerMultiplicacion();
				break;

			case 4:
				hacerDivision();
				break;

			default:
				System.out.println("Opcion no encontrada\n");
				break;
			}

		} while (opcion < 1 || opcion > 4);
	}

	private static int opcionSeleccionada() {
		Scanner teclado = new Scanner(System.in);
		int opcionSeleccionada = 0;
		System.out.println(
				"Ingrese su operación \n 1 para sumar \n 2 para restar \n 3 para multiplicar \n 4 para dividir");

		opcionSeleccionada = teclado.nextInt();

		return opcionSeleccionada;
	}

	public static void hacerSuma() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		Integer a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		Integer b = teclado.nextInt();
		Integer resultado = a + b;
		System.out.println("El resultado es " + resultado.toString());
	}

	public static void hacerResta() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		Integer a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		Integer b = teclado.nextInt();
		Integer resultado = a - b;
		System.out.println("El resultado es " + resultado.toString());
	}

	public static void hacerDivision() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		Integer a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		Integer b = teclado.nextInt();
		Integer resultado = a / b;
		System.out.println("El resultado es " + resultado.toString());

	}

	public static void hacerMultiplicacion() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		Integer a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		Integer b = teclado.nextInt();
		Integer resultado = a * b;
		System.out.println("El resultado es " + resultado.toString());

	}
}
//>>>>>>> d71a83ea0b7e80ac15f7388a816e92452bdf7aca
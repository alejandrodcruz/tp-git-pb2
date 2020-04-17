import java.util.Scanner;
public class Calculadora {
 public static void main(String[] args) {
 Integer a;
 Integer b;
 Integer opcion;
 Integer resultado;
 do{
 System.out.println("Ingrese su operación /n 1 para sumar /n 2 pararestar /n 3 para multiplicar /n 4 para dividir");
 opcion = teclado.next();
 }while(opcion < 1 && opcion > 4)
 System.out.println("Ingrese el primer numero");
 a = teclado.next();
 System.out.println("Ingrese el segundo numero");
 a = teclado.next();
 switch (opcion) {
case opcion=1:
	resultado = a + b;
	break;
case opcion=2:
	resultado = a - b;
	break;
case opcion=3:
	resultado = a * b;
	break;
default:
	break;
}
  System.out.println("El resultado es " + resultado.toString());
 }
}

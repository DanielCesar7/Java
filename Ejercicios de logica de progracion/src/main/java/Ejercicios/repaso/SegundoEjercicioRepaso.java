package Ejercicios.repaso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SegundoEjercicioRepaso {

	public static void main(String[] args) {

		// 01 OPERADORES Y ESTRUCTURAS DE CONTROL

		/*
		 * Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:
		 * Aritméticos, asignación, de incremento, de comparación, lógicos, identidad,
		 * pertenencia, bits... (Ten en cuenta que cada lenguaje puede poseer unos
		 * diferentes)
		 * 
		 * - Utilizando las operaciones con operadores que tú quieras, crea ejemplos que
		 * representen todos los tipos de estructuras de control que existan en tu
		 * lenguaje: Condicionales, iterativas, excepciones...
		 * 
		 * - Debes hacer print por consola del resultado de todos los ejemplos.
		 */

		// 1. Operadores aritmeticos

		byte num1 = 5;
		byte num2 = 10;

		byte suma = (byte) (num1 + num2);
		byte resta = (byte) (num1 - num2);
		byte multiplicacion = (byte) (num1 - num2);
		byte division = (byte) (num1 / num2);
		byte modulo = (byte) (num1 % num2);

		System.out.println("La suma de la operación es " + suma);
		System.out.println("La multiplicación de la operación es " + multiplicacion);
		System.out.println("La resta de la operación es " + resta);
		System.out.println("La division de la operación es " + division);
		System.out.println("La modulo de la operación es " + modulo + "\n");

		/*
		 * 2. Operadores de asignación. Permite asignar valores a variables y
		 * actualizarlos, lo que facilita la manipulación de datos y el seguimiento de
		 * estados.
		 */

		/** OPERADORES DE ASIGNACION **/
		System.out.println("Igualdad = ");
		// Compuestos
		System.out.println("Suma y asignación += ");
		System.out.println("Resta y asignación -= ");
		System.out.println("Multiplicación y asignación *= ");
		System.out.println("Division y asignación /= ");
		System.out.println("Modulo y asignacion %= \n");

		// Ejemplos

		byte a = 10;
		a += 5;

		System.out.println("la suma seria " + a);

		a -= 5;

		System.out.println("La resta sería " + a);

		a *= 5;

		System.out.println("La multiplicacion seria " + a);

		a /= 5;

		System.out.println("La division seria " + a);

		a %= 5;

		System.out.println("La division seria " + a);

		// Operadores de incremeto

		a++;
		System.out.println("El incremento de a es " + a);
		a--;
		System.out.println("El de-incremento de a es " + a + "\n");

		// Ejemplos

		/*
		 * Escribe un bucle for que imprima los números del 1 al 5 usando el operador de
		 * post-incremento i++.
		 */

		for (byte i = 1; i < 6; i++) {
			System.out.println("El valor de i es " + i);
		}

		System.out.println();

		/*
		 * Declara una variable x con valor inicial 3. Luego, declara otra variable y y
		 * asígnale el valor de x++. Imprime los valores de x e y para ver cómo se
		 * comporta el post-incremento.
		 */

		byte x = 3;

		byte y = x++;
		byte u = ++x;

		System.out.println("El valor de x es " + x);
		System.out.println("El valor de y es " + y);
		System.out.println("El valor de u es " + u + "\n");

		/*
		 * Crea una variable num con valor inicial 10. Escribe una expresión que use
		 * num++ para agregar 1 al valor de num y luego almacena el resultado de esta
		 * expresión en otra variable.
		 */
		/*
		 * Además, yo añado otra variable mas ''num4'' para ver el comportamiento del
		 * incremento, y que basicamente es despues.
		 */

		byte num = 10;
		byte num3 = num++;
		byte num4 = num;

		System.out.println(num3 + "\n" + num4);

		/**
		 * OPERADORES DE COMPARACIÓN Devuelven verdadero o falso
		 **/
		System.out.println(" Igual a == ");
		System.out.println(" Diferente de != ");
		System.out.println(" Mayor que > ");
		System.out.println(" Menor que < ");
		System.out.println(" Mayor o igual que >= ");
		System.out.println(" Menor o igual que <= \n");

		// Ejemplos

		int d = 5;
		int e = 7;

		boolean mayorQue = e > d;
		boolean menorQue = d < e;
		boolean igualQue = d == e;
		boolean DiferenteQue = d != e;
		boolean esMayorOIgualQue = e >= d;
		boolean esMenorOIgualQue = e <= d;

		System.out.println("d es mayor que e es " + mayorQue);
		System.out.println("d es menor que e es " + menorQue);
		System.out.println("d es igual que e es " + igualQue);
		System.out.println("d es diferente que e es " + DiferenteQue);
		System.out.println("d es mayor o igual que e es " + esMayorOIgualQue);
		System.out.println("d es menor o igual que e es " + esMenorOIgualQue);

		/**
		 * OPERADORES LOGICOS Evalúan una expresión de uno o dos operandos con valor de
		 * tipo boolean y devuelven otro boolean
		 **/
		System.out.println(" AND && ");
		System.out.println(" OR || ");
		System.out.println(" NOT ! ");

		// Ejemplos

		// Escribe una condición que verifique si un número entero t está en el rango de
		// 10 a 20 (inclusive) y además es par o impar y si no entra en el intervalo,
		// comprobar si es par o impar.

		byte t = 21;

		if (t >= 10 && t <= 20) {
			System.out.println("Entra el número");

			if (t % 2 == 0) {
				System.out.println("Es par");
			} else {
				System.out.println("Es impar");
			}
		} else {
			System.out.println("No entro el número");

			if (t % 2 == 0) {
				System.out.println("Es par");
			} else {
				System.out.println("Es impar");
			}
		}

		// Crea una expresión booleana que sea verdadera si una cadena str tiene una
		// longitud mayor que 5 caracteres y al mismo tiempo no contiene la letra 'a'.

		String palabra = "perros";

		boolean resultado = (palabra.length() > 5) && (!palabra.contains("a"));

		if (resultado) {
			System.out.println("Es verdadero");
		} else {
			System.out.println("Es incorrecto");
		}

		// Define una condición que sea cierta si un número y es divisible por 3 pero no
		// por 5.

		byte numero3 = 3;

		boolean resultado2 = ((numero3 % 3 == 0)) && (!(numero3 % 5 == 0));

		if (resultado2) {
			System.out.println("es multiplo de 3");
		} else {
			if (numero3 % 5 == 0) {
				System.out.println("es multiplo de 5");
			} else {
				System.out.println("no es divisible ni de 3 ni de 5");
			}

		}

		// Escribe una condición que evalúe si un carácter ch es una vocal mayúscula
		// ('A', 'E', 'I', 'O', 'U') o una consonante minúscula ('b', 'c', 'd', 'f',
		// 'g').

		String ch = "c";

		boolean resultado3 = (ch.equals("A") || ch.equals("E") || ch.equals("I") || ch.equals("O") || ch.equals("U")
				|| ch.equals("C") || ch.equals("b") || ch.equals("c") || ch.equals("d") || ch.equals("f")
				|| (ch.equals("g")));

		if (resultado3) {
			System.out.println("Es una vocal mayúscula o una consonante minúscula específica.");
		} else {
			System.out.println("No es una vocal mayúscula ni una consonante minúscula específica.");
		}

		// CONDICIONALES

		byte z = 0;

		if (z == 1)
			System.out.println("z es igual a 1");
		else if (z == 0)
			System.out.println("z es igual a 0");
		else
			System.out.println("z no es ni 0 ni 1");

		// SWITCH: compara una variable con una lista y ejecuta el código
		// correspondiente al caso que coincida

		switch (z) {
		case 1:
			System.out.println("La variable tiene como valor 1");
			break;
		case 2:
			System.out.println("La variable tiene como valor 2");
			break;
		case 3:
			System.out.println("La variable tiene como 3");
			break;
		default:
			System.out.println("la variable tiene un valor desconocido\n");
		}

		// ITERATIVAS O BUCLES
		for (int p = 1; p <= 4; p++) {
			if (p == 3)
				continue; // salta a la siguiente iteración de un bucle
			System.out.println(p);
			p++;
		}

		System.out.println();

		x = 1;
		while (x <= 5) {
			System.out.println("Iterado " + x + " Veces");
			x++;
		}

		System.out.println();

		x = 1;
		do {
			System.out.println("Iterado " + x + "veces");
			x++;
		} while (x <= 5);

		System.out.println();

		// MANEJO DE EXCEPCIONES
		Scanner scanner = new Scanner(System.in);
		int num7, num8, div;
		try {
			System.out.println("Primer número, debe ser un valor entero ");
			num7 = scanner.nextInt();
			System.out.println(" Divisor, un valor entero ");
			num8 = scanner.nextInt();
			div = num1 / num2;
			System.out.println(division);
		} catch (InputMismatchException excepcion) {

			System.err.println("Se ingresó un tipo de dato incorrecto");
		} catch (ArithmeticException excepcion) {
			System.err.println("Se intentó dividir por cero");
		} finally {
			System.out.println("Ha finalizado el ejemplo\n");
		}

		// DIFICULTAD EXTRA: Crea un programa que imprima por consola todos los números
		// comprendidos
		// * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.

		for (byte c = 10; c <= 55; ++c) {
			if (c % 2 == 0 && c != 16 && c % 3 != 0) {
				System.out.println(c);

			}
		}

	}

}

package prueba;

import java.util.Scanner;

//Pedir dos n�meros y decir cual es mayor o si son iguales
public class Ejercicio5 {

	public static void main(String[] args) {
			//Creamos el objeto Scanner
		Scanner teclado= new Scanner(System.in);
			//Definimos las variables
			int num1;
			int num2;
			
			//Pedimos el n�mero uno
			System.out.println("Ingrese el n�mero 1");
			//A�adimos por teclado el n�mero uno
			num1 = teclado.nextInt(); 
			//Pedimos el n�mero dos
			System.out.println("Ingrese el n�mero 2");
			//A�adimos por teclado el n�mero dos
			num2=teclado.nextInt();
			//Comparamos si son iguales
				if (num1==num2){
					System.out.print("Los n�meros son iguales");
				}
				//Si no son iguales
				//Comprobamos cual es el mayor
				else if(num1>num2){
					System.out.print(num1 + " es maypr que " + num2);
					}
				else {
					System.out.print(num2 + " es mayor que " + num1);
					}
	}

}

package prueba;

import java.util.Scanner;

//Pedir un numero entre 0 y 9999 y mostrarlo con las cifras al rev�s.
public class Ejercicio8 {

	public static int main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		//Definimos las variables
		int numero;
		//Pedimos el numero por pantalla
			System.out.println("Inserte un n�mero entre 0 y 9999");
		//Metemos el n�mero por teclado
			numero= teclado.nextInt();
		//Comprobamos que numero no sea mayor a 9999 o menor a 0
		if(numero<0 || numero>9999){
			//Si se cumple if mostramos un mendaje de ERROR
				System.out.println("ERROR!!! Ha insertado el **"+ numero +"** Inserte un n�mero entre 0 y 9999.");
				//Volvemos a meter el n�mero por teclado
				numero=teclado.nextInt();
				}
				else{
							
					
					}
		}
	

}
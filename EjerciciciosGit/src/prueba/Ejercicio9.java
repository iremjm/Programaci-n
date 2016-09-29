package prueba;

import java.util.Scanner;

//Pedir un n�mero de 4 cifras y decir si es capicua
public class Ejercicio9 {

	public static void main(String[] args) {
		//creamos el objeto scanner
		Scanner teclado= new Scanner(System.in);
		//Definimos las variables
		int numero, resto, numeroInverso=0, n;
		//Pedimos un n�mero de 4 cifras
		System.out.println("Ingrese un n�mero de 4 cifras");	
			numero= teclado.nextInt();
		//Comprobamos que el numro tenga cuatro cifras
		if(numero>1000 && numero<9999){
			n=numero;
				//Inicializamos las tres variables, que se cumplira mientras que n sea diferente a 0
				while (n != 0){
				//Para obtener el �ltimo d�gito del n�mero lo haremos con 
				//el resto de una divisi�n entre
				//diez. Es decir, si de 4224 queremos obtener el �ltimo
			    //d�gito haremos la siguiente operaci�n:
				/*le quitamos el �ltimo d�gito
	            1234 / 10 = 123
	            123 / 10 = 12
	            12 / 10 = 1
	            1 / 10 = 0*/
				resto =n % 10;
				/*Falta tiene el n�mero del que vamos substrayendo d�gitos.
				2. Del n�mero original hay que quitarle el �ltimo d�gito.
				 En este caso utilizamos la divisi�n entre 10.*/
				n=n/10;
				/*Habr� que guardar el n�mero substra�do. Para ello
				 *  simplemente lo sumaremos al n�mero que tengamos,
				multiplicado por 10. En el primer caso lo haremos 
				sobre el 0. Las secuencias para el n
				0*10+4=4
				4*10+2=42
				42*10+2=422
				422*10+4=4224
				 */
				numeroInverso=numeroInverso*10 + resto;
				}//while
				//Comprobamos que es capicua
					if(numero == numeroInverso){
				//Mostramos que sea apocua
					System.out.println("El n�mero es capicua");
					}//if
						//Mostramos que no es capicua
						else{
						System.out.println("El n�mero no es capicua");
						}//else
		}//if
		else{
			System.out.print("ERROR!!!! El numero ingresado no es valido");
		}//else
	}

}

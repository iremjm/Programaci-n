package prueba;

//2. Pedir din n�meros y decir si son iguales o no.
//Importamos la clase Scanner
import java.util.Scanner;

public class EjercicioDos {
		//(Hemos convertido teclado en clase local)
	private static Scanner teclado;

	public static void main(String[] args) {
		
		//Creamos el objeto Scanner para introducir los datos (Hemos convertido teclado en clase local)
		teclado = new Scanner(System.in);
			//Definimos las variables
			int numUno;
			int numDos;
			
			//pedimos el primer n�mero
			System.out.println("Ingrese el primer n�mero");
				//cargamos los valores por teclado
					numUno= teclado.nextInt();
					
			//pedimos el segundo n�mero
					System.out.println("Ingrese el segundo n�mero");
					//cargamos los valores por teclado
					 numDos= teclado.nextInt();	
					 
					 if(numUno==numDos){
						 System.out.println("Los n�meros son iguales");
					 }
					
					 else{
						 System.out.println("Los n�meros son distintos");
					 }
	
	}
}

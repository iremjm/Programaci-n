package prueba;
import java.util.Scanner;
//4.Pedir un n�mero e indicar si es positivo o negativo
public class EjercicioCuatro {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		//Defimnimos las variables
		int numero;
		String valor;
		//Pedimos un numero por consola
			System.out.print("Ingrese un n�mero");
		//Ingresamos el n�mero
			numero= teclado.nextInt();
		//Comprobamos si es positivo o negativo
			if(numero==0){
				System.out.print("El n�mero es neutro");
				}
			 if((numero>=1)){
					System.out.print("El n�mero es positivo");
					}
			 if(numero<=-1){
					System.out.print("El n�mero es negativo");
					}
			}
			
			
	}



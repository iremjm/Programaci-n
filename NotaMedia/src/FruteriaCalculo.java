import java.text.DecimalFormat;
import java.util.Scanner;


public class FruteriaCalculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Usamos el objeto Scanner para meter valores mediante el teclado
			Scanner teclado= new Scanner(System.in);
			
		//Usamos el objeto DecimalFormat 
			//DecimalFormat deicimales= new DecimalFormat("0.00");
			
			//Definimos las variables
			String producto;
			double precioKilo;
			double cantidad;
			
			double resultado;
			
			
			//A�adimos que fruta se va a calcular
			System.out.print("Que fruta va a a�adir: ");
			producto=teclado.nextLine();
			
			//A�adimos que precio tiene el kg
			System.out.println("A�ada el precio por Kg de " + producto);
			precioKilo=teclado.nextDouble();
			
			//A�adimos que cantidad se va a calcular
			System.out.println("Cuantos kilos quiere a�adir de " + producto);
			cantidad=teclado.nextDouble();
			
			//Mostramos el c�lculo del precio total
			
			//Hacemos el calculo  de precio kg por precio kg
			resultado= precioKilo * cantidad;
			
			//Mostramos el resultado por pantalla
			System.out.print("Usted ha a�adido "+ cantidad + " de "+ producto + 
					" con un coste de " + resultado + " �");
			
			
			/*System.out.print("Usted ha a�adido "+ cantidad + " de "+ producto + 
			" con un coste de" + Double.format("%.2f", resultado) );*/
			
			
			

	}

}

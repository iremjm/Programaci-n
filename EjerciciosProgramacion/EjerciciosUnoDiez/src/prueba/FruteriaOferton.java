package prueba;
import java.util.Scanner;


public class FruteriaOferton {

	public static void main(String[] args) {
	//creamos el objeto scanner para ingresar los valores
		Scanner teclado= new Scanner(System.in);
		
		//definimos las variables
		String producto;
		double precioKilo;
		double cantidad;
		double resultado;
		
		double descuento;
		//definimos la fruta en oferta
		final String OFERTA="fresas";
		
			//mostramos un mesaje para a�adir la fruta
			System.out.print("A�ada la fruta que va a calcular: ");
			//cargamos los valores por teclado
			producto=teclado.nextLine();
			//mostramos un mensaje para a�adir la cantidad
			System.out.print("A�ada la cantidad de " + producto + ": ");
			//cargamos los valores por teclado
			cantidad=teclado.nextDouble();
			//mostramos un mensaje para a�adir el precio de producto por kl
			System.out.print("A�ada el precio por Kg de" + producto + ": ");
			//cargamos el precio por teclado
			precioKilo=teclado.nextDouble();
			//a�adimos a resultado el calculo
			resultado=precioKilo*cantidad;
			
				if (producto.equals(OFERTA)){
					descuento=resultado*0.95;
					
						System.out.println("Ha cpmprado " + cantidad + " Kg de "+ producto + ", por " + descuento +" �. Esta semana est�n de oferta.");
						
						
				}
				
				else{
					if (resultado>20){
						resultado =resultado * 0.90;
						}
					
					System.out.print("Ha cpmprado " + cantidad + " Kg de "+ producto + ", por " + resultado +" � con un descuento del 10%");
					
					if (resultado<20){
						System.out.print("Ha cpmprado " + cantidad + " Kg de "+ producto + ", por " + resultado +" �");
					}
				}
		
	}

}

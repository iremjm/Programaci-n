package prueba;

import java.util.Scanner;

public class FruteriaOfertonClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner teclado= new Scanner(System.in);
		
		//definimos las variables
		String producto;
		double precioKilo;
		double cantidad;
		double resultado;
		//Definimos la variable descuento
		double dto;
		
		//Definimos constantes
		//definimos la fruta en oferta de la semana
		final String PROD_SEMANA="fresas";
		//definimos el valor minimo para aplicar el descuento
		final double DTO_MIN=100;
		//DTO A APLICAR POR VOLUMEN DE COMPRA
		final double DTO_VOLUMEN=10;
		//dto  a aplicar por producto semana
		final double DTO_PROD_SEM=5;
		
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
			
			//si el total es superior al volumen se hace un  descuento
			if (resultado>DTO_MIN){
				dto =resultado * DTO_VOLUMEN/100;
				resultado=resultado-dto;
				}
			//si es el producto de la semana un 5%
			if (producto.equals(PROD_SEMANA)){
				dto=resultado* DTO_PROD_SEM/100;
				resultado=resultado-dto;
			}
			
		//Mostramos el resultado
			System.out.print("Ha cpmprado " + cantidad + " Kg de "+ producto 
					+ ", por " + String.format ("%.2f",resultado) );
	}

}

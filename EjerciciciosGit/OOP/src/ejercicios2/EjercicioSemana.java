package ejercicios2;
import java.util.Scanner;
public class EjercicioSemana {
/*Dato el n�mero del d�a de la semana, que devuelva el texto correspondiente a ese d�a.
D�a de la semana:3
Mi�rcoles*/
	public static void main(String[] args) {
		//Definir las variables
		int numDia;
		String diaSemana="";
		//iniciamos scanner
		Scanner sc=new Scanner(System.in);
		//Pedir numero del dia de la semana
		System.out.println("Dia de la semana: ");
		//Meter el dia por teclado
		numDia=sc.nextInt();

		if ( numDia>=1 && numDia<=7){
		switch (numDia){
			case 1: diaSemana="Lunes";
			break;
			case 2: diaSemana="Martes";
			break;
			case 3: diaSemana="Miercoles";
			break;
			case 4: diaSemana="Jueves";
			break;
			case 5: diaSemana="Viernes";
			break;
			case 6: diaSemana="Sabado";
			break;
			case 7: diaSemana="Domingo";
			break;			 
					}//switch
		System.out.print("El dia de la semana es "+diaSemana);
									}//if
		else {
			 System.out.print("ERROR! El dia de la semana introducido no existe.");
		}

	}

}

package ejercicios2;

	/*La letra del DNI se obtiene dividiendo el número completo de nuestro DNI entre 23
	y al resto de dicha división que deberá estar comprendido entre 0 y 22 se le asigna la
	letra según la equivalencia*/
	import java.util.Scanner;

	public class DNI {

		public static void main(String[] args) {
			//Creamos el objeto Scanner
			Scanner teclado= new Scanner(System.in);
				//Definimos las variables
				String letra;
				String letraDni;
				int dni;
				int restoDni;
				//Pedimos insertar un DNI
				System.out.println("Por favor introduzca los ocho dígitos de su DNI");
				//Se agrega por teclado
					dni=teclado.nextInt();
				//Comprueba si el DNI tiene 8 cifras
				if(dni<10000000 || dni>99999999){
					System.out.println("Por favor introduzca un número de 8 cifras");
				}//if
				else{
						//Pedimos insertar la letra del DNI
						System.out.println("Por favor indique la letra de su DNI");
						//Reseteamos el Scanner para pasarlo a char
							teclado.nextLine();
						//Se agrega por teclado
							letraDni= teclado.nextLine();
						//Pasamos la letra a Mayúscula
					        letraDni=letraDni.toUpperCase();
					
						//Procesamos los datos
						restoDni=dni%23;
						//System.out.print(resultadoDni);
						switch (restoDni){

							case 0: letra="T";
							    break;
							case 1: letra="R";
							    break;
							case 2: letra="W";
							    break;
							case 3: letra="A";
							    break;
							case 4: letra="G";
							    break;
							case 5: letra="M";
							    break;
							case 6: letra="Y";
							    break;
							case 7: letra="F";
							    break;
							case 8: letra="P";
							    break;
							case 9: letra="D";
							    break;
							case 10: letra="X";
							    break;
							case 11: letra="B";
							    break;
							case 12: letra="N ";
							    break;
							case 13: letra="J";
							    break;
							case 14: letra="Z";
							    break;
							case 15: letra="S";
							    break;
							case 16: letra="Q";
							    break;
							case 17: letra="V";
							    break;
							case 18: letra="H";
							    break;
							case 19: letra="L";
							    break;
							case 20: letra="C";
							    break;
							case 21: letra="K";
							    break;
							case 22: letra="E";
							    break;
							default: letra = " FALSO";
						}//switch
								//System.out.println(letra);
							if (letraDni.equals(letra)){
								System.out.println("El DNI con número " + dni + "-" + letraDni +  " es correcto");
							}//if
							else{
								System.out.println("El DNI con número " + dni + "-" + letraDni +  "  es incorrecto");
							}//else
						
						
					}//else
			
			
				
		}

	}



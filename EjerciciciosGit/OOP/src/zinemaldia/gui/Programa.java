package zinemaldia.gui;
import java.util.Scanner;
import zinemaldia.datos.Pelicula;

public class Programa {

	public static void main(String[] args) {
			Scanner teclado= new Scanner(System.in);
			//Crear Película
			Pelicula peli=new Pelicula("");
			String titulo;
			String director;
			int duracion;
			String vista;
			String msg="";
			
			
				//Pedir datos por consola
				//título
					System.out.println("Titulo: ");
					titulo=teclado.nextLine();
				//director
					System.out.println("Director: ");
					director=teclado.nextLine();
				//duracion 
					System.out.println("Duración: ");
					duracion=teclado.nextInt();
				//vista
					System.out.println("Vista: ");
					teclado.nextLine();
					vista=teclado.nextLine();
					if(vista.toLowerCase().equals("si")){
						peli.setVista(true);
					}else{
						peli.setVista(false);
					}
					
					//Asignamos datos introducidos a pelicula
					peli.setTitulo(titulo);
					peli.setDirector(director);
					peli.setDuracion(duracion);
					/////
					if (peli.isVista()==true){
						msg="Si ha sido vista";
					}
					else{
						msg="No ha sido vista";
					}
				//Mostramos
				System.out.println("La película " + peli.getTitulo() + "es del director " 
				+ peli.getDirector() + "y tiene una duración de " + peli.getDuracion() +" minutos "+ 
				"¿Ha sido vista ?" + msg );
	}

}

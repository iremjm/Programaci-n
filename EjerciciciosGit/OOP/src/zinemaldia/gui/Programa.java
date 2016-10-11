package zinemaldia.gui;
import java.util.Scanner;
import zinemaldia.datos.Pelicula;

public class Programa {

	public static void main(String[] args) {
			Scanner teclado= new Scanner(System.in);
			//Crear Película
			Pelicula peli=new Pelicula("Mascotas");
			String titulo;
			String director;
			int duracion;
			boolean vista;
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
					vista=teclado.hasNext();
				//Asignamos datos introducidos a pelicula
					peli.setTitulo(titulo);
					peli.setDirector(director);
					peli.setDuracion(duracion);
					peli.setVisto(vista);
					
				//Mostramos
				System.out.println("La película" + peli.getTitulo() + "es del director" + peli.director. );
	}

}


package zubiri.gui;
import java.util.Scanner;

import zubiri.model.Alumno;
public class ProgramaAlumno {

	public static void main(String[] args) {
		//iniciar scanner
		Scanner teclado= new Scanner(System.in);
		//Crear alumno
		Alumno alum1=new Alumno();
		//
		System.out.print("Alumno: ");
		String nomAlum=teclado.nextLine();		
		alum1.setNombre(nomAlum);
		//
		System.out.print("Asignatura: ");
		String asigAlum=teclado.nextLine();
		alum1.setAsignatura(asigAlum);
		//
		System.out.print("Nota: ");
		double notaAlum=teclado.nextDouble();
		alum1.setNota(notaAlum);
		//
		System.out.println(alum1.getNombre()+" en "+alum1.getAsignatura()+" tienes un "+alum1.getCalificacion());;
			}

}
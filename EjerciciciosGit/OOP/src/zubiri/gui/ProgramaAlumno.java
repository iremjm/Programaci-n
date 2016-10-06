
package zubiri.gui;
import java.util.Scanner;

import zubiri.model.Alumno;
public class ProgramaAlumno {

	public static void main(String[] args) {
		//iniciar scanner
		Scanner teclado= new Scanner(System.in);
		//Crear alumno
		Alumno alumno=new Alumno();
		String nombre;
		String asignatura;
		double nota;
		//Pedir los datos al ususario por consola
		//Alumno
		System.out.print("Alumno: ");
		String nomAlum=teclado.nextLine();		
		//Asignatura
		System.out.print("Asignatura: ");
		String asigAlum=teclado.nextLine();
		//nota
		System.out.print("Nota: ");
		double notaAlum=teclado.nextDouble();
		//Asignarle los datos introducidos al alumno
			alumno.setNombre(nomAlum);
			alumno.setAsignatura(asigAlum);
			alumno.setNota(notaAlum);
		//Mostrar resultado
System.out.println(alumno.getNombre()+" en "+alumno.getAsignatura()+" tienes un "+alumno.getCalificacion());
			}

}
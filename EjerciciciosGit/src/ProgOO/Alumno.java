package ProgOO;

public class Alumno {
	//Aributos 
	String alumno;
	String asignatura;
	double nota;
	public String getNombre() {
		return alumno;
	}
	public void setNombre(String nombre) {
		this.alumno = nombre;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public String getCalifincacion(){
		if (nota>=5){
			return "Aprobado";
		}
		else {
			return "Suspenso";
		}
	}
	//metodos
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	

}

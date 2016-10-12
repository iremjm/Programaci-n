package zinemaldia.datos;

public class Pelicula {
		//Atributos
	private String titulo;
	private String director;
	private int duracion;
	boolean vista;
		//Metodos
		//Metodo constructor
	
		public Pelicula(String string) {
		// TODO Auto-generated constructor stub
	}
	//Metodos getter and setter
			//Peliculas titulo
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
		//Peliculas director
		public String getDirector() {
			return director;
		}
		public void setDirector(String director) {
			this.director = director;
		}	
		//Pel�culas duraci�n
			public int getDuracion() {
			return duracion;
		}
			public void setDuracion(int duracion) {
			this.duracion = duracion;
		}
		//Peliculas vista
			public boolean isVista() {
				return vista;
			}
			public void setVisto(boolean vista) {
				this.visto = vista;
			}
	
			
		
			
		
}

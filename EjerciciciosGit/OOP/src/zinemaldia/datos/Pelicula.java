package zinemaldia.datos;

public class Pelicula {
		//Atributos
	private String titulo;
	private String director;
	private int duracion;
	private boolean vista;
		//Metodos
		//Metodo constructor
	
		public Pelicula() {
			titulo="";
		}
		public Pelicula(String titulo){
			this.titulo=titulo;
			}
		public Pelicula(String titulo, String director, int duracion, boolean visto){
		}
	//Metodos getter and setter
			//Peliculas titulo
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo.substring(1,10);//solo coge un número de carácteres
	}
		//Peliculas director
		public String getDirector() {
			return director;
		}
		public void setDirector(String director) {
			this.director = director;
		}	
		//Pelï¿½culas duraciï¿½n
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
			public void setVista(boolean vista) {
				this.vista = vista;
			}
			
		
			
		
			
		
}

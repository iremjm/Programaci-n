package progOO;

public class Coche {
		//atributos
		String nBAstidor;
		String marca;
		private String matricula;
		public String getnBAstidor() {
	return nBAstidor;
}
public void setnBAstidor(String nBAstidor) {
	this.nBAstidor = nBAstidor;
}
public String getMatricula() {
	return matricula;
}
public void setMatricula(String matricula) {
	this.matricula = matricula;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}

		
		//metodos
	public void arrancar(){
		System.out.println("En Marcha");
	}
	public void girar(String sentido){
		
	}
	public void pitar(int miliSeg){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Coche c1=new Coche();
			c1.matricula="ss2333ax";
			System.out.println(c1.matricula);
			
	}//main

}//class

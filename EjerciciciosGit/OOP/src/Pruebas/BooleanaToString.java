package Pruebas;


public class BooleanaToString {
    public static void main(String[] args) {
        
    	// Método 1: utilizar valueOf () método 
        //de la clase String. 
        boolean boovar = true;
        String str = String.valueOf(boovar);
        if(str="true"){
        System.out.println("Cadena 1 es: "+str);
        }
        
        //método 2: utilizando método toString () 
        //de la clase booleana 
         
        boolean boovar2 = false;
        String str2 = Boolean.toString(boovar2);
        System.out.println("La cadena 2 es: "+str2);
    }
}
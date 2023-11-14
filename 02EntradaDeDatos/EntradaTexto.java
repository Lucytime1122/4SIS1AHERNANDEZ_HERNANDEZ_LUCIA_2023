//debe de tener una clase
//public class      class

//variable int num por defecto es publico  public int num
//import java.io.*; libreria 

//class EntradaTexto{

    //debe de existir un metodo principal
    //public static void main (String[] args){
        //debemos de crear una estructura básica
        //iniciar por una declaración
        //String nombre;
        //declarar mensaje para el usuario
        //System.out.println("por favor ingresa tu nombre: ");
        //ln es salto de linea

        //asignar que operación o comportamiento se otorga a la variable
        //nombre = System.console().readLine();

        //System, es la clase del sistema
        //console() metodo que puede obtener los datos de la consola
        //readLine() metodo que puede dar lectura a los datos introducidos en la consola

        //System.out.println("Hola "+ nombre + "Bienvenido");

    //}   
//}


//class EntradaTexto{

   //public static void main(String[] args){
       // String nombre;
       // System.out.println("por favor ingresa tu nombre:    ");
        
       // nombre = System.console().readLine();

      //  System.out.println("Hola "+ nombre + " Bienvenido");
    //}   
//}

import java.io.*;

class EntradaTexto{

    public static void main(String[] args) throws IOException {
       char nombre;
       System.out.println("por favor ingresa tu nombre:    ");
        
       nombre = (char)System.in.read();

       System.out.println("Hola "+ nombre + " Bienvenido");
    }   
}
/*
Vamos a crear un programa mediante el cual debamos tener un menú de selección 
para elegir alguna de las 14 opciones siguientes:

1.- Bono o descuento por edad
2.- Convertir numeros decimales a binarios
3.- Convertir Temperaturas
4.- Numero de positivos y negativos
5.- Tienda
6.- Area y Perimetro
7.- Tabla
8.- Factorial
9.- Dibujos
10.-Figura Hueca
11. Patron
12.- Diamante
13.- Calculadora
14.- Salir
*/

//Primero se declaran las librerias que se van a ocupar
//java.util sirve para colecciones, comparadores, listas, mapas, etc.
//se debe estructurar el tipo de dato acorde a su entrada
//si es entero obtenerlo como entero, si char obtenerlo como caracter

//import java.util.Scanner;

//class EstructurasControl{

    //metodo principal
    //public static void main(String[] args)
    //el manejo de objetos, nos ayuda a poder instancear, (mandando a llamar al objeto)
    //para hacer una instancia, es necesario:
    //1.- Identificar el ipo de objeto 
    //2.- Nombrar al objeto
    //3.- Crear al objeto
    //Scanner entrada = new Scanner(System.in);
    //crear una instancia del objeto de la entrada por defecto de la computadora
    //vamos a identificar con Scanner el tipo de dato que se esta instanceando
    //entrada es el objeto que va a poder identificar se es int,double,float,etc

    //es declarar a las variables que se van a utilizar en el programa
    //las variables son de dos tipos: globales y locales
    //si la declaro dentro de un metodo es local
    //int opcion,numbinario, total, cantidadproducto,num1;
    //float precio, resultado, compra;
    //String nombreproducto;
    //String binario = "";
    //char letra;

    //do{
        //aqui va todo el programa (menú del programa)
        //System.out.println("Bienvenido al programa");
        //System.out.println("Elige alguna opción deseada: ");
        //System.out.println("1.- Bono o descuento por edad");
        //System.out.println("2.- Convertir numeros decimales a binarios");
        //System.out.println("3.- Convertir Temperaturas");
        //System.out.println("4.- Numero de positivos y negativos");
        //System.out.println("5.- Tienda");
        //System.out.println("6.- Area y Perimetro");
        //System.out.println("7.- Tabla");
        //System.out.println("8.- Factorial");
        //System.out.println("9.- Dibujos");
        //System.out.println("10.-Figura Hueca");
        //System.out.println("11.- Patrones de Codigo");
        //System.out.println("12.- Diamante");
        //System.out.println("13.- Calculadora");
        //System.out.println("14.- Salir");



        //aqui adentro de preguntar
        //System.out.println("Deseas repetir el programa, escribe s para si");
        //vamos a leer el primer caracter de la entrada por defecto de la computadora
        //letra = entrada.nest().charAt(0);

    //}while (letra == 's'|| letra== 'S);
//}


import java.util.Scanner;

class EstructurasControl{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int opcion,numbinario, total, cantidadproducto,num1;
        float precio, resultado, compra;
        String nombreproducto;
        String binario = "";
        char letra;

        do{
            System.out.println("Bienvenido al programa");
            System.out.println("Elige alguna opción deseada: ");
            System.out.println("1.- Bono o descuento por edad");
            System.out.println("2.- Convertir numeros decimales a binarios");
            System.out.println("3.- Convertir Temperaturas");
            System.out.println("4.- Numero de positivos y negativos");
            System.out.println("5.- Tienda");
            System.out.println("6.- Area y Perimetro");
            System.out.println("7.- Tabla");
            System.out.println("8.- Factorial");
            System.out.println("9.- Dibujos");
            System.out.println("10.-Figura Hueca");
            System.out.println("11.- Patrones de Código");
            System.out.println("12.- Diamante");
            System.out.println("13.- Calculadora");
            System.out.println("14.- Salir");

            System.out.println("Deseas repetir el programa, escribe s para si");

            letra = entrada.next().charAt(0);

        }while (letra == 's' || letra== 'S');
    }
}
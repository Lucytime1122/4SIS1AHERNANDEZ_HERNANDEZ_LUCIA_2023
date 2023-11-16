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

        //opcion = entrada.nextInt();

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
        int edad;
        double precioabono = 100.0;
        float precio, resultado, compra = 0;
        String nombreproducto;
        String binario = "";
        String respuesta; 
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

            opcion = entrada.nextInt();

            //menu
            switch(opcion){
                case 1:
                    //Descuento por edad
                    System.out.println("Ingrese su edad: ");
                    edad = entrada.nextInt(); 

                    if(edad > 65){
                        //40% desc mayores de 65 años
                        while (edad > 65){
                         //   if (precioabono *= 0.6;)
                        }
                       // precioabono *= 0.6;

                    } else if (edad < 21) {
                        System.out.println("¿Sus padres son socios? (Sí/No): ");
                        respuesta = entrada.next();
                        if (respuesta.equalsIgnoreCase("Sí")) {
                            //45% desc si los padres son socios
                           // precioabono = 0.55;
                        } else {
                            //25% desc si los padres no son socios
                           // precioabono = 0.75;
                        }

                    }

                    System.out.println("El precio del abono es : $" + precioabono);
                    break;

                case 2:
                    //decimal a binario
                    System.out.println("Ingrese un numero positivo que desee convertir");
                    numbinario = entrada.nextInt();
                    //debe ser positivo
                    if(numbinario > 0){
                        //¿cuantas veces el numero se divide entre 2?
                        while (numbinario > 0){
                            if (numbinario%2 == 0){
                                binario = "0" + binario;
                            }else{
                                binario = "1" + binario;
                            }
                            numbinario = (int)numbinario/2;
                        }

                    }else if(numbinario == 0){
                        binario = "0" + binario;

                    }else{
                        binario = "No se puede convertir un numero negativo, solo positivo";
                    }
                    System.out.println("El numeo binario es: " + binario);
                    break;

                case 3:
                    //Conversion de grados
                    System.out.println("Ingrese la temperatura en grados Fahrenheit: ");
                    
                    break;

                case 4:
                    break;

                case 5:
                    System.out.println("Bienvenido a la tienda Michis");
                    System.out.println("Ingrese la cantidad de productos que desea comprar");
                    total = entrada.nextInt();

                    for(int i = 1; i <=total; i++){
                        System.out.println("Ingrese el nombre del producto: ");
                        nombreproducto = entrada.next();
                        System.out.println("Ingrese el precio: ");
                        precio = entrada.nextFloat();
                        System.out.println("Ingrese la cantidad del producto: ");
                        cantidadproducto = entrada.nextInt();

                        resultado = precio * cantidadproducto;
                        compra = compra + resultado; // compra += resultado
                    }
                    System.out.println("El total de la compra es: " + compra);
                    compra = 0;
                    break;

                case 6:
                    break;

                case 7:
                    break;

                case 8:
                    break;

                case 9:
                    break;

                case 10:
                    break;

                case 11:
                    break;

                case 12:
                    break;

                case 13:
                    break;

                case 14:
                    break;

                default:

                    System.out.println("Elija una opción valida");
            }

            System.out.println("Deseas repetir el programa, escribe s para sí");

            letra = entrada.next().charAt(0);

        }while (letra == 's' || letra== 'S');
    }
}

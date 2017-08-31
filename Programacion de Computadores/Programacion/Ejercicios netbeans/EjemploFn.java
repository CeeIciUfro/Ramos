
package ejemplofn;

import java.util.Random;
import java.util.Scanner;


public class EjemploFn {

    //AQUI VAN LAS FUNCIONES (O METODOS)
    
    //Funcion que entra un arreglo de una dimension int (Parametro int [] A), donde A sera el nombre del arrelgo que entrara y lo ordena por Burbuja.
    public static void burbuja(int [] A){
         int i, j, aux;
         for(i=0;i<A.length-1;i++)
              for(j=0;j<A.length-i-1;j++)
                   if(A[j+1]<A[j]){
                      aux=A[j+1];
                      A[j+1]=A[j];
                      A[j]=aux;
                   }
    }
    
    //misma funcion, pero cambia los parametros, mismo nombre pero otros parametros hacen la diferencia...
    public static void burbuja(int [][]A, int filas, int columnas, int columnaQueInteresaOrdenar){
        for(int i = 0; i < filas-1; i++)
            {
                for(int j = i+1; j < filas; j++)
                {
                    if (A[j][columnaQueInteresaOrdenar] > A[i][columnaQueInteresaOrdenar])
                    {
                        for(int r=0;r<columnas;r++){
                        int tmp = A[i][r];
                        A[i][r] = A[j][r];
                        A[j][r] = tmp;
                        }
                    }
                }
            }
    }
    
    //Funcion que muestra un arreglo de 1 dimension, en este caso no es necesario indicar tamaño del arreglo, para eso sirve .length
    public static void mostrarArreglo1dim(int [] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
    }
    public static void mostrarArreglo1dim(String [] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
    }
    
    //Funcion que muestra un arreglo de 2 dimensiones, aqui no vale usar .length porque tiene diferente tamaño en filas y columnas. Por eso como parametros de entrada
    //va el arreglo de 2 dimensiones, el numero de filas, numero de columnas...
    public static void mostrarArreglo2dim(int [][] a, int filas, int columnas){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    public static void mostrarArreglo2dim(String [][] a, int filas, int columnas){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    //Funcion para llenar un arreglo de 1 dimension, como parametros de entrada el nombre del arreglo de 1 dimension y el nombre del RANDOM. primero int, luego string el arreglo que entra
    public static void llenarArreglo1dim(int [] a, Random r){
        for (int i = 0; i < a.length; i++) {
            a[i]=r.nextInt(10);        
        }
    }
    public static void llenarArreglo1dim(String [] a, Random r){
        String abecedario[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","v","w","x","y","z"};
        for (int i = 0; i < a.length; i++) {
            a[i]=abecedario[r.nextInt(abecedario.length)];
        }
    }
    
    //Funcion para llenar un arreglo de 2 dimensiones, como parametros de entrada el nombre del arreglo de 2 dimension, cantidad de filas, cantidad de columnas y el nombre del RANDOM
    public static void llenarArreglo2dim(int [][] a, int filas, int columnas, Random r){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                a[i][j]=r.nextInt(10);
            }
        }
    }
    
    //Funcion para llenar un arreglo de letras, con letras al azar. Se crea otro arreglo que contiene las letras. 
    public static void llenarArreglo2dim(String [][] a, int filas, int columnas, Random r){
        String abecedario[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","v","w","x","y","z"};
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int random=r.nextInt(abecedario.length);
                a[i][j]=abecedario[random];
            }
        }
    }
    
    //Sumar arreglo de 1 dimension, entrada solo el arreglo de 1 dimension
    public static int sumarArreglo1dim(int [] a){
        int suma=0;
        for (int i = 0; i < a.length; i++) {
              suma=a[i]+suma;      
        }
        return suma;
    }
    
    //calcula el promedio del arreglo de 1 dimension, entra el arreglo y la suma del arreglo que se obtiene de la funcion anterior
    public static double promArreglo1dim(int [] a, int sumaDelArreglo){
        return sumaDelArreglo/a.length;
    }
    
    //Suma arreglo de 2 dimensiones, como entrada es el nombre del arreglo de 2 dimensiones, las filas, las columnas
    public static int sumarArreglo2dim(int [][] a, int filas, int columnas){
        int suma=0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma=a[i][j]+suma; 
            }       
        }
        return suma;
    }
    
    //Calcula el promedio del arreglo de 2 dimensiones, entre el numero de filas, columnas, y la suma que se obtiene del anterior
    public static double promArreglo2dim(int filas, int columnas, int sumaDelArreglo){
        return sumaDelArreglo/(filas*columnas);
    }
    
    
    
    public static void main(String[] args) {
        
        int n=0;
        int p=0;
        int m=0;
        
        //Usando las funciones
        
        //inicializo los "objetos" a utilizar, el scanner se llama "leer", el random "azar"
        Scanner leer = new Scanner(System.in);
         Random azar = new Random();
       
 //-------------------------------------------------------------------------------------------------------------------------      
       //Genero arreglos de 1 dimension, el primero de tamaño 10, el segundo de tamaño n y el tercero es de tipo String (guarda letras) de tamaño 5
        int arr1dim1[] = new int[10];
       do{
        System.out.println("Ingrese tamaño arreglo 2 dimension 1");
        n=leer.nextInt();
       }while(n<1);
        int arr2dim1[] = new int[n];
       
        String arr3dim1[] = new String[5];
       //Fin inicializacion arreglo de 1 dimension
 //------------------------------------------------------------------------------------------------------------------------- 
       //Genero arreglos de 2 dimensiones, el primero de tamaño 10x4, el segundo tamaño m*p y el tercero de tipo String de tamaño 5x5
        int arr1dim2[][] = new int[10][4];
        
        System.out.println("Ingrese tamaño arreglo 2 dimensiones 2");
        while(m<1){
        System.out.println("Filas");
        m=leer.nextInt();
        }
        while(p<1){
        System.out.println("Columnas");
        p=leer.nextInt();
        }
        int arr2dim2[][]= new int[m][p];
        
        String arr3dim2[][] = new String[5][5];
       //Fin inicializacion arreglos de 2 dimensiones 
    //-------------------------------------------------------------------------------------------------------------------------
    
        //Usando las funciones :)
        
      //Primero llenaremos los arreglos de 1 dimension y luego los de 2 dimensiones, vean bien los parametros.
      
        llenarArreglo1dim(arr1dim1, azar);
        llenarArreglo1dim(arr2dim1, azar);
        llenarArreglo1dim(arr3dim1,azar);
        
        llenarArreglo2dim(arr1dim2,10,4,azar);
        llenarArreglo2dim(arr2dim2,m,p,azar);
        llenarArreglo2dim(arr3dim2,5,5,azar);
        
      //Listo, estan llenados aleatoriamente gracias a las funciones.
      
      //Ahora mostraremos cada arreglo...
      System.out.println("ARREGLOS DE 1 DIMENSION");
        mostrarArreglo1dim(arr1dim1);
      System.out.println("");
        mostrarArreglo1dim(arr2dim1);
      System.out.println("");
        mostrarArreglo1dim(arr3dim1);  
      System.out.println("");
      
      System.out.println("ARREGLOS DE 2 DIMENSIONES");
        mostrarArreglo2dim(arr1dim2,10,4);
      System.out.println("");
        mostrarArreglo2dim(arr2dim2,m,p);
      System.out.println("");
         mostrarArreglo2dim(arr3dim2,5,5);
      System.out.println("");
      
      //Listo se mostraron todos.
      
      //Ahora calcular promedio y suma de los arreglos que sean int
      //Como estos retornan, al hacer la funcion devuelve un numero entero, por eso lo guardo en una variable entera para luego trabajarla.
      int suma11=sumarArreglo1dim(arr1dim1);
      int suma12=sumarArreglo1dim(arr2dim1);
      int suma21=sumarArreglo2dim(arr1dim2,10,4);
      int suma22=sumarArreglo2dim(arr2dim2,m,p);
      
      //listo la suma ahora promedio, lo calcula la funcion y devuelve un DOUBLE, asi que lo guardo en un double
      
      double prom11=promArreglo1dim(arr1dim1,suma11);
      double prom12=promArreglo1dim(arr2dim1,suma12);
      double prom21=promArreglo2dim(10,4,suma21);
      double prom22=promArreglo2dim(m,p,suma22);
      
      //listo ahora muestro los resultados
      
      System.out.println("RESULTADOS");
      System.out.println("Suma arreglo 1 dimension 1 = "+suma11+" , Promedio= "+prom11);
      System.out.println("Suma arreglo 2 dimension 1 = "+suma12+" , Promedio= "+prom12);
      System.out.println("Suma arreglo 1 dimension 2 = "+suma21+" , Promedio= "+prom21);
      System.out.println("Suma arreglo 2 dimension 2 = "+suma22+" , Promedio= "+prom22);
      
      //Ahora mostrare el arreglo 1 dimension 1 y el arreglo 2 dimension 1 para luego ordenar y mostrar nuevamente.
      
      System.out.println("ARREGLOS DE 1 DIMENSION SIN ORDENAR");
        mostrarArreglo1dim(arr1dim1);
      System.out.println("");
        mostrarArreglo1dim(arr2dim1);
      System.out.println("");
      
      burbuja(arr1dim1);
      burbuja(arr2dim1);
      
      System.out.println("ARREGLOS DE 1 DIMENSION ORDENADOS");
        mostrarArreglo1dim(arr1dim1);
      System.out.println("");
        mostrarArreglo1dim(arr2dim1);
      System.out.println("");
      //Fin
      
      System.out.println("---------------------------------------------------------------------------");
      
      System.out.println("ARREGLOS DE 2 DIMENSIONES SIN ORDENAR");
        mostrarArreglo2dim(arr1dim2,10,4);
      System.out.println("");
        mostrarArreglo2dim(arr2dim2,m,p);
      System.out.println("");
      
      burbuja(arr1dim2,10,4,0);
      burbuja(arr2dim2,m,p,0);
      
      System.out.println("ARREGLOS DE 2 DIMENSIONES ORDENADOS");
        mostrarArreglo2dim(arr1dim2,10,4);
      System.out.println("");
        mostrarArreglo2dim(arr2dim2,m,p);
      System.out.println("");
      
      //FIN
      
      //Cualquier error me avisan, lo hize a la rapida y no valide todo... practicar!, tomen en cuenta que sin las funciones, hacer el mismo trabajo minimo aumento 
      //x2 la cantidad de lineas...
    }
}

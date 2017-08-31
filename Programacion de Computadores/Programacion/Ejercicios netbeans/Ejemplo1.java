
package ejemplo1;

import java.util.*;

/**
 *
 * @author Flacoloide
 */
public class Ejemplo1 {

   
    public static void main(String[] args) {
        
        int n,opcion;
        int suma=0;
        
        Scanner leer = new Scanner(System.in);
        Random azar = new Random();
        
        try{
            do{
                System.out.println("Ingrese tamaño del arreglo (Mayor a 0)");
                n=leer.nextInt();
            }while(n<=0);
        
            int arreglo[] = new int[n];
            do{
                System.out.println("-----------------------------");
                System.out.println("¿Que desea hacer?");
                System.out.println("1 - Generar Arreglo");
                System.out.println("2 - Mostrar Arrelgo");
                System.out.println("3 - Sumar arreglo");
                System.out.println("0 - Salir");
                do{
                    System.out.println("Ingrese Opcion");
                    opcion=leer.nextInt();
                }while(opcion<0 | opcion>3);

                if(opcion ==1){
                    for (int i = 0; i < n; i++) {
                        arreglo[i]=azar.nextInt(10); 
                    }
                }
                if(opcion ==2){
                    System.out.println("EL ARREGLO ES: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arreglo[i]+"\t");
                    }
                    System.out.println();
                }
                if(opcion ==3){
                    for (int i = 0; i < n; i++) {
                        suma = arreglo[i]+suma;
                    }      
                    System.out.println("SUMA DEL ARREGLO: "+suma);
                }
            }while(opcion !=0);
            
            System.out.println("Adios!");
            
        }catch(Exception e){
            System.out.println("ERROR DE PROGRAMA: ");
                System.out.println("Reiniciando");
                main(args);
        }
        
    }
    
}

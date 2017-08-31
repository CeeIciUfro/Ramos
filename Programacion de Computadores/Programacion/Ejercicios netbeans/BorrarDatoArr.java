
package BorrarDatoArr;

import java.util.Random;
import java.util.Scanner;


public class BorrarDatoArr {

   
    public static void main(String[] args) {

    Scanner leer = new Scanner(System.in);
    Random azar = new Random();
    
        System.out.println("Tamaño del arreglo");
        int n = leer.nextInt();
        
        int arreglo[] = new int[n];
        
        //llenar arreglo
        for (int i = 0; i < n; i++) {
            arreglo[i] = azar.nextInt(10)+1;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i]+"\t");            
        }
        
        System.out.println();
        
        System.out.println("Que posicion quiere eliminar? ");
        
        int pos=leer.nextInt();
        
        arreglo[pos]=0;
        
        
        
        for (int i = pos; i < n; i++) {
            if(i==n-1){
                break;
            }
            arreglo[i]=arreglo[i+1];        
        }
        
        
        for (int i = 0; i < n-1; i++) {
            System.out.print(arreglo[i]+"\t");            
        }
        
        
        
    
    
    
    }
    
}

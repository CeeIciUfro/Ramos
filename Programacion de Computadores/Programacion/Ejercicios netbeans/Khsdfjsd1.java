/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khsdfjsd;
import java.util.Random;
/**
 *
 * @author Fabian
 */
public class Khsdfjsd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random azar = new Random();
        int arr[][] = new int [10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j]= azar.nextInt(10)+1;//llenar natriz con soldados enemigos                
            }
        }
        int a,b,c=0,d=0;
        int cont=0;
        String pos[] = new String[3];
        do{
            a=azar.nextInt(10);
            b=azar.nextInt(10);                        
            if (arr[a][b]!=0) { 
                arr[a][b]=0;
                pos[cont]= a+","+b;
                cont++;
            }                             
        } while (cont<3);
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("");
        }
        int suma[] = new int [3];
        for (int i = 0; i < 3; i++) {
            a=Character.getNumericValue(pos[i].charAt(0));
            b=Character.getNumericValue(pos[i].charAt(2));
            for (int j =-1; j < 2; j++) {
                for (int k =-1; k < 2; k++) {
                    if ((a+j)>=10 || (a+j)<0 ||(b+k)>=10 || (b+k)<0) {
                        continue;
                    }
                    suma[i]+= arr[a+j][b+k];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(suma[i]+"\t");
            System.out.print(pos[i]+"\n");
        }
        int aux=0;
        for (int i = 0; i <3; i++) {
            if (suma[i]>aux) {
               aux=suma[i];
               c=i;
            }
        }        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejlotomult;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author NTK_MDR
 */
public class EjLotoMult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j,k,cantCart,aux,cont;
        Scanner leer = new Scanner(System.in);
        Random azar = new Random();
        
        do{
        System.out.println("Cuantos cartones??");
        cantCart = leer.nextInt();
        }while(cantCart<1);
        
        int matCart[][] = new int [cantCart][7];
        
        for(i=0;i<matCart.length;i++){
            System.out.println("Carton. "+(i+1));
            for(j=0;j<matCart[i].length-1;j++){
                do{
                System.out.println("Ingrese numero "+(j+1));
                aux = leer.nextInt();
                cont=0;
                for(k=0;k<j;k++){
                    if(matCart[i][k]==aux)
                        cont++;
                }
                }while(aux<1 || aux>42 || cont!=0);
                matCart[i][j] = aux;
            }
        }
        
        int cartSorteo[] = new int [6];
        
        for(i=0;i<cartSorteo.length;i++){
            do{
            cont=0;
            aux = azar.nextInt(42)+1;
            for(k=0;k<i;k++){
                if (cartSorteo[k]==aux)
                    cont++;
            }
            }while(cont!=0);
            cartSorteo[i] = aux;
            
        }
        
        System.out.println("Cartones Usuario");
        for(i=0;i<matCart.length;i++){
            for(j=0;j<matCart[i].length;j++)
                System.out.print(matCart[i][j]+"\t");
            System.out.println();
        }
        System.out.println();
        System.out.println("Numeros sorteados");
        for(i=0;i<cartSorteo.length;i++)
            System.out.print(cartSorteo[i]+"\t");
        System.out.println();
        
        //Comparar los numeros
        for(i=0;i<matCart.length;i++){
        cont=0;
        for(j=0;j<matCart[i].length-1;j++)
            for(k=0;k<cartSorteo.length;k++){
                if (matCart[i][j]==cartSorteo[k])
                    cont++;
            }
        matCart[i][6] = cont;
        }
        
        System.out.println("Cartones Usuario");
        for(i=0;i<matCart.length;i++){
            for(j=0;j<matCart[i].length;j++)
                System.out.print(matCart[i][j]+"\t");
            System.out.println();
        }
        System.out.println();
        
        for(i=0;i<matCart.length;i++){
            switch(matCart[i][6]){
                default: System.out.println("Siga Participando"); break;
                case 3: System.out.println("Tienes 3 coincidcencias - Ganaste $ 1.000"); break;
                case 4: System.out.println("Tienes 4 coincidcencias - Ganaste $ 1.000.000"); break;
                case 5: System.out.println("Tienes 5 coincidcencias - Ganaste $ 100.000.000"); break;
                case 6: System.out.println("Tienes 6 coincidcencias - Ganaste $ 1.000.000.000"); break;
                            
            }
                
                
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejlotom10;
import java.util.*;
/**
 *
 * @author NTK_MDR
 */
public class EjLotoM10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        int numU[] = new int[6];
        int numS[] = new int[6];
        int i,j,cont=0;
        
        Scanner leer = new Scanner(System.in);
        Random azar = new Random();
        //Ingreso numeros usuario, validando rango y que no se repitan
        for(i=0;i<6;i++){
            do{
                System.out.println("Ingrese numero "+i);
                numU[i] = leer.nextInt();
            }while(numU[i]<1 || numU[i]>36);
            for(j=0;j<i;j++){
                if (numU[i]==numU[j]){
                    i--;
                }
            }
        }
        
        //Sorteo numeros validando rango y que no se repitan
        for(i=0;i<6;i++){
            numS[i] = azar.nextInt(36) + 1;
            for(j=0;j<i;j++){
                if (numS[i]==numS[j]){
                    i--;
                }
            }
        }
        
        //Comparar vectores
        for(i=0;i<6;i++)
            for(j=0;j<6;j++)
                if (numU[i]==numS[j])
                    cont++;
        
        for(i=0;i<6;i++)
            System.out.print(numU[i]+"-");
        System.out.println();
        for(i=0;i<6;i++)
            System.out.print(numS[i]+"-");
        System.out.println();
        
        //Determinar Premios
        if (cont==6)
            System.out.println("Felicitaciones, tienes "+cont+" puntos");
        else
            if (cont<6)
                System.out.println("Perdiste, tienes "+cont+" puntos");
        
    }
    
}

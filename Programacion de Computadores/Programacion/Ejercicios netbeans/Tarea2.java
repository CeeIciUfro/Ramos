/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Flacoloide
 */
public class Tarea2{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[] = new int[10];
        int primo=0;
        int cantidadPrimos=0;
        Random azar = new Random();
        Scanner leer = new Scanner(System.in);
        int b=0,cont,i;
        float prom,suma=0;
        int g=0;
        int f=0;
        
        
        for(cont=0;cont<arreglo.length;cont++){
             arreglo[cont] = azar.nextInt(10) + 1;
        }
        
        cont=0;
        while (cont<arreglo.length){
            System.out.print(arreglo[cont]+"-");
            cont++;
        }
        System.out.println("");
        for(i=0;i<arreglo.length;i++)
            suma = suma + arreglo[i];
        prom = suma/arreglo.length;
        System.out.println("Promedio: "+prom);
        
        int varMayor = 0;
        for(i=0;i<arreglo.length;i++)
            if (arreglo[i]>varMayor)
                varMayor = arreglo[i];
        System.out.println("Mayor: "+varMayor);
        
        cont=0;
        System.out.println("Ingrese numero");
        int num = leer.nextInt();
        for(i=0;i<arreglo.length;i++)
            if (arreglo[i]==num)
                cont++;
        System.out.println("Coincidencias: "+cont);
    
        System.out.println("");
    
        for(i=0;i<arreglo.length;i=i+2)
            System.out.print(arreglo[i]+"-");
        
//Desde aqui empieza lo que hicimos

        int arregloPar[] = new int[10];
        int arregloImpar[] = new int[10];
        
        //for para buscar numeros primos, si la cantidad de divisores es==2 entonces se suma al acumulador
        for (int j = 0; j < 10; j++) {
            primo=0;
            for (int k = 1; k <= arreglo[j]; k++) {
                if(arreglo[j]%k==0){
                    primo++;        
                }
            }
            if(primo==2){
                cantidadPrimos++;
            }
            
        }
        System.out.println("");
        System.out.println("Se encontraron "+cantidadPrimos+ " Numeros Primos"); //muestro acumulador
        
        //para dejar en arreglo numero par, y numero impar en otro arreglo
        for (int j = 0; j < 10; j++) {
            if(arreglo[j]%2==0){
                arregloPar[g]=arreglo[j];
                g++;
            }else{
                arregloImpar[f]=arreglo[j];
                f++;
            }
        }
        
        
        //mostrar arreglos
        
        for (int j = 0; j < g; j++) {
         System.out.print(arregloPar[j]+"-");
        }
            System.out.println("");
        for (int j = 0; j <f; j++) {
         System.out.print(arregloImpar[j]+"-");
        }
        
        
}
}
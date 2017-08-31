
package tareadelmartes;

import java.util.Random;
import java.util.Scanner;


public class TareaDelMartes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
            
            
		int p=0, k=0, i=0, j=0;                                         //Inicializacion contadores
                int primo=0;                                                    
                int sumaPrimos=0;                                               //Inicializacion de acomulador
	try{	//Try, catch para controlar un eventual error de java O excepcion
            
		Scanner leer = new Scanner(System.in);                          //Para leer datos
		Random azar = new Random();                                     //Para obtener un numero random
		
		
		System.out.println("Ingrese tamaño arreglo 1");                 //
		int n=leer.nextInt();                                           ///-Leer tamaño de arreglos
		System.out.println("Ingrese tamaño arreglo 2");                 ///-
		int m=leer.nextInt();                                           //
		
		int arreglo1[] = new int[n];                                    //Inicializar arreglo con tamaño leido
		int arreglo2[] = new int[m];                                    // ..
		
		for (i = 0; i < n; i++) {                                       //
			arreglo1[i] = azar.nextInt(100)+1;                      ///
		}                                                               ////
                                                                                     // Llenar arreglo con numeros entre 1-100       
		for (i = 0; i < m; i++) {                                       ////
			arreglo2[i] = azar.nextInt(100)+1;                      //
		}
		
		for (i = 0; i < n; i++) {                                       //Mostrar arreglo
			System.out.print(arreglo1[i]+"\t");
		}
                
		System.out.println();
                
		for (i = 0; i < m; i++) {                                       //Mostrar arreglo
			System.out.print(arreglo2[i]+"\t");
		}
		        
		int arreglo3[] = new int[n+m];                                  //Inicializacion arreglo3 con suma de tamaños de arreglo1 y 2
		
		for (i = 0; i < arreglo3.length; i++) {                         //Intercalar
			if(i%2==0 & p<n){                                       
			arreglo3[i] = arreglo1[p];                              
			p++;
			}else if (k<m){                                         
				arreglo3[i] = arreglo2[k];
				k++;
			}else if (i%2!=0){
				arreglo3[i] = arreglo1[p];
                                p++;
			}
		}                                                               //
		
		System.out.println();
		for (i = 0; i < arreglo3.length; i++) {                         //Mostrar arreglo3 (intercalado)
			System.out.print(arreglo3[i]+"\t");
		}
		
                
                for(i = 0; i < (arreglo3.length/2) - 1; i++){                   //Ordenar mitad de arreglo3 mayor a menor
                    for(j = 0; j < (arreglo3.length/2) - 1; j++){
                        if (arreglo3[j] < arreglo3[j + 1]){
                            int tmp = arreglo3[j+1];
                            arreglo3[j+1] = arreglo3[j];
                            arreglo3[j] = tmp;
                        }
                    }
                }
                for(i = arreglo3.length/2; i < arreglo3.length - 1; i++){       //Ordenar 2da mitad arreglo3 menor a mayor
                    for(j = arreglo3.length/2; j < arreglo3.length - 1; j++){
                        if (arreglo3[j] > arreglo3[j + 1]){
                            int tmp = arreglo3[j+1];
                            arreglo3[j+1] = arreglo3[j];
                            arreglo3[j] = tmp;
                        }
                    }
                }
		
		System.out.println();
                
		for (i = 0; i < arreglo3.length; i++) {                         //Mostrar arreglo ordenado
			System.out.print(arreglo3[i]+"\t");
		}
                
                System.out.println("");
                
                
                for (i = 0; i < arreglo3.length; i++) {                         //Encontrar numeros primos y sumar cuando encuentre al acomulador
                    primo=0;
                    for(int g = arreglo3[i] ; g>0 ; g--){                       
                        if(arreglo3[i]%g==0){
                         primo++;
                        }
                    }
                    if(primo==2){           
                        sumaPrimos=arreglo3[i]+sumaPrimos;
                        System.out.println("Es primo "+arreglo3[i]);
                    }
                }
                
                System.out.println("La suma de los numeros primos es: "+sumaPrimos);    //Mostrar suma
		
        }catch(Exception e){
            System.out.println("ERROR DE PROGRAMA......... SE CERRARA!");
        }
		
	}

}

//Escriba un programa que compute sus iniciales a partir de su nombre completo y las despliegue.

public class Ejercicio2 {

  public static void main(String[] args) {
  
    String nombre = args[0];
    String[] palabras = nombre.trim().split(" ");
    String iniciales = "";
    
    for(String palabra : palabras) {
      iniciales += palabra.charAt(0);
    } 
    
    System.out.println(iniciales);
  }
}
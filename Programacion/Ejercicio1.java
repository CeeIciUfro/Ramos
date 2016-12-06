// Escribir un programa que lea una frase y a continuación visualice cada palabra de la frase una debajo de otra, seguida cada palabra del número de letras que compone cada palabra.

public class Ejercicio1 {

  public static void main(String[] args) {
  
    String frase = args[0];
    String[] palabras = frase.trim().split(" ");
    for(String palabra : palabras) {
      System.out.println(palabra + " (" + palabra.length() + ")");
    } 
  }
}
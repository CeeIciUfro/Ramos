// Escriba un programa que reciba dos palabras e indique el prefijo
// en común entre ellas.
// 
// Ejemplo:
// 
// * Palabra 1: establecimiento
// * Palabra 2: estadio
// * Prefijo en común: esta

public class Ejercicio5 {

  public static void main(String args[]) {
  
    String palabra1 = args[0];
    String palabra2 = args[1];
    String prefijo = "";

    if (palabra1.length() < palabra2.length()) {
      String temporal = palabra1;
      palabra1 = palabra2;
      palabra2 = temporal;
    }

    for (int i = 0; i < palabra2.length(); i++) {
      if (palabra1.toLowerCase().charAt(i) == palabra2.toLowerCase().charAt(i))
	prefijo = prefijo + palabra1.charAt(i);
      else
	break;
    }

    if (prefijo.length() == 0)
      System.out.println("No hay prefijo en común.");
    else
      System.out.println("Prefijo en común: " + prefijo);
  }
}
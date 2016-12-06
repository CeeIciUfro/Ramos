// Escriba un programa que reciba una palabra e indique si es palíndrome.

public class Ejercicio3 {

  public static void main(String args[]) {
  
    String palabra = args[0];
    boolean esPalindrome = true;

    for (int i = 0, j = palabra.length() - 1; i < palabra.length() / 2 && esPalindrome; i++, j--) {
      if (palabra.charAt(i) != palabra.charAt(j))
	esPalindrome = false;
    }
    
    if (esPalindrome)
      System.out.println("La palabra es palíndrome.");
    else
      System.out.println("La palabra NO es palíndrome.");
  }
}

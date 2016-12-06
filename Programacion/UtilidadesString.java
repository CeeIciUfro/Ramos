// Escriba una clase en Java llamada UtilidadesString, la que debe contener
// los siguientes métodos:
// 
// * rotar(): Rota una palabra. Por ejemplo "auto" queda "otua".
// 
// * palindromizar(): Ocupa una palabra para crear un palíndrome.
//   Por ejemplo, "auto" queda "autotua".
// 
// * destacar(): busca una palabra dentro de un texto y la marque con un "_".
//   Por ejemplo "auto" en "Habían muchos autos" queda "Habian muchos _autos".
// 
// * contar(): Cuenta la cantidad de ocurrencias de una palabra en un texto.
//   Por ejemplo, "hola" en "El gato decía hola muchas veces al dia, hola", retorna 2.
// 
// Luego, escriba un programa llamado Utilidades.java que instancie la clase
// anteriormente mencionada y permita al usuario utilizar sus métodos. Utilice
// diálogos gráficos para la interacción con el usuario.


public class UtilidadesString {

  public static String rotar(String palabra) {
    String rotada = "";
    for (int i = palabra.length() - 1; i >= 0; i--)
      rotada = rotada + palabra.charAt(i);
    return rotada;
  }
  
  public static String palindromizar(String palabra) {
    String palindrome = palabra;
    for (int i = palabra.length() - 2; i >= 0; i--)
      palindrome = palindrome + palabra.charAt(i);
    return palindrome;
  }
  
  public static String destacar(String frase, String palabra) {
    String fraseNueva = "";
    String[] segmentos = frase.split(palabra);
    if (segmentos.length > 1) {
      for (String segmento : segmentos)
	fraseNueva = fraseNueva + "_" + palabra + " " + segmento.trim();
      return fraseNueva;
    } else {
      return frase;
    }	
  }
  
  public static int contar(String frase, String palabra) {
    int cantidad = 0;
    int posicion = 0;
    do {
      posicion = frase.indexOf(palabra, posicion);
      if (posicion != -1) {
	cantidad++;
	posicion = posicion + palabra.length() + 1;
      }
    } while (posicion != -1);
    return cantidad;
  }
}

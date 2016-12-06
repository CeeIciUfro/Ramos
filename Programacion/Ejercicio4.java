// Escriba un programa que reciba un número de 1, 2 o 3 dígitos
// y lo transforme a un número pronunciable.
//
// Ejemplos:
//
//   8 -> "ocho"
//  45 -> "cuarenta y cinco"
// 167 -> "ciento sesenta y siete"
// 715 -> "setecientes diez y cinco" (imperfecto pero aceptable)


public class Ejercicio4 {

  public static void main(String[] args) {
  
    String strNumero = args[0];
    String strNumeroInvertido = "";
    String unidadPronunciable = "";
    String decenaPronunciable = "";
    String centenaPronunciable = "";
    String numeroPronunciable = "";
    
    for(int i = strNumero.length() - 1; i >= 0; i--)
      strNumeroInvertido = strNumeroInvertido + strNumero.charAt(i);

    if (strNumeroInvertido.length() >= 1) {
      char unidad = strNumeroInvertido.charAt(0);
      switch (unidad) {
	case '1': unidadPronunciable = "uno";
		  break;
	case '2': unidadPronunciable = "dos";
		  break;
	case '3': unidadPronunciable = "tres";
		  break;
	case '4': unidadPronunciable = "cuatro";
		  break;
	case '5': unidadPronunciable = "cinco";
		  break;
	case '6': unidadPronunciable = "seis";
		  break;
	case '7': unidadPronunciable = "siete";
		  break;
	case '8': unidadPronunciable = "ocho";
		  break;
	case '9': unidadPronunciable = "nueve";
		  break;
	case '0': break;
	}
    }
    
    if (strNumeroInvertido.length() >= 2) {
      char decena = strNumeroInvertido.charAt(1);
      switch (decena) {
	case '1': decenaPronunciable = "diez y ";
		  break;
	case '2': decenaPronunciable = "veinte y ";
		  break;
	case '3': decenaPronunciable = "treinta y ";
		  break;
	case '4': decenaPronunciable = "cuarenta y ";
		  break;
	case '5': decenaPronunciable = "cincuenta y ";
		  break;
	case '6': decenaPronunciable = "sesenta y ";
		  break;
	case '7': decenaPronunciable = "setenta y ";
		  break;
	case '8': decenaPronunciable = "ochenta y ";
		  break;
	case '9': decenaPronunciable = "noventa y ";
		  break;
	case '0': break;
	}
    }
    
    if (strNumeroInvertido.length() >= 3) {
      char centena = strNumeroInvertido.charAt(2);
      switch (centena) {
	case '1': centenaPronunciable = "ciento ";
		  break;
	case '2': centenaPronunciable = "doscientos ";
		  break;
	case '3': centenaPronunciable = "trescientos ";
		  break;
	case '4': centenaPronunciable = "cuatrocientos ";
		  break;
	case '5': centenaPronunciable = "quinientos ";
		  break;
	case '6': centenaPronunciable = "seiscientos ";
		  break;
	case '7': centenaPronunciable = "setecientos ";
		  break;
	case '8': centenaPronunciable = "ochocientos ";
		  break;
	case '9': centenaPronunciable = "novecientos ";
		  break;
	case '0': break;
	}
    }

    numeroPronunciable = centenaPronunciable + decenaPronunciable + unidadPronunciable;
    System.out.println(numeroPronunciable);
  }
}
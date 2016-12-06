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


public class Utilidades {

  public static void main(String[] args) {
  
    UtilidadesString util = new UtilidadesString();
    System.out.println(util.rotar("hola"));
    System.out.println(util.palindromizar("hola"));
    System.out.println(util.destacar("hola hola a todos hola", "hola"));
    System.out.println(util.contar("kiu hola hola a todos hola chao ", "hola"));
  }

}

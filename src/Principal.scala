import scala.io.StdIn._

object Principal {
  def main(args: Array[String]): Unit = {

    print("\n\tOPERACIONES BASICAS CON FUNCIONES\nIngrese un numero: ")
    var num = readInt()

    var estimacion:Double = (num/2).toInt

    var raiz = 0.0
    var promedioBase = 0.0
    var promedioSecundario = 0.0
    var i = 0;
    var iteraciones = 0;

    while (i != 1) {
      iteraciones = iteraciones + 1;
      promedioSecundario = promedioBase
      raiz = num / estimacion
      promedioBase = (raiz + estimacion)/2
      estimacion = promedioBase
      if(promedioSecundario == promedioBase){
        i=1
      }
    }

    printf("Resultado de la raiz: "+raiz+" . Numero de interaciones: "+iteraciones+".\n")

  }
}

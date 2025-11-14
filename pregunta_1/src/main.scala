
/*Problema 1*/

object Estadistica:

def myMethod(datos: List[Double]): Double =
val promedio = datos.sum / datos.size
val sumaCuadrados = datos.map(x => math.pow(x - promedio, 2)).sum
math.sqrt(sumaCuadrados / datos.size)

/*Problema 2*/

object TransformacionCalificaciones:

def transformar(calificaciones: List[Double], politica: Double => Double): List[Double] =
  calificaciones.map(politica)

val redondear: Double => Double =
  x => math.round(x).toDouble

val bonificar: Double => Double =
  x => x + 0.5

val penalizarAltas: Double => Double =
  x => if x > 9.0 then x - 0.3 else x


/*Problema 3*/

object GeneradorSaludo:

def generadorSaludo(fraseBase: String): String => String =
  (nombre: String) => s"$fraseBase, $nombre!"

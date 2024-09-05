package org.spontime.euridice
import scala.io.StdIn
import scala.util.{Try, Success, Failure}

@main
def main(): Unit = {
  println("Hola! como te llamas?")
  val nombre = StdIn.readLine()
  println(s"¡Hola, $nombre!")
  println("Cuentame, quisieras convertir tu peso en el que tendrias en marte?")
  var quiereConvertir: String = StdIn.readLine()
  var intentosRestantes: Int = 3

  while (quiereConvertir.toLowerCase != "si" && intentosRestantes > 0) {
    intentosRestantes -= 1
    println(s"$nombre, vale, pues entiendo que no quieras.")
    if (intentosRestantes > 0) {
      println("¿Cambiaste de opinión? (sí/no)")
      quiereConvertir = StdIn.readLine()
    } else {
      println(s"$nombre, no te entiendo, pero no te preocupes, no pasa nada, hablamos luego.")
    }
  }

  if (quiereConvertir.toLowerCase == "si") {
    println(s"$nombre, perfecto, vamos a calcularlo.")
    println("¿Cuánto pesas en la Tierra? (en kg)")

    val pesoTierra = Try(StdIn.readDouble()) match {
      case Success(peso) => peso
      case Failure(_) =>
        println("Por favor, ingresa un número válido para tu peso.")
        return // Salir del programa si la entrada es inválida
    }

    val pesoMarte: Double = pesoTierra * 0.38
    println(s"Tu peso en Marte sería de $pesoMarte kg.")
  }
}
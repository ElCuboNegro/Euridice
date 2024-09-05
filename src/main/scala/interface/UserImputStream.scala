package org.spontime.euridice
package interface
import scala.util.{Failure, Success, Try}
class UserImputStream extends UserEntry {

  import scala.io.StdIn

  def readLine(): String = StdIn.readLine()

  def readDouble(): Double = {
    Try(StdIn.readDouble()) match {
      case Success(value) => value: Double
      case Failure(_) =>
        println("Entrada inválida. Por favor, ingresa un número.")
        readDouble() // Recursividad para volver a intentar la lectura
    }
  }
  def readInt(): Int = {
    Try(StdIn.readInt()) match {
      case Success(valor) => valor
      case Failure(_) =>
        println("Entrada inválida. Por favor, ingresa un número entero.")
        readInt() // Recursividad para volver a intentar la lectura
    }
  }
}
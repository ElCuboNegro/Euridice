package org.spontime.euridice
package controller

import interface.UserImputStream
import models.Planet

import scala.util.{Success, Try}

class PlanetSelector (planetsProvider: PlanetsProvider){
  def getSelectedPlanet: Planet = {
    var userEntryStream = new UserImputStream()

    val planets = planetsProvider.getPlanets()
    planets.zipWithIndex.foreach { case (planet, i) => println(s"${i + 1}. ${planet.name}") }
    println("Seleccione un planeta:")

    val userSelection = userEntryStream.readInt()
    Try(userSelection - 1) match {
      case Success(index) if index >= 0 && index < planets.size => planets(index)
      case _ =>
        println("Opción inválida. Saliendo...")
        throw new IllegalArgumentException("Opción de planeta inválida")
    }
  }
}
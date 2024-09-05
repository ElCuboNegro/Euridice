package org.spontime.euridice
package interface
import controller.PlanetSelector
import controller.PlanetsProvider
class WeightConversor(calculator: WeightCalculator, planetsProvider: PlanetsProvider, userEntry: UserEntry) {
  def convertWeight(): Double = {
    println("Introduce tu peso en la Tierra:")
    val earthWeight = userEntry.readDouble()
    println("Selecciona un planeta:")
    val planetSelector = new PlanetSelector(planetsProvider)
    val planet = planetSelector.getSelectedPlanet
    val planetWeight = calculator.resolveOtherPlanetWeight(earthWeight, planet)
    println(s"Tu peso en ${planet.name} sería de $planetWeight kg")
    planetWeight
  }
}

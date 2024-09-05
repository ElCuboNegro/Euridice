package org.spontime.euridice

import interface.{UserImputStream, WeightConversor, WeightCalculator}
import controller.{DefaultPlanetsProvider, PlanetSelector, PlanetsProvider}

object euridice {
  def main(args: Array[String]): Unit = { // Cambiamos el retorno a Unit, ya que no devolvemos ningún valor
    val input_stream: UserImputStream = new UserImputStream
    val planetsProvider: PlanetsProvider = new DefaultPlanetsProvider
    val calculator: WeightCalculator = new WeightCalculator
    val weightConversor: WeightConversor = new WeightConversor(calculator, planetsProvider , input_stream)

    weightConversor.convertWeight()
  }
}
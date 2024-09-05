package org.spontime.euridice
package controller

class DefaultPlanetsProvider extends PlanetsProvider {
  def getPlanets(): List[models.Planet] = {
    List(
      models.Planet("Mercurio", 0.38),
      models.Planet("Venus", 0.91),
      models.Planet("Tierra", 1.0),
      models.Planet("Marte", 0.38),
      models.Planet("Júpiter", 2.34),
      models.Planet("Saturno", 1.06),
      models.Planet("Urano", 0.92),
      models.Planet("Neptuno", 1.19)
    )
  }
}
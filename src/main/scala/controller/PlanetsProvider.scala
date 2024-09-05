package org.spontime.euridice
package controller

trait PlanetsProvider {
  def getPlanets(): List[models.Planet]
}
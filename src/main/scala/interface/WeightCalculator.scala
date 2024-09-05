package org.spontime.euridice
package interface

import models.Planet

class WeightCalculator {
  def resolveOtherPlanetWeight(earthWeight: Double, planet: Planet): Double = {
    earthWeight * planet.relativeGravity
  }
}

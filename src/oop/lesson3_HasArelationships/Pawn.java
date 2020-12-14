package oop.lesson3_HasArelationships;

import oop.lesson3_HasArelationships.*;

class Pawn {

  private String colour;
  private boolean isOnHome;

  public Pawn(String theColour, boolean isHome) {
    colour = theColour;
    isOnHome = isHome;
  }

  public String getColour() {
    return colour;
  }

  public boolean getHome() {
    return isOnHome;
  }

  public String toString() {
    if (isOnHome) return "A " + colour + " pawn that is on home";
    return "A " + colour + " pawn that is not on home";
  }

}
package oop.lesson3_HasArelationships;

import oop.lesson3_HasArelationships.*;

public class Board {

  private double cost;
  private Pawn pawn;

  public Board(double theCost, Pawn thePawn) {
    cost = theCost;
    pawn = thePawn;
  } 

  public Pawn getPawn() {
    return pawn;
  }

}
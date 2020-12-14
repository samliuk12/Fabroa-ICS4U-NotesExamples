package oop.lesson3_HasArelationships;

import oop.lesson3_HasArelationships.*;

public class Test {

  public static void main(String[] args) {

    Board b;
    b = new Board(24, new Pawn("white", true));
    System.out.println(b.getPawn().getColour());

  }

}
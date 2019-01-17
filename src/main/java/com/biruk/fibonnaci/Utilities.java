package com.biruk.fibonnaci;
/**
 * This is an abstract class Utilities, which holds method
 * getChoiceFromConsole which is used heavily throughout
 * the program
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Utilities {

  /**
   * the method reads what was put in the console and returns it
   *It also checks if there isn't a mismatch
   * @return i
   */
  public int getChoiceFromConsole() {
    int i = 0;
    try {
      i = new Scanner(System.in).nextInt();
    }
    catch (InputMismatchException e){
      System.out.println("The data is incorrect, please try again\n");
      i = getChoiceFromConsole();
    }
    return i;
  }
}

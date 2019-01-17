package com.biruk.fibonnaci;

/**
 * This class is the menu of my program, which has options which the
 * user can choose
 */
public class Menu extends Utilities{

  public void runMenu() {

    System.out.println("Welcome to my program, how would you like to proceed? ");
    while (true) {
      showTip();
      startFunctionBy(getChoiceFromConsole());
    }
  }

  /**
   *  showTip is the method which prints the choices
   */
  private void showTip() {

    System.out.println("\n"
        + "Press 1 to execute the Fibonacci task.\n"
        + "Press 2 to execute the task with Odd and Even Numbers.\n"
        + "Press 0 to finish the program");
  }

  /**
   * This is where different choices are taken into consideration
   * and executed
   * @param choice
   */
  private void startFunctionBy(int choice) {
    switch (choice) {
      case 1:
        FibonacciOperations fibonacci = new FibonacciOperations();
        break;
      case 2:
        OddAndEvenNumbers numbers = new OddAndEvenNumbers();
        break;
      case 0:
        System.exit(1);
        break;
      default:
        System.out.println("The data is incorrect, please try again.");
        startFunctionBy(getChoiceFromConsole());
        break;
    }

  }
}

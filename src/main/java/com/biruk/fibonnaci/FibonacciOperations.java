package com.biruk.fibonnaci;

import java.util.ArrayList;
import java.util.List;


/**
 * This class is used for operations with the Fibonacci numbers
 * which contains 3 methods to perform the task
 */
public final class FibonacciOperations extends Utilities {

  final private List<Integer> fibonacciNumbers;

  /**
   * This the constructor, in which i call upon my methods
   */
  public FibonacciOperations() {
    this.fibonacciNumbers = new ArrayList<Integer>();
    generateFibonacci();
    showLargestOddAndEven();
    showPercentageOddAndEven();
  }

  /**
   * In this method we generate the row and print it out
   */
  private void generateFibonacci() {

    System.out.println("Your number: ");
    int maxNumber = getChoiceFromConsole();
    int previousNumber = 0;
    int nextNumber = 1;

    System.out.print("Fibonacci Series of " + maxNumber + " numbers:");

    for (int i = 1; i <= maxNumber; ++i) {
      fibonacciNumbers.add(previousNumber);

      int sum = previousNumber + nextNumber;
      previousNumber = nextNumber;
      nextNumber = sum;

    }
    System.out.println(fibonacciNumbers);
  }

  /**
   * This method goes through the numbers, and searches for the largest
   * odd and even in the row
   * We already know that one of those numbers will be at the end of the row
   * so we start from there
   */
  private void showLargestOddAndEven() {
    boolean checkOdd = false;
    boolean checkEven = false;
    for (int i = fibonacciNumbers.size()-1; i > 0; i--) {
      Integer oddNow = fibonacciNumbers.get(i);
      if(!checkOdd && oddNow % 2 == 0){
        checkOdd = true;
        System.out.println(oddNow);
      }
      if(!checkEven && fibonacciNumbers.get(i) % 2 != 0){
        checkEven = true;
        System.out.println(fibonacciNumbers.get(i));
      }
    }
  }

  /**
   * This method counts how many odd and even numbers there are
   * and then calculates the percentage of them
   */
  private void showPercentageOddAndEven(){
    int countOdd = 0;
    int countEven = 0;
    for (int i = fibonacciNumbers.size()-1; i > 0; i--) {
      Integer now = fibonacciNumbers.get(i);
      if(now % 2 == 0){
        countOdd++;
      }
      if(now % 2 != 0){
        countEven++;
      }
    }
    System.out.println(countOdd+ " - biggest odd number."+ countEven+ " - biggest even.");
    System.out.println((countOdd*100)/fibonacciNumbers.size()+"% - of odd.");
    System.out.println((countEven*100)/fibonacciNumbers.size()+"% - of even.");
  }
}

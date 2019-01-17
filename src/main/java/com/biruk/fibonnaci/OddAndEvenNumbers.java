package com.biruk.fibonnaci;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used for operations with the Odd and Even numbers
 */
public class OddAndEvenNumbers extends Utilities{
  final private List<Integer> oddAndEvenNumbers;

  public OddAndEvenNumbers() {

    this.oddAndEvenNumbers = new ArrayList<Integer>();
    generateInterval(
        getIntervalPoint("Enter the beginning of the interval:"),
        getIntervalPoint("Enter the end of the interval:")
    );
    sortOddAndEvenNumbers();
  }
  private int getIntervalPoint(String message){
    System.out.println(message);
    return getChoiceFromConsole();
  }

  /**
   * This method is used to generate the interval
   * @param beginning
   * @param end
   */
  private void generateInterval(int beginning, int end){
    for (int i = beginning; i < end; i++) {
      oddAndEvenNumbers.add(i);
    }
  }

  /**
   * This method is a bit harsh because this is where i did all the operations
   * with my numbers
   */
  private void sortOddAndEvenNumbers(){
    int sumOdd = 0;
    int sumEven = 0;
    List<Integer> evenList = new ArrayList<Integer>();
    List<Integer> oddList = new ArrayList<Integer>();
    for (int i = 0; i < oddAndEvenNumbers.size(); i++) {
      Integer x = oddAndEvenNumbers.get(i);
      if( x % 2 == 0){
        evenList.add(x);
        sumEven += x;
      }
      if(x % 2 != 0){
        oddList.add(x);
        sumOdd += x;
      }
    }
    System.out.println("Sum of odd = " +sumOdd);
    System.out.println("Sum of even = " +sumEven);
    System.out.println(oddList);
    evenList.stream().sorted((a,b)-> b-a).forEach(System.out::println);

  }
}

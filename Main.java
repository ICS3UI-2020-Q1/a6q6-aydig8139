import java.util.Scanner;

/**
 * Fibonacci sequence
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create new scanner for user input
    Scanner input = new Scanner(System.in);

    //ask user for a number and declare a avriable to store that number
    System.out.println("What Fibonacci number would you like to find");
    int userNum = input.nextInt();

    //create an array to store the fibonacci numbers
    int[] fibNum = new int[userNum];

    //initialize the first and second fibonacci numbers so the code can use those to subtract from and calculate the rest of the sequence
    fibNum[0] = 1;
    fibNum[1] = 1;

    //create a for loop to determine the fibonacci sequence. initialize the variable i to start from 2 since 0 and 1 are given above
    for(int i = 2; i < userNum; i++){

      //write the formula to calculate the value of a number in the fibonacci sequence
      fibNum[i] = fibNum[i-1] + fibNum[i-2];
      
    } 

    //tell user the answer
    System.out.println("The " + userNum + "th Fibonacci number is " + fibNum[userNum - 1]);
  }
}

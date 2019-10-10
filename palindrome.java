import java.util.Scanner;

public class palindrome{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Boolean yesNo = false;
    String input;
    int inputLength;
    String reverseInput;
    //ASKS USER FOR INPUTS
    System.out.println("Would you like to enter a palindrome? (enter yes or no)");
    input = scan.nextLine();
    if(input.equals("yes")){
      System.out.println("What is your palindrome?");
      input = scan.nextLine();
    }else{
      System.out.println("oki bye bye.");
    }
    //SETS INPUT TO LOWERCASE
    input = input.toLowerCase();
    inputLength = input.length();
    System.out.println(inputLength);
    //REVERSES INPUT
    //reverseInput =
  }
}

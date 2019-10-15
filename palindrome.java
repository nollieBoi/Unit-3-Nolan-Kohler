import java.util.Scanner;

public class palindrome{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Boolean yesNo = false;
    String input;
    String reverseInput = "";
    //ASKS USER FOR INPUTS
    System.out.println("Would you like to enter a palindrome? (enter yes or no)");
    input = scan.nextLine();
    if(input.equals("yes")){
      System.out.println("What is your palindrome?");
      yesNo = true;
      input = scan.nextLine();
    }else{
      System.out.println("oki bye bye.");
    }
    //SETS INPUT TO LOWERCASE
    input = input.toLowerCase();
    input = input.replaceAll(" ", "");
    input = input.replaceAll(",", "");
    //REVERSES INPUT
   if(yesNo == true){
    for(int i = input.length() - 1; i >= 0; i--){
      reverseInput = reverseInput + input.charAt(i);
    }
    if(input.compareTo(reverseInput) == 0){
      System.out.println("This is a palindrome: " + input);
    }else{
      System.out.println("This is not a palindrome: " + input);
    }
  }
}
}

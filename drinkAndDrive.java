import java.util.Scanner;

public class drinkAndDrive{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int age;
    System.out.println("What is your age?");
    age = scan.nextInt();
    if(age >= 17){
      if(age >= 21){
        System.out.println("You are old enough to drink and drive!");
      }else{
        System.out.println("You are old enough to drive, but not drink");

      }
    }else{
      System.out.println("You are not old enough to drink or drive!");
    }
    }
  }

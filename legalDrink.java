import java.util.Scanner;

public class legalDrink{
  public static void main(String[] args){
    int age;
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your age?");
    age = scan.nextInt();
    if(age >= 21){
      System.out.println("You are old enough to drink!");
    }else{
      System.out.println("You are not old enough to drink!");
    }
  }
}

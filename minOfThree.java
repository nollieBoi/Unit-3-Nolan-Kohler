import java.util.Scanner;

public class minOfThree{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int num1;
    int num2;
    int num3;
    System.out.println("Enter three numbers");
    num1 = scan.nextInt();
    num2 = scan.nextInt();
    num3 = scan.nextInt();
    if((num1 <= num2) && (num1 <= num3)){
      System.out.println("The minimum number is: " + num1);
    }else if((num2 <= num1) && (num2 <= num3)){
      System.out.println("The minimum number is: " + num2);
    }else{
      System.out.println("The minimum number is: " + num3);
    }
  }
}

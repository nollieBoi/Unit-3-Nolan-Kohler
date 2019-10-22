import java.util.Scanner;

public class MiniProject{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    boolean starsRunning = true;
    String choice = "";
    System.out.println("Would you like to print shapes? (y/n)");
    choice = scan.next();

    while(starsRunning){
      if(choice.equals("y")){

        System.out.println("Enter the number of the shape you want to print");
        System.out.println("1. Triangle 1");
        System.out.println("2. Triangle 2");
        System.out.println("3. Triangle 3");
        System.out.println("4. Rhombus");
        System.out.println("5. Hourglass");
        int input = scan.nextInt();

        if(input == 1){
          for(int i = 10; i >= 1; i--){
            for(int j = 1; j <= i; j++){
              System.out.print("*");
            }
            System.out.print("\n");
          }
        }

        if(input == 2){
          for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10-i; j++){
              System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
              System.out.print("*");
            }
            System.out.print("\n");
          }
        }

        if(input == 3){
          for(int i = 10; i >= 1; i--){
            for(int j = 1; j <= 10-i; j++){
              System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
              System.out.print("*");
            }
            System.out.print("\n");
          }
        }

        if(input == 4){
          for(int i = 1; i <= 9; i+=2){
            for(int j = 0; j <= 4 - (i/2); j++){
              System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
              System.out.print("*");
            }
            System.out.print("\n");
          }
          for(int i = 9; i >= 1; i-=2){
            for(int j = 0; j <= 4 - (i/2); j++){
              System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
              System.out.print("*");
            }
            System.out.print("\n");
          }
        }

        if(input == 5){
          for(int i = 9; i >= 1; i-=2){
            for(int j = 0; j <= 4 - (i/2); j++){
              System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
              System.out.print("*");
            }
            System.out.print("\n");
          }
          for(int i = 1; i <= 9; i+=2){
            for(int j = 0; j <= 4 - (i/2); j++){
              System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
              System.out.print("*");
            }
            System.out.print("\n");
          }
        }
        System.out.println("Do you want to keep going? (y/n)");
        choice = scan.next();
      }else if(choice.equals("n")){
        System.out.println("Thanks for vibing bud.");
        starsRunning = false;
      }
    }
  }
}

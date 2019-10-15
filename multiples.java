import java.util.Scanner;

public class multiples{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int start, limit, mult;
    System.out.println("enter in your positive integer");
    start = scan.nextInt();
    System.out.println("enter in your upper limit");
    limit = scan.nextInt();
    if(start > 0  && limit > 0){
      if(start < limit){
        for(int i = 1; i*start <= limit; i++){
          mult = (start * i);
          System.out.print(mult + " ");
          if (i % 5 == 0){
            System.out.println();
          }
        }
      }else
      System.out.print("That was a fail dog...");
    }else
    System.out.print("That was a fail dog...");
 }
}

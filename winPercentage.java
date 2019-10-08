import java.util.Scanner;

public class winPercentage{
  public static void main(String[] args){
    double winPercent;
    double games = -1;
    double gamesWon = 0;
    boolean valid = false;
    Scanner scan = new Scanner(System.in);
    //USER INPUT
    System.out.println("Please enter the number of games played and games won");
    //SETTING VARIABLES
    while(!valid){
      if(scan.hasNextInt()){
        games = scan.nextInt();
        System.out.println("# of games = " + games);
        valid = true;
      }else{
        System.out.println("Games played must be an integer, try again");
      }
    }
      if(scan.hasNextInt()){
        gamesWon = scan.nextInt();
        System.out.println("# of games won = " + gamesWon);
        valid = true;
      }else{
        System.out.println("Games won played must be an integer, try again");
        }
    }
  }

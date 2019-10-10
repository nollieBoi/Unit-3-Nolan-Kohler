import java.util.Scanner;

public class winPercentage{
  public static void main(String[] args){
    double winPercent;
    double games = -1;
    double gamesWon = 0;
    boolean valid = false;
    Scanner scan = new Scanner(System.in);
    //USER INPUT
    System.out.println("Please enter the number of games played");
    games = scan.nextDouble();
    System.out.println("Please enter the number of games won");
    gamesWon = scan.nextDouble();
    //SETTING VARIABLES
    while(games <= 0 || gamesWon < 0 || gamesWon > games || gamesWon != Math.round(gamesWon) || games != Math.round(games)){
      if(games <= 0){
        System.out.println("You can't play 0 or less games.");
      }else if(gamesWon < 0){
        System.out.println("You can't win less than 0 games.");
      }else if(gamesWon > games){
        System.out.println("You can't win more games than you played.");
      }else if(gamesWon != Math.round(gamesWon)){
        System.out.println("Enter integers only.");
      }else if(games != Math.round(games)){
        System.out.println("Enter integers only.");
      }
      System.out.println("Please enter the number of games played");
      games = scan.nextDouble();
      System.out.println("Please enter the number of games won");
      gamesWon = scan.nextDouble();
      }
      winPercent = (gamesWon / games * 100);
      System.out.println("The win percentage for this team is: " + winPercent + "%");
    }
  }

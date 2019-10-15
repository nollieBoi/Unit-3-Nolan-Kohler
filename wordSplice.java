import java.util.Scanner;

public class wordSplice{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String word = "";
    System.out.println("Enter a word");
    word = scan.nextLine();
    for(int i = 0; i < word.length(); i++){
      System.out.println(word.charAt(i));
      //System.out.println(word.substring(i, i+1))
    }
  }
}

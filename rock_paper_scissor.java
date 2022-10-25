import java.sql.SQLOutput;
import java.util.Scanner;

public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the rock paper scissor game");
        System.out.print("Player 1 enter your choice -> (r,p,s) : ");
        String player1 = sc.next();
        System.out.print("Player 2 enter your choice -> (r,p,s) : ");
        String player2 = sc.next();
        player1 = player1.toUpperCase();
        player2 = player2.toUpperCase();
        switch (player1){
            case "R":
                if (player2.equals("R")){
                    System.out.println("Tie");
                    break;
                }
                else if (player2.equals("P")){
                    System.out.println("Player 2 wins");
                    break;
                }
                else{
                    System.out.println("Player 1 wins");
                    break;
                }
            case "P":
                if (player2.equals("R")){
                    System.out.println("Player 1 wins");
                    break;
                }
                else if (player2.equals("P")){
                    System.out.println("Tie");
                    break;
                }
                else{
                    System.out.println("Player 2 wins");
                    break;
                }
            case "S":
                if (player2.equals("R")){
                    System.out.println("Player 2 wins");
                    break;
                }
                else if (player2.equals("P")){
                    System.out.println("Player 1 wins");
                    break;
                }
                else{
                    System.out.println("Tie");
                    break;
                }
        }
    }
}

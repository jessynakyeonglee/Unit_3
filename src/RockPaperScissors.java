///Jessy Lee
///11/5/19
///This program allows users to play rock paper scissors against the computer.
import java.util.Scanner;

public class RockPaperScissors {

    public static String getUserChoice(){
    Scanner rps = new Scanner(System.in);
    System.out.println("Please choose either rock, paper, or scissors.");
    String user =  rps.nextLine();
    return user.toLowerCase();
}
    public static String getComputerChoice(){
        int num = (int)(Math.random()*3+1);
        if (num==1){
            return "rock";
        }
        if (num==2){
            return "paper";
        }
        else
            return "scissors";
    }
    public static String whoWins(){
        if (getComputerChoice()==getUserChoice()){
            return "You tied!";
        }
        if (getUserChoice()=="paper"&&getComputerChoice()=="scissors"){
            return "The computer wins!";
        }
        if (getUserChoice()==""&&getComputerChoice()=="scissors"){
            return "The computer wins!";
        }
    }
}







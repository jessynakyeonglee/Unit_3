///Jessy Lee
///11/5/19
///This program allows users to play rock paper scissors against the computer.
import java.util.Scanner;

public class RockPaperScissors {


    public static String getUserChoice() {
        Scanner rps = new Scanner(System.in);
        System.out.println("Please choose either rock, paper, or scissors.");
        String user = rps.nextLine();
        return user.toLowerCase();
    }

    public static String getComputerChoice() {
        int num = (int) (Math.random() * 3 + 1);
        if (num == 1) {
            return "rock";
        }
        if (num == 2) {
            return "paper";
        } else
            return "scissors";
    }

    public static String whoWins(String computer, String user) {
        if (user.equals("rock")  && computer.equals("rock")) {
            return "You chose rock.\nThe computer chose rock.\nYou tied!";
        }
        else if (user.equals("scissors") && computer.equals("scissors")) {
            return "You chose scissors.\nThe computer chose scissors.\nYou tied!";
        }
        else if (user.equals("paper") && computer.equals("paper")) {
            return "You chose paper.\nThe computer chose paper.\nYou tied!";
        }
        else if (user.equals("paper") && computer.equals("scissors")) {
            return "You chose paper.\nThe computer chose scissors.\nThe computer wins!";
        }
        else if (user.equals("scissors") && computer.equals("rock")) {
            return "You chose scissors.\nThe computer chose rock.\nThe computer wins!";
        }
        else if (user.equals("rock") && computer.equals("paper")) {
            return "You chose rock.\nThe computer chose paper.\nThe computer wins!";
        }
        else if (user == "rock" && computer == "scissors") {
            return "You chose rock.\nThe computer chose scissors.\nYou win!";
        }
        else if (user == "scissors" && computer == "paper") {
            return "You chose scissors.\nThe computer chose paper.\nYou win!";
        }
        else {
            return "You chose paper.\nThe computer chose rock.\nYou win!";
        }
    }
    public static void main(String[]args){
        String user = getUserChoice();
        String computer = getComputerChoice();
        System.out.println(whoWins(computer,user));
    }
}



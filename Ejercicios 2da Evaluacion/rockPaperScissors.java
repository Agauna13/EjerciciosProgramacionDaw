/*DESCRIPTION:
Rock Paper Scissors
Let's play! You have to return which player won! In case of a draw return Draw!.

Examples(Input1, Input2 --> Output):

"scissors", "paper" --> "Player 1 won!"
"scissors", "rock" --> "Player 2 won!"
"paper", "paper" --> "Draw!"*/

//Solution
public class Kata {
  public static String rps(String p1, String p2) {
    String result = "";
    if(p1 == "scissors" && p2 == "paper"){
      result = "Player 1 won!";
    }else if(p2 == "scissors" && p1 == "paper"){
      result = "Player 2 won!";
    }else if(p1 == "rock" && p2 == "scissors"){
      result = "Player 1 won!";
    }else if(p2 == "rock" && p1 == "scissors"){
      result = "Player 2 won!";
     }else if(p1 == "paper" && p2 == "rock"){
      result = "Player 1 won!";
    }else if(p2 == "paper" && p1 == "rock"){
      result = "Player 2 won!";
     }else if(p1 == p2){
      result = "Draw!";
    } 
    
      return result;
  }
}
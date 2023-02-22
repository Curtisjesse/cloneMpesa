// Java game “Guess a Number” that allows user to guess a random number that has been generated.
import javax.swing.*;

public class guessGame {
   public static void main(String[] args) {
       int compNumber = (int) (Math.random()*100 + 1);
       int answer = 0;
       System.out.println("The correct guess would be " + compNumber);
        int count = 1;

       while (answer != compNumber)
       {
           String userNumber = JOptionPane.showInputDialog(null,  "Enter a guess between 1 and 100", "Guessing Game", 3);
           answer = Integer.parseInt(userNumber);//JOptionPane used to get the number from the user  for the game
           JOptionPane.showMessageDialog(null, ""+ determineGuess(answer, compNumber, count));// to display the result of the user's guess to the user
           count++;
       }  
   }

   public static String determineGuess(int answer, int compNumber, int count){
       if (answer <=0 || answer >100)//where the answer range
        {
           return "Your guess number is invalid";
       }
       else if (answer == compNumber ){
           return "guessed right!\nTotal Guesses: " + count;
       }
       else if (answer > compNumber) {
           return "higher than expected, try again.\nTry Number: " + count;
       }
       else if (answer < compNumber) {
           return "lower than expected, try again.\nTry Number: " + count;
       }
       else {
           return "guessed number is incorrect\nTry Number: " + count;
   	}
   }
}
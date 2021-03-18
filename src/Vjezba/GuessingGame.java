package Vjezba;

import javax.swing.*;

public class GuessingGame {
    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 100);
        int userAnswer = 0;
        System.out.println("The correct guess would be " + randomNumber);
        int count = 1;

        while (userAnswer != randomNumber) {
            String response = JOptionPane.showInputDialog(null,
                    "Enter a guess between 1 and 100", "Guessing Game", JOptionPane.QUESTION_MESSAGE);
            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, "" + determineGuess(userAnswer, randomNumber, count));
            count++;
        }
    }

    public static String determineGuess(int userAnswer, int randomNumber, int count) {
        if (userAnswer <= 0 || userAnswer > 100) {
            return "Enter a guess between 1 and 100";
        } else if (userAnswer == randomNumber) {
            return "Correct!\nTotal Guesses: " + count;
        } else if (userAnswer > randomNumber) {
            return "Your guess is too high, try again.\nTries: " + count;
        } else {
            return "Your guess is too low, try again.\nTries: " + count;
        }
    }
}

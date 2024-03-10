import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Scanner scanner =new Scanner(System.in);
        int minRange = 0 ;
        int maxRange = 50;

        Random rand = new Random();
        int secretNumber = rand.nextInt(50);// selected a secret number

        int guess =0; // user's guess
        int numGuesses = 0;

        while(guess !=secretNumber){
            System.out.println("Guess a number between " + minRange + " and " + maxRange + ":" );
            guess = scanner.nextInt();
            numGuesses ++;
            if (guess < secretNumber){
                System.out.println("Too small");
            } else if (guess>secretNumber) {
                System.out.println("Too large");
            } else {
                System.out.println("Congratulations !! You guessed the correct number .");
                System.out.println(" You took " + numGuesses + "number of guesses");
            }
        }














//        Scanner scanner = new Scanner(System.in);
//        int minRange = 0;
//        int maxRange = 50;
//
//        //random number
//        Random rand = new Random();
//        int secretNumber = rand.nextInt(50);
//
//        int guess =0;//user input
//        int numGuesses = 0; // number of guesses
//
//        while (guess!=secretNumber){
//            System.out.println("Guess the secret number between " +minRange+ "and " + maxRange+ ": ");
//            guess = scanner.nextInt();
//            numGuesses++;
//
//            if(guess < secretNumber){
//                System.out.println("Too small ");
//            }else if (guess > secretNumber){
//                System.out.println("Too large ");
//            }else {
//                System.out.println("Congratulations ! you guessed the mystery number .");
//                System.out.println("It took you " +numGuesses+ " number of guesses.");
//            }
//
//        }
//
//
 }

}

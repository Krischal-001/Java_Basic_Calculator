import java.util.Scanner;
import java.util.Random;

public class _randomNameGuesser {
    public static void main(String[] args){

Random random_Num =new Random();
Scanner input_Num =new Scanner(System.in);
int num_to_Guess = random_Num.nextInt(100) +1;
int guess;
int attempts=0;
        System.out.println("Welcome to Number Guessing Game");
        System.out.println("I am thinking of a number between 1 and 100");

        while(true){
            System.out.print("Enter Your Guess:");
            guess = input_Num.nextInt();
            attempts++;
            if(guess<num_to_Guess){
                System.out.println("Too Low, Try Again");

            }
            else if(guess > num_to_Guess)
            {
                System.out.println("Too High, Try Again");
            }
            else{
                System.out.println("Congratulations You guessed the number in " + attempts +" attempts");
                break;
            }

        }

        input_Num.close();

    }

}

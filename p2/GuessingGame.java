package p2;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    
    private int randomNumber; 
    private int Guess; 
    private int Random1, Random2, Random3;
    private int Guess1, Guess2, Guess3;
    private int Count;

    public void numGenerate()
    {
             Random1 = (randomNumber)/100;
             Random2 = (randomNumber%100)/10;
             Random3 = (randomNumber%100)%10;
    }  


    public void play()
    {
        System.out.println("Welcome To The Fermi Game.");
        System.out.println("A secret 3 digit number has been generated. Can you guess what it is?");
        System.out.println("Guess The Number: ");
        System.out.println(randomNumber);
        
    }

    public void Hint()        
    {
        if(Guess == randomNumber)
        {
        }
        else
        {
            Guess1 = (Guess)/100;
            Guess2 = (Guess%100)/10;
            Guess3 = (Guess%100)%10;
        
            if(Guess1 == Random1)
            {
                System.out.println("Fermi");
            }
            else if(Guess1 == Random2)
            {
                System.out.println("Pico");
            }
            else if(Guess1 == Random3)
            {
                System.out.println("Pico");
            }
            else{
                System.out.println("Nano");
            }
            if(Guess2 == Random2)
            {
                System.out.println("Fermi");
            }
            else if(Guess2 == Random1)
            {
                System.out.println("Pico");
            }
            else if(Guess2 == Random3)
            {
                System.out.println("Pico");
            }
            else
            {
                System.out.println("Nano");
            }
            if(Guess3 == Random3)
            {
                System.out.println("Fermi");
            }
            else if(Guess3 == Random1)
            {
                System.out.println("Pico");
            }
            else if(Guess3 == Random2)
            {
                System.out.println("Pico");
            }
            else
            {
                System.out.println("Nano");
            }
        }
        Count++;
    }
    public void Win()
    {
        System.out.println("You Guessed It!");
        System.out.println("Number of Guesses made: "+Count);
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Random ranNum = new Random();
        GuessingGame Game = new GuessingGame();
        int playAgain = 1;
        
        while(playAgain == 1)
        {
            Game.Count = 0;
            Game.randomNumber = ranNum.nextInt(1000);
            Game.numGenerate();
            Game.play();     

            while(Game.Guess != Game.randomNumber)
            {
                Game.Guess = sc.nextInt();
                Game.Hint();
            }
            Game.Win();
            System.out.println("Do You Want To Play Again? Press 1 to play again. Press 0 to Exit. ");
            playAgain = sc.nextInt();
        }
    }
}

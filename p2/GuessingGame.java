package p2;
import java.util.Scanner;
import java.util.Random;


public class GuessingGame {
    private int Guess; 
    private int randomNumber; 
    private int Count;
    private int Guess1, Guess2, Guess3;
    private int Random1, Random2, Random3;
    
    public void numGenerate()
    {
             Random3 = (randomNumber%100)%10;
             Random2 = (randomNumber%100)/10;
             Random1 = (randomNumber)/100;
    }  


    public void play()
    {
        System.out.println("Khushaamdid To Fermi Game.");
        System.out.println("A number is been generated which we are keeping as a secret, come on let's guess what it will?");
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
        System.out.println("What an imressive guess mate!!!");
        System.out.println("Amount of guesses made so far: "+Count);
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int playAgain = 1;
        GuessingGame Game = new GuessingGame();
        Random ranNum = new Random();
        
        
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
            System.out.println("want to rock and roll again? Press 1 to play one more time. Press 0 to way out. ");
            playAgain = sc.nextInt();
        }
    }
}

package opp_a3;

import java.util.Scanner;
import java.util.Timer;
//import java.util.Random;
//import java.lang.*;
import java.util.TimerTask;

public class fraction
 {
    int num2=(int) (Math.random()*10)+1;
    int denom2=(int) (Math.random()*10)+1;
    int num1=(int) (Math.random()*10)+1;
    int denom1=(int)( Math.random()*10)+1;
    int answer;
    int sec;
    int wrongOverLimit=0;
    int score;
    int value;
    int symbol;
    int correctOverLimit=6;
    int wrongUnderLimit=3;
    int stop=answer;
    int userSec;
    int correctUnderLimit=10;


     Timer timer=new Timer();
    TimerTask task=new TimerTask(){
        public void run(){
            sec--;
            System.out.println("Remaining seconds"+sec);
            if(sec<=0){
                timer.cancel();
                System.out.println("time is up guyss");
            }
            else if(stop==answer){
                timer.cancel();
            }
        }
    };
    

    public void start(){

        timer.scheduleAtFixedRate(task, sec, 1000);
    }

    public void userTime(){
        System.out.println("Want to set some amount of time? Answer 1 for yes or n for no"+userSec);
        Scanner sc = new Scanner(System.in);
        userSec=sc.nextInt();
        if(userSec==1){
            System.out.println("Time Limit is required to enter: "+sec); 
            Scanner s = new Scanner(System.in);
            sec=s.nextInt();
            start();
        }
        else{
            sec=30;
            start();
        }
    }
    


    public void fractionGen(){
            
        System.out.println("Press 1 for ADDITION\n 2 for SUBTRACTION\n 3 for MULTIPLICATION\n 4 for DIVISION\n"+symbol);
        Scanner sc = new Scanner(System.in);
        symbol=sc.nextInt();
        if(symbol==1){
        //For add
        value=((num1*denom2)+(num2*denom1))/(denom1*denom2);
        System.out.println(num1+"/"+denom1+" + "+num2+"/"+denom2);
        System.out.println(value);
       }
       else if(symbol==2){
           //for subtract
           value=(num1 * denom2 - num2 * denom1)/ (denom1 * denom2);
           System.out.println(num1+"/"+denom1+" - "+num2+"/"+denom2);
           System.out.println(value);
       }
       else if (symbol==3){
           //for multiply
           value= (num1 * num2)/ (denom1 * denom2);
           System.out.println(num1+"/"+denom1+" * "+num2+"/"+denom2);
           System.out.println(value);
       }
       else if (symbol==4){
           //for divide
           value=(num1 * denom2)/ (num2 * denom1);
           System.out.println(num1+"/"+denom1+" / "+num2+"/"+denom2);
           System.out.println(value);
       }
    }

    public void answer(){
        System.out.println("Enter your answer: "+answer);
        Scanner sc = new Scanner(System.in);
        answer=sc.nextInt();
        if(answer==value){
            System.out.println("RIGHT");
        }
        else{
            System.out.println("WRONG");
        }
    }

    public void score(){
        if(sec==0){

        }
    }


}
class display{
    public static void main(String[] args) {
        
        for(int i=1;i<=10;i++){
        fraction frac=new fraction();
        fraction time=new fraction();
        time.userTime();
        frac.fractionGen();
        frac.answer();
        }

    }
}


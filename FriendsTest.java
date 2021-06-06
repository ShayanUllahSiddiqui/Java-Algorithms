package friends;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;



public class FriendsTest
{
   public FriendsTest(String[] name2) {
    }
public static void main( String[] args )
    {
        int menu;       
        int choice;
        choice = 0;      

        Scanner input = new Scanner(System.in);
        ArrayList< FriendsTest > friends = new ArrayList< FriendsTest >(); 
        String[] name = new String[5];
        int age;   
        Scanner s = new Scanner(System.in);
   

        System.out.println(" 1. Add a Friend ");
        System.out.println(" 2. Remove a Friend ");
        System.out.println(" 3. Display All Friends ");
        System.out.println(" 4. Exit ");
        menu = input.nextInt();

    while(menu != 4)
    {    

    switch(menu)
    {                     

        case 1:
            
                System.out.println("Enter Friend's Name: ");
                for(int i  =0; i < name.length; i++) {
                    name[i] = s.nextLine();                                               
                    break; 
                }   
                break;          

            case 2:
                System.out.println("Enter Friend's Name to Remove: ");
                friends.remove(input.next()); 
            

                break;

            case 3:
                // for(int i = 0; i < friends.size(); i++)
                // {
                    //   System.out.println(name);                        
                // }

                // for (int i = 0; i < name.length; i++){
                    System.out.println(Arrays.toString(name));
                // };
                break;
    }
        System.out.println(" 1. Add a Friend ");
        System.out.println(" 2. Remove a Friend ");
        System.out.println(" 3. Display All Friends ");
        System.out.println(" 4. Exit ");
        menu = input.nextInt();
    }
        System.out.println("Thank you and goodbye!");

    }
    public String name;
    public int age;
}
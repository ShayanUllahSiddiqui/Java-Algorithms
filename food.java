import java.util.Scanner;
public class food {
    public static Scanner input = new Scanner(System.in);// input object
    public static double total = 0, pay;
    public static int choose, quantity = 1;// atributes
    public static String again;
    public static void menu() {// methods
        System.out.println("*************");
        System.out.println("Home Kitchen MENU CARD");
        System.out.println("1)Chapli Kabab = 350 ");
        System.out.println("2)Afghani Boti = 200 ");
        System.out.println("3)Butter Chicken = 120 ");
        System.out.println("4)Meal of the day = 250 ");
        System.out.println("5)Sweet dish of the day = 150 ");
        System.out.println("*************");
    }
    public static void order() {
        System.out.println("Press 1 for Chapli Kabab");
        System.out.println("Press 2 for Afghani Boti");
        System.out.println("Press 3 for Butter Chicken");
        System.out.println("Press 4 for Meal of the day");
        System.out.println("Press 5 for Sweet dish of the day");
        System.out.println("Choose your order");
        choose = input.nextInt();
        if (choose == 1) {
            System.out.println("You have choosen Chapli Kabab");
            System.out.print("How many parcels you want? : ");
            quantity = input.nextInt();
            total = total + (quantity * 350);
            System.out.println("Do you want to buy it again ?");
            System.out.println("Press Y for MORE or press N to END: ");
            again = input.next();
            if (again.equalsIgnoreCase("Y")) {
                order();

            } else {
                System.out.println("Complete Amount = " + total);
            }
        }
        else if (choose == 2) {
            System.out.println("You have choosen Afghani Boti");
            System.out.print("How many parcels you want? : ");
            quantity = input.nextInt();
            total = total + (quantity * 200);

            System.out.println("Do you want to buy it again?");
            System.out.println("Press Y for MORE or press N to END: ");
            again = input.next();
            if (again.equalsIgnoreCase("Y")) {
                order();
            } else {
                System.out.println("Complete Amount = " + total);
            }
        } else if (choose == 3) {
            System.out.println("You have choosen Butter Chicken");
            System.out.print("How many parcels you want? : ");
            quantity = input.nextInt();
            total = total + (quantity * 120);

            System.out.println("Do you want to buy it again?");
            System.out.println("Press Y for MORE or press N to END: ");
            again = input.next();
            if (again.equalsIgnoreCase("Y")) {
                order();
            } else {
                System.out.println("Complete Amount = " + total);
            }
        } else if (choose == 4) {
            System.out.println("You have choosen Meal of the day");
            System.out.print("How many parcels you want? : ");
            quantity = input.nextInt();
            total = total + (quantity * 250);

            System.out.println("Do you want to buy it again?");
            System.out.println("Press Y for MORE or press N to END: ");
            again = input.next();
            if (again.equalsIgnoreCase("Y")) {
                order();
            } else {
                System.out.println("Complete Amount = " + total);
            }
        } else if (choose == 5) {
            System.out.println("You have choosen Sweet dish of the day");
            System.out.print("How many parcels you want? : ");
            quantity = input.nextInt();
            total = total + (quantity * 150);

            System.out.println("Do you want to buy it again?");
            System.out.println("Press Y for MORE or press N to END: ");
            again = input.next();
            if (again.equalsIgnoreCase("Y")) {
                order();

            } else {
                System.out.println("Complete Amount = " + total);
            }
        } else {
            System.out.println("WRONG OPTION!!!!!!");
        }
    }
    public void info() {
        System.out.println("Enter your good name please: ");
        String name = input.nextLine();

        System.out.println("Enter your current residential address please: ");
        String address = input.nextLine();

        System.out.println("Enter your active email please: ");
        String email = input.nextLine();

        System.out.println("Enter your valid phone number please: ");
        int phone = input.nextInt();

        System.out.println("Please select your payment method below: ");
        System.out.println("Press 1 for Credit Card OR Press 2 for Cash ");
        int mode = input.nextInt();

        if (mode == 1) {
            System.out.println("Enter your credit card number:");
            int credit = input.nextInt();
        } else if (mode == 2) {
            System.out.println("Please pay the bill to rider");
        } else {
            System.out.println("WRONG OPTION!!!");
        }
    }
    public static void main(String[] args) {
        food fd = new food();
        fd.info();
        menu();
        order();
    }
}

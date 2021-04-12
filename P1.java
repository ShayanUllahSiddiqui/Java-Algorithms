import java.util.Scanner;//importing scanner class

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// reading from the keyboard
        System.out.println("Enter month number (1-12): ");
        int month = sc.nextInt();
        if (month == 1) {
            System.out.println("31 days");
        } else if (month == 2) {
            System.out.println("28 or 29 days");
        } else if (month == 3) {
            System.out.println("31 days");
        } else if (month == 4) {
            System.out.println("30 days");
        } else if (month == 5) {
            System.out.println("31 days");
        } else if (month == 6) {
            System.out.println("30 days");
        } else if (month == 7) {
            System.out.println("31 days");
        } else if (month == 8) {
            System.out.println("31 days");
        } else if (month == 9) {
            System.out.println("30 days");
        } else if (month == 10) {
            System.out.println("31 days");
        } else if (month == 11) {
            System.out.println("30 days");
        } else if (month == 12) {
            System.out.println("31 days");
        } else {
            System.out.println("Invalid input! Please enter month number between (1-12).");
        }

    }
}
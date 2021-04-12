import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no:");
        int x = sc.nextInt();
        System.out.println("Enter the second no:");
        int y = sc.nextInt();
        System.out.println("Enter the third no:");
        int z = sc.nextInt();
        if (x > y && x > z) {
            System.out.println("The 1st Number is the greatest among three");
        } else if (y > x && y > z) {
            System.out.println("The 2nd Number is the greatest among three");
        } else if (z > x && z > y) {
            System.out.println("The 3rd Number is the greatest among three");
        } else {
            System.out.println("invalid inputs");
        }
    }
}
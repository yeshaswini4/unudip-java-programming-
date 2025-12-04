import java.util.Scanner;

public class matrimony {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter gender (male/female): ");
        String gender = sc.nextLine().toLowerCase();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (gender.equals("female")) {
            if (age >= 18) {
                System.out.println("Female is eligible for marriage.");
            } else {
                System.out.println("Female is not eligible for marriage.");
            }
        } 
        else if (gender.equals("male")) {
            if (age >= 21) {
                System.out.println("Male is eligible for marriage.");
            } else {
                System.out.println("Male is not eligible for marriage.");
            }
        } 
        else {
            System.out.println("Invalid gender entered.");
        }

        sc.close();
    }
}

import java.util.Scanner;
public class house {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size (minimum 5): ");
        int n = sc.nextInt();   // example input: 5, 6, 7, 8...

        // ----- Roof -----
        for (int i = 1; i <= n; i++) {
            // spaces before left roof star
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            // left star
            System.out.print("*");

            // inside spaces between two roof stars
            if (i > 1) {
                for (int j = 1; j <= (2 * i - 3); j++)
                    System.out.print(" ");
                // right star
                System.out.print("*");
            }
            System.out.println();
        }

        // ----- Body -----
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * n - 1); j++) {
                if (i == 1 || i == n || j == 1 || j == (2 * n - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }
}

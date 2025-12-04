public class square {
    public static void main(String[] args) {
        int n = 5; // size of the grid

        for (int i = 0; i < n; i++) {         // rows
            for (int j = 0; j < n; j++) {     // columns
                // print stars on borders and diagonals
                if (i == 0 || i == n-1 || j == 0 || j == n-1 || i == j || i + j == n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // space for empty positions
                }

                if (j < n - 1) { // add spacing between columns
                    System.out.print("     "); // 5 spaces
                }
            }
            System.out.println(); // move to next row
        }
    }
}

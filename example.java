public class example.java {
    public static void main(String[] args) {
        int rows = 5; // Number of rows
        // Upper part of the diamond
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
        // Lower part of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            // Print spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}


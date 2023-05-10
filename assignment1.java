public class assignment1 {
    public static void main(String[] args) {
        // Define the number of rows
        int rows = 5;

        // Initialize the starting number
        int num = 1;

        // Loop through each row
        for (int i = 1; i <= rows; i++) {

            // Loop through each column in the current row
            for (int j = 1; j <= i; j++) {

                // If the current row is even, decrement the number
                if (i % 2 == 0) {
                    System.out.print(num + " ");
                    num--;
                }
                // If the current row is odd, increment the number
                else {
                    System.out.print(num + " ");
                    num++;
                }
            }

            // After each row, adjust the starting number based on whether the row is even or odd
            if (i % 2 == 0) {
                num += i + 1;
            } else {
                num += i;
            }

            // Print a newline character to move to the next row
            System.out.println();
        }
    }
}
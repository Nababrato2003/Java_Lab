public class ass2 {
    public static void main(String[] args) {
        int count = 0;

        // Loop through all combinations of three different digits
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    // Ensure all digits are unique
                    if (i != j && i != k && j != k) {
                        System.out.println(i + "" + j + "" + k);
                        count++;
                    }
                }
            }
        }






        // Print the total count of unique numbers
        System.out.println("Total number of unique three-digit numbers: " + count);
    }
}
    


public class ass4 {
    public static void main(String[] args) {
        // Define two binary numbers as strings
        String binary1 = "10"; // Binary for 2
        String binary2 = "11"; // Binary for 3

        // Convert binary strings to decimal numbers
        int num1 = Integer.parseInt(binary1, 2); // Converts "10" to 2
        int num2 = Integer.parseInt(binary2, 2); // Converts "11" to 3

        // Add the decimal numbers
        int sum = num1 + num2; // 2 + 3 = 5

        // Convert the sum back to binary
        String binarySum = Integer.toBinaryString(sum); // Converts 5 to "101"

        // Display the result with explanations
        System.out.println("First binary number: " + binary1 );
        System.out.println("Second binary number: " + binary2 );
        
        System.out.println("Sum in binary: " + binarySum);
    }
}

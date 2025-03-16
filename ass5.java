public class ass5 {
    public static void main(String[] args) {
        int a = 10, b = 20; // Initial values

        System.out.println("Before Swapping:");
        System.out.println("a = " + a + ", b = " + b);

        // Swapping without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nAfter Swapping:");
        System.out.println("a = " + a + ", b = " + b);
    }
}

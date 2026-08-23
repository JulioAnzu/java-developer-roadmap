public class ArithmeticExample {
    public static void main(String[] args) {
        // 1. Setup variables
        int a = 15;
        int b = 6;

        // 2. Perform operations
        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int quot = a / b;  // Integer division
        int rem = a % b;   // Modulus (remainder)

        // 3. Displaying values directly without concatenation
        System.out.println("--- Arithmetic Results ---");
        System.out.println(sum);  // 21
        System.out.println(diff); // 9
        System.out.println(prod); // 90
        System.out.println(quot); // 2 (Notice it drops decimals!)
        System.out.println(rem);  // 3
    }
}

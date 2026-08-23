public class IncrementDecrementExample {
    public static void main(String[] args) {
        int lives = 3;

        System.out.println("--- Increment / Decrement Demo ---");

        // Post-increment: Prints current value (3), then increments to 4
        System.out.println(lives++);

        // Prints the updated value (4)
        System.out.println(lives);

        // Pre-increment: Increments to 5 first, then prints the value (5)
        System.out.println(++lives);
    }
}

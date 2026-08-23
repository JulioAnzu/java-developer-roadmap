public class ConcatenationExample {
    public static void main(String[] args) {
        String label = "Account balance: ";
        int balance = 70000;

        // 1. Joining a String and an int
        String finalMessage = label + "$" + balance;

        System.out.println("--- Concatenation Demo ---");
        System.out.println(finalMessage);

        // 2. Evaluation Order Demo (Left to Right)
        System.out.println("Result: " + 10 + 10); // Prints: Result: 1010
        System.out.println(10 + 10 + " Result"); // Prints: 20 Result
    }
}

/*
 * Challenge by Julio Anzu
 * Date: 25/08/26
 * Description: Video Game Shop Calculator using arithmetic, relational,
 *              logical, and compound assignment operators.
 */
public class OperatorsChallenge {
    public static void main(String[] args) {
        // 1. Declaring and initializing setup variables
        int gamePrice = 60;
        int walletBalance = 100;
        int membershipLevel = 1;

        // 2. Performing calculations using compound and arithmetic operators
        gamePrice -= 15; // Applies discount using compound assignment (Price becomes 45)
        int remainingBalance = walletBalance - gamePrice; // 100 - 45 = 55

        // 3. Evaluating game states with relational and logical operators
        boolean canAfford = walletBalance >= gamePrice;
        boolean isWalletEmpty = (remainingBalance == 0);

        // 4. Displaying the final shop report with text concatenation
        System.out.println("=== VIDEO GAME SHOP SYSTEM ===");
        System.out.println("Final Game Price: " + gamePrice);
        System.out.println("Remaining Balance: " + remainingBalance);
        System.out.println("Can Afford Game?: " + canAfford);
        System.out.println("Is Wallet Empty?: " + isWalletEmpty);

        System.out.println("--- Membership Status ---");
        // Postfix demo: Prints current level (1), then updates the variable to 2 in memory
        System.out.println("Current Level: " + membershipLevel++);
        System.out.println("Updated Level: " + membershipLevel); // Prints the new value (2)
    }
}
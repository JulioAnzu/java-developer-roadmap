public class OperatorsFullExample {
    public static void main(String[] args) {
        // 1. Setup Game Variables (Arithmetic & Assignment)
        int playerHealth = 100;
        int enemyAttack = 40;
        int defenseBuff = 15;

        // Calculate final damage taken (Arithmetic)
        int damageTaken = enemyAttack - defenseBuff; // 40 - 15 = 25
        playerHealth -= damageTaken;                 // Compound Assignment: 100 - 25 = 75

        // 2. Checking Player Status (Relational)
        boolean isAlive = playerHealth > 0;             // true (75 is greater than 0)
        boolean hasPerfectHealth = (playerHealth == 100); // false

        // 3. Game Logic Evaluation (Logical)
        boolean hasShieldItem = true;
        // The player can counterattack if they are alive AND have a shield item
        boolean canCounterAttack = isAlive && hasShieldItem; // true

        // 4. Level Up System (Increment/Decrement)
        int playerLevel = 1;

        // 5. Final Reward Selection (Ternary)
        // Shorthand if-else based on player status
        String reward = (playerHealth > 50) ? "Legendary Sword" : "Health Potion";

        // ==========================================
        // CONSOLE OUTPUTS (Displaying Results with Concatenation)
        // ==========================================
        System.out.println("--- GAME SYSTEM LOG ---");
        System.out.println("Damage Taken: " + damageTaken);          // Damage Taken: 25
        System.out.println("Current Health: " + playerHealth);        // Current Health: 75
        System.out.println("Is Player Alive?: " + isAlive);           // Is Player Alive?: true
        System.out.println("Can Counterattack?: " + canCounterAttack); // Can Counterattack?: true

        System.out.println("--- Level Up Demo ---");
        // Postfix increment: Prints current level (1), then increments to 2
        System.out.println("Current Level (Postfix): " + playerLevel++);
        System.out.println("Updated Level in Memory: " + playerLevel); // Prints 2

        System.out.println("--- Reward System ---");
        System.out.println("Endgame Reward: " + reward); // Endgame Reward: Legendary Sword
    }
}

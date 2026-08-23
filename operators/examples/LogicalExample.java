public class LogicalExample {
    public static void main(String[] args) {
        boolean isAdult = true;
        boolean hasTicket = false;

        // Combining conditions
        boolean canEnterClub = isAdult && hasTicket; // AND (Both must be true)
        boolean canEnterAlternative = isAdult || hasTicket; // OR (At least one must be true)
        boolean accessDenied = !isAdult; // NOT (Reverses the state)

        System.out.println("--- Logical Results ---");
        System.out.println(canEnterClub);        // false
        System.out.println(canEnterAlternative); // true
        System.out.println(accessDenied);       // false
    }
}

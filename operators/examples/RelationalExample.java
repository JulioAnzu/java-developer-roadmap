public class RelationalExample {
    public static void main(String[] args) {
        int x = 60;
        int y = 85;

        // Comparisons return boolean states
        boolean isEqual = (x == y);
        boolean isLessThan = (x < y);
        boolean isNotEqual = (x != y);

        System.out.println("--- Relational Results ---");
        System.out.println(isEqual);    // false
        System.out.println(isLessThan); // true
        System.out.println(isNotEqual); // true
    }
}

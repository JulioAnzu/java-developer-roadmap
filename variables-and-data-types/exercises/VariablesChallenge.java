/*
1. Challenge by Julio Anzu
Date: 21/08/26
Description: A program that prints a few statistics of a video game character
 */
public class VariablesChallenge {
    public static void main (String[] args){
        //2. Declaring variables of the Character profile
        String name = "Kratos";
        int health = 98;
        double shield = 67.21;
        char rank = 'S';
        boolean life = true;
        final int MAX_LEVEL = 10000;

        //3.Declaring the devID
        var devID = 227381923;

        //4. Using println to display all our character profile values
        System.out.println("=== CHARACTER PROFILE ===");
        System.out.println(name);
        System.out.println(health);
        System.out.println(shield);
        System.out.println(rank);
        System.out.println(life);

        //5.  Displaying game settings and devID
        System.out.println("===== GAME SETTINGS =====");
        System.out.println(MAX_LEVEL);
        System.out.println(devID);


    }
}

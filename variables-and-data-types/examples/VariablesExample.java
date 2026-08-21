// Remember: Class name must match the file name exactly *(PascalCase)*
public class VariablesExample {
    public static void main (String[] args){
        // 1. Declaring and initializing standard primitive types
        int studentAge = 26;
        double productPrice = 19.99;
        char courseGrade = 'A';
        boolean isLearningJava = true;

        // 2. Declaring and initializing a Reference Type
        String developerName = "Julio Anzu";

        // 3. Creating a Constant (cannot be reassigned)
        final int MAX_SCORE = 100;

        // 4. Using the type inference (var)
        var devID = "2021601398"; // Java knows it's a String

        // 5. Displaying information line by line
        System.out.println("--- Developer Profile ---");
        System.out.println(developerName);
        System.out.println(studentAge);
        System.out.println(courseGrade);
        System.out.println(isLearningJava);
        System.out.println(productPrice);
        System.out.println(MAX_SCORE);
        System.out.println(devID);

        /* EXTRA PRACTICE FOR STUDENTS:
        Try uncommenting the line below. Java will throw a compilation error
        because you cannot change the value of a 'final' variable!*/

        // MAX_SCORE = 200;

    }
}

import java.util.Scanner;

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Samson
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String firstName;
        String favouriteFood;
        System.out.println("Please enter your age:");
        age = scanner.nextInt();
        System.out.println("Please enter your first name:");
        firstName = scanner.next();
        System.out.println("Please enter your favourite food:");
        favouriteFood = scanner.next();
        System.out.printf("First name: " + firstName + "\n");
        System.out.println("Age: " + age + "");
        System.out.printf("Favourite Food: " + favouriteFood + "\n");
        scanner.close();






    }

}

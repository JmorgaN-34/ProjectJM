import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // First pet (default constructor)
        Pet pet1 = new Pet();
        System.out.println(pet1);

        // Second pet (custom constructor)
        Pet pet2 = new Pet("Dog", "Buster", 11);
        System.out.println(pet2);

        // Third pet (user input)
        System.out.println("Enter animal type:");
        String type = input.nextLine();

        System.out.println("Enter animal name:");
        String name = input.nextLine();

        System.out.println("Enter animal age:");
        int age = input.nextInt();

        Pet pet3 = new Pet(type, name, age);
        System.out.println();
        System.out.println(pet3);

        input.close();
    }
}

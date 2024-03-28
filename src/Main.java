
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for name
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        // Input for age
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character after nextInt()

        // Create a new Person object with the provided name and age
        Person person = new Person(name, age);

        // Get and print the name and age
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

    }
}
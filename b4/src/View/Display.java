package View;

import Model.Family;
import Model.Person;
import Model.Town;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Display {
    Town town = new Town();

    Scanner scanner = new Scanner(System.in);
    Set<Person> persons = new HashSet<>();
    public void Display() {
        // Input foreach families
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        scanner.nextLine();
        String address = null;
        for (int i = 1; i <= n; i++) {

            System.out.println("Enter address:");
            address = scanner.nextLine();
            Family family =new Family(address);
            // Enter person number in family
            System.out.println("Enter number person");
            int number = scanner.nextInt();
            for (int j = 0; j < number; j++) {

                // Input person for family
                scanner.nextLine();
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Age: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Job: ");
                String job = scanner.nextLine();
                System.out.println("Passport:");
                String passport = scanner.nextLine();
                Person person = new Person(name, age, job, passport);
                family.addPer(person);
            }
            town.addFamily(family);
        }
        town.showFamily();
    }
}
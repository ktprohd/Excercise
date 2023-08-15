package View;

import Controller.QL;
import Model.Person;

import java.util.Scanner;

public class Display {
    Scanner scanner = new Scanner(System.in);
    QL ql = new QL();
    int i;

    public void Display() {
        while (true) {
            System.out.println("MENU");
            System.out.println("Enter 1: To insert person for rent");
            System.out.println("Enter 2: To remove person by passport");
            System.out.println("Enter 3: To calculator price by passport");
            System.out.println("Enter 4: To show infor");
            System.out.println("Enter 5: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter passport: ");
                    scanner.nextLine();
                    String passport = scanner.nextLine();
                    System.out.println("Choise A to rent room type A");
                    System.out.println("Choise B to rent room type B");
                    System.out.println("Choise C to rent room type C");
                    String type = scanner.nextLine();
                    System.out.println("Enter day rent:");
                    int date = scanner.nextInt();
                    scanner.nextLine();
                    Person person = new Person(name, age, passport, type, date);
                    ql.addPer(person);
                    break;
                }
                case "2": {
                    System.out.print("Enter passport: ");
                    String passport = scanner.nextLine();
                    ql.deletePer(passport);
                    break;
                }
                case "3": {
                    System.out.print("Enter passport: ");
                    String passport = scanner.nextLine();
                    System.out.println("Price: " + ql.calMoney(passport));
                    break;
                }
                case "4": {
                    ql.showPer();
                    break;
                }
                case "5": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}

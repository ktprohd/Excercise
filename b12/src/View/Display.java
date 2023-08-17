package View;

import Controller.QL;
import Model.Car;
import Model.Motor;
import Model.Traffic;
import Model.Truck;

import java.util.Scanner;

public class Display {
    QL ql = new QL();
    Scanner scanner = new Scanner(System.in);
    int j;

    public void Display() {
        while (true) {
            System.out.println("Menu:");
            System.out.println("\t1: Add ");
            System.out.println("\t2: Delete ");
            System.out.println("\t3: Search");
            System.out.println("\t4: Exit");
            int menu = scanner.nextInt();
            scanner.nextLine();
            MENU menuOp = MENU.getEnumMenu(menu);

            switch (menuOp) {
                case ADD:
                    System.out.print("Id:");
                    String id = scanner.nextLine();
                    System.out.print("Label: ");
                    String label = scanner.nextLine();
                    System.out.print("Year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Price: ");
                    int price = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Color: ");
                    String color = scanner.nextLine();
                    System.out.println("1. Car");
                    System.out.println("2. Motor ");
                    System.out.print("3. Truck");
                    j = scanner.nextInt();
                    scanner.nextLine();
                    ABC doc1 = ABC.getEnumABC(j);
                    switch (doc1) {
                        case CAR:
                            System.out.print("Type: ");
                            String type = scanner.nextLine();
                            Car car = new Car(id, label, year, price, color, type);
                            ql.add(car);
                            break;
                        case MOTOR:
                            System.out.print("Power: ");
                            String power = scanner.nextLine();
                            Motor motor = new Motor(id, label, year, price, color, power);
                            ql.add(motor);
                            break;
                        case TRUCK:
                            System.out.print("Weigh: ");
                            String weigh = scanner.nextLine();
                            Truck truck = new Truck(id, label, year, price, color, weigh);
                            ql.add(truck);
                            break;
                    }
                    break;
                case DEL:
                    System.out.println(" ID to delete");
                    id = scanner.nextLine();
                    ql.del(id);
                    // System.out.println(Document.deleteDocument(id) ? "Success" : "Fail");
                    break;
                case SEARCH:
                    System.out.println(" Label to search");
                    label = scanner.nextLine();
                    System.out.println(" Color to search");
                    color = scanner.nextLine();
                    ql.search(label, color);
                    break;
                case EXIT:
                    System.out.println("Exit");
                    return;

                default:
                    System.out.println("Wrong!.");
                    break;
            }
        }
    }
}

package View;

import Controller.QL;
import Model.Person;

import java.util.Scanner;

public class Display {
    Scanner scanner = new Scanner(System.in);
    QL ql = new QL();

    public void Display() {
        while (true) {
            System.out.println("Menu:");
            System.out.println("\t1: Add ");
            System.out.println("\t2: Show ");
            System.out.println("\t3: Del");
            System.out.println("\t4. Change");
            System.out.println("\t5: Calculate");
            System.out.println("\t6. Exit");
            int menu = scanner.nextInt();
            scanner.nextLine();
            MENU menuOp = MENU.getEnumMENU(menu);
            switch (menuOp) {
                case ADD:
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("ID :");
                    String id = scanner.nextLine();
                    System.out.print("Cong to: ");
                    String congto = scanner.nextLine();
                    System.out.print("New Data: ");
                    int newdata = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Old Data :");
                    int olddata = scanner.nextInt();
                    scanner.nextLine();
                    Person person = new Person(name,id,congto, newdata,olddata);
                    ql.addPer(person);
                    break;
                case SHOW:
                    ql.showPer();
                    break;
                case DEL:
                    System.out.println(" Enter ID:");
                    String id1 = scanner.nextLine();
                    ql.delete(id1);
                    break;
                case CHANGE:
                    System.out.println(" Enter ID:");
                    String id2 = scanner.nextLine();
                    ql.changePer(id2);
                    break;
                case CAL:
                    System.out.println(" Enter ID:");
                    String id3 = scanner.nextLine();
                    ql.calPer(id3);
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
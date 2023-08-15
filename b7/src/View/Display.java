package View;

import Controller.QLTea;
import Model.Teacher;

import java.util.Scanner;

public class Display {
    Scanner scanner = new Scanner(System.in);
    QLTea ql = new QLTea();
    public  void Display(){
        while (true) {
            System.out.println("Menu:");
            System.out.println("\t1: Add ");
            System.out.println("\t2: Del");
            System.out.println("\t3: Calculate");
            System.out.println("\t4. Exit");
            int menu = scanner.nextInt();
            scanner.nextLine();
            MENU menuOp = MENU.getEnumMENU(menu);
            switch (menuOp) {
                case ADD:
                    System.out.print("Salary :");
                    double salary = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Bonus :");
                    double bonus = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Penaty :");
                    double penaty = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Real :");
                    double realSalary = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Hometown: ");
                    String hometown = scanner.nextLine();
                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(" ID");
                    String id= scanner.nextLine();
                    Teacher teacher = new Teacher( salary, bonus, penaty,  realSalary,  name,  age,  hometown,  id);
                    ql.addTea(teacher);
                    break;
                case DEL:
                    System.out.println("ID");
                    id = scanner.nextLine();
                    ql.delTea(id);
                    break;
                case EXIT:
                    System.out.println("Exit");
                    return;

                   default:
                System.out.println("Invalid");
                break;

            }
        }
    }
}
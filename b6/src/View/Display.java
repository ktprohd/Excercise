package View;

import Controller.QLStu;
import Model.Student;

import java.util.Scanner;

public class Display {
    Scanner scanner = new Scanner(System.in);
    QLStu qlstu = new QLStu();

    public void Display() {
        while (true) {
            System.out.println("Menu:");
            System.out.println("\t1: Add student");
            System.out.println("\t2: Show 20 student");
            System.out.println("\t3: Show 23, DN student");
            System.out.println("\t4. Exit");
            int menu = scanner.nextInt();
            scanner.nextLine();
            MENU menuOp = MENU.getEnumMENU(menu);
            switch (menuOp) {
                case ADD_STU:
                    System.out.print("Grade :");
                    int grade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    Student student = new Student(grade, address, name, age);
                    qlstu.addStu(student);
                    break;
                case SHOW_20:
                    qlstu.showStu();
                    break;
                case COUT_23:
                    qlstu.show23();
                    break;
            }
        }
    }
}
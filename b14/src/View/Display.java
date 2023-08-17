package View;

import Controller.Check;
import Controller.QL;
import Model.Exception.InvalidDOBException;
import Model.Exception.InvalidFullNameException;
import Model.Exception.InvalidPhoneNumberException;
import Model.GoodStudent;
import Model.NormalStudent;

import java.util.Scanner;

public class Display {
    Scanner scanner = new Scanner(System.in);
    QL ql = new QL();
int n;
    public void Display()throws InvalidPhoneNumberException, InvalidFullNameException, InvalidDOBException {
        while (true) {
            System.out.println("Menu:");
            System.out.println("\t1: Add ");
            System.out.println("\t2: Show");
            System.out.println("\t3: Check");
            System.out.println("\t4: Exit");
            int menu = scanner.nextInt();
            scanner.nextLine();
            MENU menuOp = MENU.getEnumMenu(menu);

            switch (menuOp) {
                case ADD:
                            System.out.print("Name: ");
                            String name = scanner.nextLine();
                            Check.checkName(name);
                            System.out.print("Phone:");
                            String phone = scanner.nextLine();
                            Check.checkPhone(phone);
                            System.out.print("Birthday: ");
                            String doB = scanner.nextLine();
                            Check.checkdoB(doB);
                            System.out.print("Sex: ");
                            String sex = scanner.nextLine();
                            System.out.print("University: ");
                            String university = scanner.nextLine();
                            System.out.print("Grade: ");
                            String grade = scanner.nextLine();
                            switch (grade) {
                                case "Good":
                                    System.out.print("GPA: ");
                                    Double gpa = scanner.nextDouble();
                                    scanner.nextLine();
                                    System.out.print("Best: ");
                                    String best = scanner.nextLine();
                                    GoodStudent experience = new GoodStudent(name, doB, sex, phone, university, grade, gpa, best);
                                    ql.add(experience);
                                    break;
                                case "Normal":
                                    System.out.print("English: ");
                                    Double english = scanner.nextDouble();
                                    scanner.nextLine();
                                    System.out.print("Entry: ");
                                    Double entry = scanner.nextDouble();
                                    scanner.nextLine();
                                    NormalStudent fresher = new NormalStudent(name, doB, sex, phone, university, grade, english, entry);
                                    ql.add(fresher);
                                    break;
                        }

                    break;
                case SHOW:
                    ql.show();
                    break;
                case CHECK:
                   ql.enterN();
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

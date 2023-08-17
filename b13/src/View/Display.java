package View;

import Controller.QL;
import Model.Experience;
import Model.Fresher;
import Model.Intern;

import java.util.Scanner;

public class Display {
    Scanner scanner = new Scanner(System.in);
    QL ql = new QL();
    public void Display() {
        while (true) {
            System.out.println("Menu:");
            System.out.println("\t1: Add ");
            System.out.println("\t2: Change ");
            System.out.println("\t3: Delete");
            System.out.println("\t4: Show");
            System.out.println("\t5: Search");
            System.out.println("\t6: Certificate");
            System.out.println("\t7: Exit");
            int menu = scanner.nextInt();
            scanner.nextLine();
            MENU menuOp = MENU.getEnumMenu(menu);

            switch (menuOp) {
                case ADD:
                    System.out.print("Id:");
                    String id = scanner.nextLine();
                    System.out.print("Name: ");
                    String fullName = scanner.nextLine();
                    System.out.print("Birthday: ");
                    String birthday = scanner.nextLine();
                    System.out.print("Phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print(" Press 0:Experience ; Press 1:Fresher; Press 2:Intern ");
                    int type = scanner.nextInt();
                    scanner.nextLine();
                    switch (type) {
                        case 0:
                            System.out.print("Experience: ");
                            String exp = scanner.nextLine();
                            System.out.print("Skill: ");
                            String skill = scanner.nextLine();
                            Experience experience = new Experience(id, fullName,birthday,phone,email,type,exp,skill);
                            ql.add(experience);
                            break;
                        case 1:
                            System.out.print("Rank: ");
                            String rank = scanner.nextLine();
                            System.out.print("UniversityGraduation: ");
                            String universityGraduation = scanner.nextLine();
                            Fresher fresher = new Fresher(id, fullName,birthday,phone,email,type,rank,universityGraduation);
                            ql.add(fresher);
                            break;
                        case 2:
                            System.out.print("Major: ");
                            String major = scanner.nextLine();
                            System.out.print("University: ");
                            String university = scanner.nextLine();
                            Intern intern= new Intern(id, fullName,birthday,phone,email,type,major,university);
                            ql.add(intern);
                            break;
                    }
                    break;
                case DEL:
                    System.out.println(" ID to delete");
                    id = scanner.nextLine();
                    ql.delete(id);
                    // System.out.println(Document.deleteDocument(id) ? "Success" : "Fail");
                    break;
                case CHANGE:
                    System.out.println(" ID to change");
                    id = scanner.nextLine();
                    ql.changePer(id);
                    break;
                case SHOW:
                    ql.show();
                    break;
                case CERTIFICATE:
                    System.out.println(" ID to add");
                    id = scanner.nextLine();
                    ql.addCertificateToEmployee(id);
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

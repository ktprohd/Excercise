package View;

import Controller.QLKhoa;
import Controller.QLSV;
import Model.Exception.InvalidDOBException;
import Model.Exception.InvalidFullNameException;
import Model.Student;

import java.util.List;
import java.util.Scanner;

public class Display {
    public void Display() throws InvalidFullNameException, InvalidDOBException {
        Scanner scanner = new Scanner(System.in);
        QLSV qlsv = new QLSV();
        QLKhoa ql = new QLKhoa();
        DisplayStudent sv= new DisplayStudent();
        while (true) {
            System.out.println("Menu:");
            System.out.println("\t1: Add ");
            System.out.println("\t2: Show");
            System.out.println("\t3: Add Result");
            System.out.println("\t4: Check");
            System.out.println("\t5: Get Highest Score");
            System.out.println("\t6: Check");
            System.out.println("\t7: Cout student in semester");

            int menu = scanner.nextInt();
            scanner.nextLine();
            MENU menuOp = MENU.getEnumMenu(menu);
            switch (menuOp) {
                case ADD:
                    sv.displayAddStudent();
                    break;
                case SHOW:
                    qlsv.show();
                    break;
                case ADD_RESULT:
                    sv.displayAddResult();
                    break;
                case CHECK:
                    System.out.println("Id to check");
                    String id1= scanner.nextLine();
                    qlsv.checkOldStudent(qlsv.searchByID(id1));
                    break;
                case GET_SCORE:
                    System.out.println("Id to check");
                    String id= scanner.nextLine();
                    System.out.println("Semester to check");
                    int year= scanner.nextInt();
                    scanner.nextLine();
                    qlsv.searchByYear(qlsv.searchByID(id),year);
                    break;
                case COUT_STUDENT:
                    System.out.println("Department name to count student:");
                    String name= scanner.nextLine();
                    ql.countStudent(name);
                    break;
                case HIGHEST_SCORE:
                    System.out.println("Department name to highest score student:");
                    String name1= scanner.nextLine();
                    ql.HighestScore(name1);
                    break;
                case SHOW_PLACE:
                    System.out.println("Place to show old student");
                    String place =scanner.nextLine();
                    ql.showByPlace(place);
                    break;
                case MAX_SCORE:
                    System.out.println(qlsv.findStudentWithMaxScore( qlsv.lists));
                    break;
                case COUN_BY_SEMESTER:
                    System.out.println("Department name to count student:");
                    String name2= scanner.nextLine();
                    System.out.println("Semester to count student:");
                    int semester = scanner.nextInt();
                    scanner.nextLine();
                    ql.countStudentBySemester(name2,semester);
                    break;
                case SORT:
                    System.out.println("Department name to sort student by entrance year:");
                    String name3= scanner.nextLine();
                    ql.sortByEntranceYear(name3);
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
package View;

import Controller.Check;
import Controller.QLSV;
import Model.Exception.InvalidDOBException;
import Model.Exception.InvalidFullNameException;
import Model.OldStudent;
import Model.Result;
import Model.Student;

import java.util.Scanner;

public class DisplayStudent {
    Scanner scanner = new Scanner(System.in);
    QLSV qlsv = new QLSV();
    public void displayAddResult(){

            System.out.print("Id to add Result: ");
            String id = scanner.nextLine();
            Student student = qlsv.searchByID(id);
            System.out.print("semesterName: ");
            String semesterName = scanner.nextLine();
            System.out.print("averageScore: ");
            double averageScore = scanner.nextInt();
            scanner.nextLine();
            Result result = new Result(semesterName, averageScore);
            qlsv.addResultToStudent(student, result);
        }
    public void displayAddStudent()throws  InvalidFullNameException, InvalidDOBException {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        Check.checkName(name);
        System.out.print("ID:");
        String id = scanner.nextLine();
        System.out.print("Birthday: ");
        String birth = scanner.nextLine();
        Check.checkdoB(birth);
        System.out.print("Entrance Year : ");
        int entranceYear = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Entrance Score : ");
        double entranceScore = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("\t1. Student ");
        System.out.print("\t2. OldStudent ");
        int i = scanner.nextInt();
        scanner.nextLine();
        OLD old = OLD.getEnumOLD(i);
        switch (old){
            case STUDENT:
                Student student = new Student(id,name,birth,entranceYear,entranceScore,department);
                qlsv.add(student);
                break;
            case OLDSTUDENT:
                System.out.print("Place: ");
                String place = scanner.nextLine();
                OldStudent student1 = new OldStudent(id,name,birth,entranceYear,entranceScore,department,place);
                qlsv.add(student1);
                break;
        }


    }
    }



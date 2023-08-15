package View;

import Controller.QLCan;
import Model.Candidate;
import Model.CandidateA;
import Model.CandidateB;
import Model.CandidateC;

import java.util.Scanner;

public class UserView {
    Scanner scanner=new Scanner(System.in);
    QLCan qlcan= new QLCan();
    Candidate candidate = null;
    int menu;
    int j;
    public void UserView(){
        while (true) {
            System.out.println("Menu:");
            System.out.println("\t1: Add candidate");
            System.out.println("\t2: Show candidate");
            System.out.println("\t3: Search candidate");
            System.out.println("\t4. Exit");
            int menu = scanner.nextInt();
            scanner.nextLine();
            MENU menuOp = MENU.getEnumMENU(menu);
            switch (menuOp){
                case ADD:
                    System.out.print("SBD:");
                    String sbd = scanner.nextLine();
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Priority: ");
                    int priority= scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("1. A");
                    System.out.println("2. B ");
                    System.out.print("3. C");
                    j = scanner.nextInt();
                    scanner.nextLine();
                    ABC abc = ABC.getEnumABC(j);
                    switch (abc) {
                        case A:
                            CandidateA  a = new CandidateA(sbd,name,address,priority);
                            qlcan.addCan(a);
                            break;
                        case B:
                            CandidateB  b = new CandidateB(sbd,name,address,priority);
                            qlcan.addCan(b);
                            break;
                        case C:
                            CandidateC  c = new CandidateC(sbd,name,address,priority);
                            qlcan.addCan(c);
                            break;
                    }
                    break;
                case SHOW:
                    qlcan.showCan();
                    break;
                case SEARCH:
                    System.out.print("Enter SBD: ");
                    String id = scanner.nextLine();
                    Candidate candidate = qlcan.searchCan(id);
                    if (candidate == null) {
                        System.out.println("Not found");
                    } else {
                        System.out.println(candidate.toString());
                    }
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

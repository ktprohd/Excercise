package Controller;

import Model.Exception.InvalidDOBException;
import Model.Exception.InvalidFullNameException;
import Model.Exception.InvalidPhoneNumberException;
import Model.GoodStudent;
import Model.NormalStudent;
import Model.Student;

import java.util.*;
import java.util.stream.Collectors;

public class QL {
    Scanner scanner= new Scanner(System.in);
    HashSet<Student> lists;
    ArrayList<Student> goodLists= new ArrayList<>();
    ArrayList<Student> normalLists= new ArrayList<>();
    public QL(){
        lists = new HashSet<>();
    }
    public void show() {
        lists.forEach(employee -> System.out.println(employee.toString()));
    }

    public void add(Student employee)throws InvalidFullNameException, InvalidDOBException, InvalidPhoneNumberException {
        lists.add(employee);
    }
    public class GPAComparator implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            if (((GoodStudent)s1).getGpa() == ((GoodStudent)s2).getGpa())
                return 0;
            else if (((GoodStudent)s1).getGpa() > ((GoodStudent)s2).getGpa())
                return 1;
            else
                return s1.getName().compareTo(s2.getName());
        }
        }
    public class EnglishComparator implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            if (((NormalStudent)s1).getEnglish() == ((NormalStudent)s2).getEnglish())
                return 0;
            else if (((NormalStudent)s1).getEnglish() > ((NormalStudent)s2).getEnglish())
                return 1;
            else
                return s1.getName().compareTo(s2.getName());
        }
    }
    public void GoodList(){

        Student student =(Student)  lists.stream().filter(student1 -> student1 instanceof GoodStudent);
        goodLists.add((Student) student);
        Collections.sort(goodLists, new GPAComparator());
    }
    public void NormalList(){

        Student student =(Student)  lists.stream().filter(student1 -> student1 instanceof NormalStudent);
        normalLists.add((NormalStudent)  student);
        Collections.sort(normalLists, new EnglishComparator());
    }
    public void enterN(){
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        scanner.nextLine();
        if(n<1 || n>5) return;
        if (goodLists.size() <= n) {
            List<Student> chooseList = goodLists;
            for (int i=0; i<(n - goodLists.size()); i++) {
                chooseList.add(normalLists.get(i));
            }

        }
        else {
             goodLists.stream()
                    .filter(item -> goodLists.indexOf(item) < n)
                    .collect(Collectors.toList());
        }
goodLists.forEach(employee -> System.out.println(employee.toString()));
        }
    }

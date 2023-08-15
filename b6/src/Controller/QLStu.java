package Controller;

import Model.Student;

import java.util.ArrayList;

public class QLStu {
    ArrayList<Student> lists;
    public QLStu(){
        lists = new ArrayList<>();
    }
    public void addStu(Student student){
        lists.add(student);
    }
    public void showStu(){
        lists.stream().filter(student->student.getAge()==20)
        .forEach(Student::showStu);
    }
    public void show23(){
        long i= this.lists.stream().filter(student -> student.getAge() == 23 && student.getAddress().equals("DN")).count();
        System.out.println(i);
    }


}

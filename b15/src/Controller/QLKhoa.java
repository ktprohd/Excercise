package Controller;

import Model.OldStudent;
import Model.Student;

import java.util.*;
import java.util.stream.Collectors;

public class QLKhoa {
    ArrayList<Student> students;
    Student student;
    QLSV qlsv;
    public QLKhoa(){
        students = new ArrayList<>();
    }
    public List<Student> findStudentsInDepartment(String departmentName) {
        return qlsv.lists.stream()
                .filter(department -> department.getDepartment().equals(departmentName))
                .collect(Collectors.toList());}
    public void countStudent(String departmentName){
        List<Student> students = findStudentsInDepartment(departmentName);
        int numberOfStudents = students.size(); System.out.println(numberOfStudents);}
    public void HighestScore(String departmentName) {
        List<Student> students = findStudentsInDepartment(departmentName);
        if (students == null || students.isEmpty()) { throw new IllegalArgumentException("List is empty");}
        Student student2 = Collections.max(students, Comparator.comparingDouble(p -> p.getEntranceScore()));
        double max = student2.getEntranceScore(); System.out.println(max);}
    public void showByPlace(String place) {
        List<Student> studentList = qlsv.lists.stream()
                .filter(student -> student instanceof OldStudent)
                .collect(Collectors.toList());
        if (studentList.isEmpty()) System.out.println(" null");
        List<Student> searchPlaceList = studentList.stream()
                .filter(student -> ((OldStudent) student).getPlace().equals(place))
                .collect(Collectors.toList());
        searchPlaceList.forEach(student -> System.out.println(student.toString()));
    }
    public void countStudentBySemester(String departmentName,int entranceYear){
        List<Student> students = findStudentsInDepartment(departmentName);
        if (students == null || students.isEmpty()) { throw new IllegalArgumentException("List is empty");}
        long numberOfStudents = students.stream().filter(o->o.getEntranceYear()==entranceYear).count();
        System.out.println(numberOfStudents);}
    public void sortByEntranceYear(String departmentName){
        List<Student> students = findStudentsInDepartment(departmentName);
        if (students == null || students.isEmpty()) { throw new IllegalArgumentException("List is empty");}
        Collections.sort(students, new YearComparator());
        students.forEach(student -> System.out.println(student.toString()));}}


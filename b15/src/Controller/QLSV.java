package Controller;

import Model.OldStudent;
import Model.Result;
import Model.Student;

import java.util.*;

public class QLSV {
    public LinkedHashSet<Student> lists;
    Scanner scanner = new Scanner(System.in);
    public QLSV() {
        lists = new LinkedHashSet<>();
    }
    public void add(Student student){
        lists.add(student);
    }
    public void show() {
        lists.forEach(student -> System.out.println(student.toString()));System.out.println(lists);}
    public Student searchByID(String id) {
        Optional<Student> optionalStudent = lists.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
        return optionalStudent.orElse(null);}
    public void addResultToStudent( Student student,Result result) {
        student.getResults().add(result);
    }
    public boolean checkOldStudent(Student student){
        return (student instanceof OldStudent);
    }
    public void searchByYear(Student student, int entranceYear) {
        Optional<Result> optionalResult = student.getResults().stream()
                .filter(result -> result.getSemesterName().equals(String.valueOf(entranceYear)))
                .findFirst();
        if (optionalResult.isPresent()) {
            Result result = optionalResult.get();
            System.out.println(result.getAverageScore());
        } else {System.out.println(" ");}
    }
    public static Result findMaxScore(List<Result> results) {
        if (results == null || results.isEmpty()) { throw new IllegalArgumentException("List is empty");}
        Result maxScore = results.get(0);
        for (Result score : results) {
            if (score.getAverageScore() > maxScore.getAverageScore()) {maxScore = score;}}
        return maxScore;}
    public  Student findStudentWithMaxScore(LinkedHashSet<Student> students) {
        if (students == null || students.isEmpty()) {throw new IllegalArgumentException("List is empty");}
        Student maxScoreStudent = students.stream().findFirst().orElse(null);;
        for (Student student : students) {
            Result maxScoreResult = findMaxScore(student.getResults());
            if (maxScoreResult.getAverageScore() > findMaxScore(maxScoreStudent.getResults()).getAverageScore()) {
                maxScoreStudent = student;
            }
        }
        return maxScoreStudent;
    }
}

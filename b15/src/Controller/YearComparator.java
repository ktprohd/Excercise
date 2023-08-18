package Controller;

import Model.Student;

import java.util.Comparator;

public class YearComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.getEntranceYear() == (s2.getEntranceYear()))
            return 0;
        else if (s1.getEntranceYear() < (s2.getEntranceYear()))
            return 1;
        else
            return s1.getName().compareTo(s2.getName());
    }
}
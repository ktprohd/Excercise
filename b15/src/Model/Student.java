package Model;

import java.util.ArrayList;
import java.util.List;

public class Student {
        private String id;
        private String name;
        private String birth;
        private int entranceYear;
        private double entranceScore;
        private List<Result> results;
        private String department;

        public Student(String id, String name, String birth, int entranceYear, double entranceScore,String department) {
            this.id=id;
            this.name=name;
            this.birth=birth;
            this.entranceScore=entranceScore;
            this.entranceYear=entranceYear;
            this.results=new ArrayList<>();
            this.department=department;
        }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getEntranceYear() {
        return entranceYear;
    }

    public void setEntranceYear(int entranceYear) {
        this.entranceYear = entranceYear;
    }

    public double getEntranceScore() {
        return entranceScore;
    }

    public void setEntranceScore(double entranceScore) {
        this.entranceScore = entranceScore;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student employee = (Student) o;
        return id.equals(((Student) o).getId());
    }
    public String toString() {
        return "Student{" +
                "Id=" + getId() +
                ", Name='" + getName() + '\'' +
                ", Birth='" + getBirth() + '\'' +
                ", Entrance Year='" + getEntranceYear() + '\'' +
                '}';
    }
}

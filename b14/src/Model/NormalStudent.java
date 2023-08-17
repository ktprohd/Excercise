package Model;

public class NormalStudent extends Student{
    private double english;
    private double entry;

    public NormalStudent(String name, String doB, String sex, String phone, String university, String grade,
                         double english, double entry) {
        super(name, doB, sex, phone, university, grade);
        this.english = english;
        this.entry = entry;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getEntry() {
        return entry;
    }

    public void setEntry(double entry) {
        this.entry = entry;
    }
    @Override
    public String toString() {
        return "Normal{" +
                "Name=" + getName() +
                ", sex='" + getSex() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", English='" + getEnglish() + '\'' +
                ", Entry ='" + getEntry() + '\'' +
                '}';
    }
}

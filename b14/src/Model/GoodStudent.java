package Model;

public class GoodStudent extends Student{
    private double gpa;
    private String best;

    public GoodStudent(String name, String doB, String sex, String phone, String university, String grade,
                       double gpa, String best) {
        super(name, doB, sex, phone, university, grade);
        this.gpa = gpa;
        this.best = best;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getBest() {
        return best;
    }

    public void setBest(String best) {
        this.best = best;
    }
    @Override
    public String toString() {
        return "Good{" +
                "Name=" + getName() +
                ", sex='" + getSex() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", GPA='" + getGpa() + '\'' +
                ", Best ='" + getBest() + '\'' +
                '}';
    }
}

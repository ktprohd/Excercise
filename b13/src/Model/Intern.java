package Model;

public class Intern extends Employee{
    private String major;
    private String univesity;
    public Intern(String id, String fullName, String birthDay, String phone, String email, int employeeType, String major, String univesity){
        super(id,fullName,birthDay,phone,email,employeeType);
        this.major=major;
        this.univesity=univesity;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUnivesity() {
        return univesity;
    }

    public void setUnivesity(String univesity) {
        this.univesity = univesity;
    }
    @Override
    public String toString() {
        return "Intern{" +
                "Id=" + getId() +
                ", Name='" + getFullName() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", Major='" + getMajor() + '\'' +
                ", Graduation='" + getUnivesity() + '\'' +
                '}';
    }
}

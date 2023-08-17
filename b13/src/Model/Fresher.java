package Model;

public class Fresher extends Employee{
    private String rank;
    private String univesityGraduation;
    public Fresher(String id, String fullName, String birthDay, String phone, String email, int employeeType, String rank, String univesityGraduation){
        super(id,fullName,birthDay,phone,email,employeeType);
        this.rank=rank;
        this.univesityGraduation=univesityGraduation;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getUnivesityGraduation() {
        return univesityGraduation;
    }

    public void setUnivesityGraduation(String univesityGraduation) {
        this.univesityGraduation = univesityGraduation;
    }
    @Override
    public String toString() {
        return "Fresher{" +
                "Id=" + getId() +
                ", Name='" + getFullName() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", Rank='" + getRank() + '\'' +
                ", Graduation='" + getUnivesityGraduation() + '\'' +
                '}';
    }
}

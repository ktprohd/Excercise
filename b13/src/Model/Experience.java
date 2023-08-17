package Model;

public class Experience extends Employee {
    private String exp;
    private String skill;
    public  Experience(String id, String fullName, String birthDay, String phone, String email, int employeeType, String exp, String skill){
        super(id,fullName,birthDay,phone,email,employeeType);
        this.exp=exp;
        this.skill=skill;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
    @Override
    public String toString() {
        return "Experience{" +
                "Id=" + getId() +
                ", Name='" + getFullName() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", Exp Year='" + getExp() + '\'' +
                ", Skill='" + getSkill() + '\'' +
                '}';
    }

}

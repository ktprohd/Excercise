package Model;
public class CandidateB extends Candidate {
    String MON_TOAN = "Toan";
    String MON_SINH = "SINH";
    String MON_HOA = "Hoa";
    public CandidateB(String sbd, String name, String address,int priority) {
        super(sbd, name, address, priority);
    }
    @Override
    public String toString() {
        return "CandidateB{" +
                "id='" + getSbd() + '\'' +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", priority=" + getPriority() + ", Subject: " + MON_TOAN + " - " + MON_SINH + " - " + MON_HOA +
                '}';
    }
}

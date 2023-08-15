package Model;
public class CandidateA extends Candidate {
    String MON_TOAN = "Toan";
    String MON_LY = "Ly";
    String MON_HOA = "Hoa";
    public CandidateA(String sbd, String name, String address,int priority) {
        super(sbd, name, address, priority);
    }
    @Override
    public String toString() {
        return "CandidateA{" +
                "id='" + getSbd() + '\'' +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", priority=" + getPriority() + ", Subject: " + MON_TOAN + " - " + MON_LY + " - " + MON_HOA +
                '}';
    }
}

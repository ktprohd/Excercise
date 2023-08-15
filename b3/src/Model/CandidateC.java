package Model;
public class CandidateC extends Candidate {
    String MON_VAN = "Van";
    String MON_SU = "Su";
    String MON_DIA = "Dia";
    public CandidateC(String sbd, String name, String address,int priority) {
        super(sbd, name, address, priority);
    }
    @Override
    public String toString() {
        return "CandidateA{" +
                "id='" + getSbd() + '\'' +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", priority=" + getPriority() + ", Subject: " + MON_VAN + " - " + MON_SU + " - " + MON_DIA +
                '}';
    }
}

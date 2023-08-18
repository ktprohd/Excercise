package Model;

public class Result {
    private String semesterName;
    private double averageScore;
    public Result(String semesterName, double averageScore){
        this.semesterName=semesterName;
        this.averageScore=averageScore;
    }

    public String getSemesterName() {
        return semesterName;
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

}

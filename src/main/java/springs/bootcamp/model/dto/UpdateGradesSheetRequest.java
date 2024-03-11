package springs.bootcamp.model.dto;

public class UpdateGradesSheetRequest {
    private String studentName;
    private Integer mathGrade;
    private Integer englishGrade;
    private Integer computerScienceGrade;

    public UpdateGradesSheetRequest(String studentName, Integer mathGrade, Integer englishGrade, Integer computerScienceGrade) {
        this.studentName = studentName;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.computerScienceGrade = computerScienceGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(Integer mathGrade) {
        this.mathGrade = mathGrade;
    }

    public Integer getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(Integer englishGrade) {
        this.englishGrade = englishGrade;
    }

    public Integer getComputerScienceGrade() {
        return computerScienceGrade;
    }

    public void setComputerScienceGrade(Integer computerScienceGrade) {
        this.computerScienceGrade = computerScienceGrade;
    }

    @Override
    public String toString() {
        return "UpdateGradesSheetRequest{" +
                "studentName='" + studentName + '\'' +
                ", mathGrade=" + mathGrade +
                ", englishGrade=" + englishGrade +
                ", computerScienceGrade=" + computerScienceGrade +
                '}';
    }
}

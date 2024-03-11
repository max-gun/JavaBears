package springs.bootcamp.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "grades")
public class Grades {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long gradesId;

    @Column(name = "math_grade")
    private Integer mathGrade;

    @Column(name = "english_grade")
    private Integer englishGrade;

    @Column(name = "computer_science_grade")
    private Integer computerScienceGrade;

    public Grades() {
        this.mathGrade = 0;
        this.englishGrade = 0;
        this.computerScienceGrade = 0;
    }

    public Grades(Integer mathGrade, Integer englishGrade, Integer computerScienceGrade) {
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.computerScienceGrade = computerScienceGrade;
    }

    public Long getGradesId() {
        return gradesId;
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
        return "Grades{" +
                "gradesId=" + gradesId +
                ", mathGrade=" + mathGrade +
                ", englishGrade=" + englishGrade +
                ", computerScienceGrade=" + computerScienceGrade +
                '}';
    }
}

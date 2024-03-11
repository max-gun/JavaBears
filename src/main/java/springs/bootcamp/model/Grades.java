package springs.bootcamp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "grades")
public class Grades {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "math_grade")
    private Integer mathGrade;

    @Column(name = "english_grade")
    private Integer englishGrade;

    @Column(name = "computer_science_grade")
    private Integer computerScienceGrade;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Grades{" +
                "gradesId=" + id +
                ", mathGrade=" + mathGrade +
                ", englishGrade=" + englishGrade +
                ", computerScienceGrade=" + computerScienceGrade +
                '}';
    }
}

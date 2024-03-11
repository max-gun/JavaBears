package springs.bootcamp.model.entities;


import jakarta.persistence.*;
import springs.bootcamp.model.entities.Grades;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long studentId;

    @Column(name = "student_full_name", nullable = false, length = 100)
    private String studentName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "grades_id")
    private Grades grades;

    public Student() {
        grades = new Grades();
    }

    public Student(String studentName) {
        this.studentName = studentName;
        grades = new Grades();
    }

    public Student(String studentName, Grades grades) {
        this.studentName = studentName;
        this.grades = grades;
    }

    public Long getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Grades getGrades() {
        return grades;
    }

    public void setGrades(Grades grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", grades=" + grades +
                '}';
    }
}

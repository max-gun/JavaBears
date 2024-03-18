package springs.bootcamp.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springs.bootcamp.model.entities.Student;

import java.util.List;
import java.util.Map;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

    //SELECT s.student_name FROM mydb.student s
    @Query("SELECT s.studentName FROM Student s")
    List<String> findAllNames();

    @Query("SELECT s FROM Student s WHERE s.studentName=:name")
    Student findByName(String name);

    @Query("SELECT s.studentName, Grades\n" +
            "FROM Student AS s\n" +
            "JOIN Grades AS g\n" +
            "ON s.grades.gradesId=g.gradesId")
    List<Object[]> getGradesInSubject(String subjectName);
}

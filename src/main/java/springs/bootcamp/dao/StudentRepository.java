package springs.bootcamp.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springs.bootcamp.model.Student;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

    //SELECT s.student_name FROM mydb.student s
    @Query("SELECT s.studentName FROM Student s")
    List<String> findAllNames();
}

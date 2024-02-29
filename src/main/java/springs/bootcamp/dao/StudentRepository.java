package springs.bootcamp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springs.bootcamp.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
}

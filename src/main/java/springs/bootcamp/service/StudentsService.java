package springs.bootcamp.service;

import springs.bootcamp.model.Student;

import java.util.List;

/**
 * @author max.gun
 * @since 04/03/2024
 */
public interface StudentsService {

    Long getCountStudents();

    Boolean isExist(Long studentId);

    void registerStudent(String studentName, Integer math, Integer english, Integer cs);

    void registerStudent(Student student);

    List<String> getStudentsNames();

    Student getStudent(String name);
}

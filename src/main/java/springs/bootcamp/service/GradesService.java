package springs.bootcamp.service;

import springs.bootcamp.model.dto.SubjectStatistics;

import java.util.List;

public interface GradesService {
    List<String> getAllSubjects();

    SubjectStatistics getSubjectStatistics(String subjectName);
}

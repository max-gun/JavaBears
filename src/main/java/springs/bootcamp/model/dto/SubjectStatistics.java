package springs.bootcamp.model.dto;

import java.util.Map;

public class SubjectStatistics {

    private Double avg;
    Map<String, Integer> studentsGrades;

    public SubjectStatistics() {
    }

    public SubjectStatistics(Double avg, Map<String, Integer> studentsGrades) {
        this.avg = avg;
        this.studentsGrades = studentsGrades;
    }

    public Double getAvg() {
        return avg;
    }

    public void setAvg(Double avg) {
        this.avg = avg;
    }

    public Map<String, Integer> getStudentsGrades() {
        return studentsGrades;
    }

    public void setStudentsGrades(Map<String, Integer> studentsGrades) {
        this.studentsGrades = studentsGrades;
    }

    @Override
    public String toString() {
        return "SubjectStatistics{" +
                "avg=" + avg +
                ", studentsGrades=" + studentsGrades +
                '}';
    }
}

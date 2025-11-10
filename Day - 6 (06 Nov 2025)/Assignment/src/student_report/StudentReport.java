package student_report;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentReport {

    private String studentName;
    private List<Float> marks;

    public StudentReport(){}

    public StudentReport(String studentName) {
        this.studentName = studentName;
        this.marks = new ArrayList<Float>(3);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<Float> getMarks() {
        return marks;
    }

    public void setMarks(float mark1, float mark2, float mark3) {
        this.marks.clear();
        this.marks.add(mark1);
        this.marks.add(mark2);
        this.marks.add(mark3);
    }

    public Optional<Float> getTotal(){
        return this.marks.stream().reduce(Float::sum);
    }

    public Optional<Float> getAverageMarks(){
        return this.getTotal().map(total -> total / this.marks.size());
    }


}

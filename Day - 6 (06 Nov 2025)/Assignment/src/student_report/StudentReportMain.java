package student_report;

public class StudentReportMain {
    public static void main(String[] args) {

        StudentReport student1 = new StudentReport("Aman");
        student1.setMarks(20, 86, 53);

        System.out.printf("%s's total marks is : %.0f and average is %.2f", student1.getStudentName(), student1.getTotal().orElse(0f), student1.getAverageMarks().orElse(0f));

    }
}

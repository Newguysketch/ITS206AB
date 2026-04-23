public class Enrolment {
    private Student student;
    private Course course;
    private String enrolmentDate;

    public Enrolment(Student student, Course course, String enrolmentDate) {
        this.student = student;
        this.course = course;
        this.enrolmentDate = enrolmentDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getEnrolmentDate() {
        return enrolmentDate;
    }

    public void setEnrolmentDate(String enrolmentDate) {
        this.enrolmentDate = enrolmentDate;
    }

    public void displayEnrolmentDetails() {
        System.out.println("Student Name   : " + student.getName());
        System.out.println("Course         : " + course.getCourseCode() + " - " + course.getCourseName());
        System.out.println("Enrolment Date : " + enrolmentDate);
    }
}
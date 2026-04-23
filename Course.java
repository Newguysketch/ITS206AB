public class Course {
    private String courseCode;
    private String courseName;
    private int maximumCapacity;
    private String prerequisiteCourseCode;
    private int enrolledCount;

    public Course(String courseCode, String courseName, int maximumCapacity, String prerequisiteCourseCode) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.maximumCapacity = maximumCapacity;
        this.prerequisiteCourseCode = prerequisiteCourseCode;
        this.enrolledCount = 0;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public String getPrerequisiteCourseCode() {
        return prerequisiteCourseCode;
    }

    public void setPrerequisiteCourseCode(String prerequisiteCourseCode) {
        this.prerequisiteCourseCode = prerequisiteCourseCode;
    }

    public int getEnrolledCount() {
        return enrolledCount;
    }

    public boolean hasAvailableSeat() {
        return enrolledCount < maximumCapacity;
    }

    public void increaseEnrolment() {
        enrolledCount++;
    }

    public void displayCourseDetails() {
        System.out.println("Course Code        : " + courseCode);
        System.out.println("Course Name        : " + courseName);
        System.out.println("Maximum Capacity   : " + maximumCapacity);
        System.out.println("Enrolled Students  : " + enrolledCount);
        System.out.println("Prerequisite       : " + 
            (prerequisiteCourseCode.equals("None") ? "None" : prerequisiteCourseCode));
    }
}
public class Main {

    public static boolean hasCompletedPrerequisite(String[] completedCourses, String prerequisite) {
        if (prerequisite.equals("None")) {
            return true;
        }

        for (String course : completedCourses) {
            if (course.equalsIgnoreCase(prerequisite)) {
                return true;
            }
        }
        return false;
    }

    public static void enrolStudent(Student student, Course course, String[] completedCourses, String enrolmentDate) {
        System.out.println("\nAttempting to enrol " + student.getName() + " in " + course.getCourseCode());

        if (!hasCompletedPrerequisite(completedCourses, course.getPrerequisiteCourseCode())) {
            System.out.println("Enrolment failed: prerequisite not met.");
            System.out.println("Required prerequisite: " + course.getPrerequisiteCourseCode());
            return;
        }

        if (!course.hasAvailableSeat()) {
            System.out.println("Enrolment failed: course is full.");
            return;
        }

        course.increaseEnrolment();
        Enrolment enrolment = new Enrolment(student, course, enrolmentDate);

        System.out.println("Enrolment successful.");
        enrolment.displayEnrolmentDetails();
    }

    public static void main(String[] args) {

        // ✅ Updated names here
        Student student1 = new Student("S2500054", "Suyog Basukala", "suyog@email.com");
        Student student2 = new Student("S2500099", "Buyog Sasukala", "buyog@email.com");

        Course course1 = new Course("ITS101", "Introduction to Programming", 2, "None");
        Course course2 = new Course("ITS206", "Software Construction and Design", 2, "ITS101");

        String[] student1CompletedCourses = {"ITS101"};
        String[] student2CompletedCourses = {};

        System.out.println("===== STUDENT INFORMATION =====");
        student1.displayStudentInfo();
        System.out.println();
        student2.displayStudentInfo();

        System.out.println("\n===== COURSE DETAILS =====");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();

        System.out.println("\n===== ENROLMENT RESULTS =====");
        enrolStudent(student1, course2, student1CompletedCourses, "20/04/2026");
        enrolStudent(student2, course2, student2CompletedCourses, "20/04/2026");
        enrolStudent(student2, course1, student2CompletedCourses, "20/04/2026");
    }
}
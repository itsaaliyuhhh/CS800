package assignment1.aggregation;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Instructor> instructors;
    private List<Textbook> textbooks;

    public Course(String courseName) {
        this.courseName = courseName;
        this.instructors = new ArrayList<>();
        this.textbooks = new ArrayList<>();
    }
    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }
    public void addTextbook(Textbook textbook) {
        textbooks.add(textbook);
    }
    public void printCourseInfo() {
        System.out.println("Course Name: " + courseName);

        for (Instructor instructor : instructors) {
            System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName() +
                    " (Office: " + instructor.getOfficeNumber() + ")");
        }

        for (Textbook textbook : textbooks) {
            System.out.println("Textbook: " + textbook.getTitle() + " by " + textbook.getAuthor() +
                    " (Publisher: " + textbook.getPublisher() + ")");
        }
    }
}

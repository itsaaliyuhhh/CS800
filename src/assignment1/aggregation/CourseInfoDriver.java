package assignment1.aggregation;

public class CourseInfoDriver {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructor2 = new Instructor("Scott", "Edwards", "1-1234");

        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook textbook2 = new Textbook("Design Patterns", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides",
                "Addison-Wesley");

        Course course = new Course("Advanced Programming");

        course.addInstructor(instructor1);
        course.addInstructor(instructor2);
        course.addTextbook(textbook1);
        course.addTextbook(textbook2);

        course.printCourseInfo();
    }
}
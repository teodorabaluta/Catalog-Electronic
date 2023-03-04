import java.util.ArrayList;

public class FullCourse extends Course {

    public FullCourse(CourseBuilder builder) {
        super(builder);
    }

    @Override
    public ArrayList<Student> getGraduatedStudents() {
        ArrayList<Student> graduatedStudents = new ArrayList<>();
        for (Student student : getAllStudents()) {
            Grade grade = getGrade(student);
            if (grade != null && grade.getPartialScore() >= 3 && grade.getExamScore() >= 2) {
                graduatedStudents.add(student);
            }
        }
        return graduatedStudents;
    }

    public static class FullCoursesBuilder extends Course.CourseBuilder{

        @Override
        public Course build(){

            return new FullCourse( this );
        }
    }
}

import java.util.ArrayList;
import java.util.Set;

public class PartialCourse extends Course {

    public PartialCourse(CourseBuilder builder) {
        super(builder);
    }

    @Override
    public ArrayList<Student> getGraduatedStudents() {
        ArrayList<Student> graduatedStudents = new ArrayList<>();
        for (Student student : getAllStudents()) {
            Grade grade = getGrade(student);
            if (grade != null && grade.getTotal() >= 5) {
                graduatedStudents.add(student);
            }
        }
        return graduatedStudents;
    }

    @Override
    public Student getBestStudent(Set<Grade> grades) {
        return null;
    }

    public static class PartialCoursesBuilder extends Course.CourseBuilder{

        @Override
        public Course build(){

            return new PartialCourse( this );
        }
    }
}

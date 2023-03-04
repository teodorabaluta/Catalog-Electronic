import java.util.Set;

public class BestExamScore implements BestStudentStrategy {
    @Override
    public Student getBestStudent(Set<Grade> grades) {
        Student bestStudent = null;
        double bestScore = 0;
        for (Grade grade : grades) {
            if (grade.getExamScore() > bestScore) {
                bestStudent = grade.getStudent();
                bestScore = grade.getExamScore();
            }
        }
        return bestStudent;
    }
}

import java.util.Set;

public class BestPartialScore implements BestStudentStrategy {
    @Override
    public Student getBestStudent(Set<Grade> grades) {
        Student bestStudent = null;
        double bestScore = 0;
        for (Grade grade : grades) {
            if (grade.getPartialScore() > bestScore) {
                bestStudent = grade.getStudent();
                bestScore = grade.getPartialScore();
            }
        }
        return bestStudent;
    }


}

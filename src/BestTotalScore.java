import java.util.Set;

public class BestTotalScore implements BestStudentStrategy {
    @Override
    public Student getBestStudent(Set<Grade> grades) {
        Student bestStudent = null;
        double bestScore = 0;
        for (Grade grade : grades) {
            if (grade.getTotal() > bestScore) {
                bestStudent = grade.getStudent();
                bestScore = grade.getTotal();
            }
        }
        return bestStudent;
    }
}

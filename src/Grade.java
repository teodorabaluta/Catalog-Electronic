public class Grade implements Comparable<Grade>, Cloneable{
    private Double partialScore;
    private Double examScore;
    private String course;
    private Student student;

    public Grade(Double partialScore, Double examScore, Student student, String course) {
        this.partialScore = partialScore;
        this.examScore = examScore;
        this.student = student;
        this.course = course;
    }

    public Double getPartialScore() {
        return partialScore;
    }

    public void setPartialScore(Double partialScore) {
        this.partialScore = partialScore;
    }

    public Double getExamScore() {
        return examScore;
    }

    public void setExamScore(Double examScore) {
        this.examScore = examScore;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public int compareTo(Grade other) {
        if ((this.partialScore + this.examScore) > (other.partialScore + other.examScore)) {
            return 1;
        } else{
            if ((this.partialScore + this.examScore) < (other.partialScore + other.examScore)){
                return -1;
            }else{
                return 0;
            }
        }
    }

    public Double getTotal() {
        return partialScore + examScore;
    }

    @Override
    public String toString() {
        return "Grade{" + "partialScore=" + partialScore + ", examScore=" + examScore + ", course='" + course + '\'' + ", student=" + student + '}';
    }
}

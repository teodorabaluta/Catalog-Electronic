public class Notification {
    Grade grade;
    public  Notification(Grade grade){
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Notification{" + "grade=" + grade + '}';
    }
}

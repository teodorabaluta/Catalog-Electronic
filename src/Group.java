import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class Group extends TreeSet{
    private  String ID;
    private Assistant assistant;
    private TreeSet<Student> students;

    public Group(String ID, Assistant assistant, Comparator<Student> comp) {
        this.ID = ID;
        this.assistant = assistant;
        this.students = new TreeSet<>(comp);
    }

    public TreeSet<Student> getStudents() {
        return students;
    }

    public void setStudents(TreeSet<Student> students) {
        this.students = students;
    }

    public Group(String ID, Assistant assistant) {
        this.assistant = assistant;
        this.ID = ID;
    }

    public void setID(String ID){

        this.ID = ID;
    }
    public String getID() {

        return ID;
    }

    public Assistant getAssistant() {

        return assistant;
    }

    public void setAssistant(Assistant assistant) {

        this.assistant = assistant;
    }

    public void addStudent(Student student) {

        students.add(student);
    }

    public void removeStudent(Student student) {

        students.remove(student);
    }

}

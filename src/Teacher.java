public class Teacher extends User implements Visitor {

    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void visit(Assistant assistant) {

    }

    @Override
    public void visit(Teacher teacher) {

    }
}
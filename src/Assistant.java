public class Assistant extends User implements Visitor{

    public Assistant(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void visit(Assistant assistant) {

    }

    @Override
    public void visit(Teacher teacher) {

    }
}
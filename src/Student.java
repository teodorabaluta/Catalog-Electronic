public class Student extends User implements Element{
    private Parent mother;
    private Parent father;
    private Double partialScore;
    private Double examScore;

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void setMother(Parent mother) {
        this.mother = mother;
    }

    public void setFather(Parent father) {
        this.father = father;
    }

    public Parent getMother(){
        return mother;
    }

    public Parent getFather(){
        return father;
    }

    public void setPartialScore(Double partialScore) {
        this.partialScore = partialScore;
    }

    public void setExamScore(Double examScore) {
        this.examScore = examScore;
    }

    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

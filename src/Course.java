import java.util.*;

public abstract class Course implements BestStudentStrategy{
    private String name;
    private Teacher teacher;
    private Set<Assistant> assistants;
    private TreeSet<Grade> grades;
    private Map<String, Group> groups;
    private int creditPoints;
    private BestStudentStrategy strategy;


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Teacher getTeacher() {

        return teacher;
    }

    public void setTeacher(Teacher teacher) {

        this.teacher = teacher;
    }

    public int getCreditPoints() {

        return creditPoints;
    }

    public void setCreditPoints(int creditPoints) {

        this.creditPoints = creditPoints;
    }

    public void addAssistant(Assistant assistant) {

        assistants.add(assistant);
    }

    public void addAssistant(String ID, Assistant assistant) {
        Group group = groups.get(ID);
        if (group != null) {
            group.setAssistant(assistant);
            addAssistant(assistant);
        }
    }

    public void addStudent(String ID, Student student) {
        Group group = groups.get(ID);
        if (group != null) {
            group.addStudent(student);
        }
    }

    public void addGroup(Group group) {
        groups.put(group.getID(), group);
        //assistants.add(group.getAssistant());
    }

    public void addGroup(String ID, Assistant assistant) {
        Group group = new Group(ID, assistant);
        addGroup(group);
    }

    public void addGroup(String ID, Assistant assist, Comparator<Student> comp) {
        Group group = new Group(ID, assist, comp);
        addGroup(group);
    }

    public Grade getGrade(Student student) {
        for (Grade grade : grades) {
            if (grade.getStudent().equals(student)) {
                return grade;
            }
        }
        return null;
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public ArrayList<Student> getAllStudents() {
        ArrayList<Student> students = new ArrayList<>();
        for (Group group : groups.values()) {
            students.addAll(group.getStudents());
        }
        return students;
    }

    public HashMap<Student, Grade> getAllStudentGrades() {
        HashMap<Student, Grade> studentGrades = new HashMap<>();
        for (Grade grade : grades) {
            studentGrades.put(grade.getStudent(), grade);
        }
        return studentGrades;
    }
    public abstract ArrayList<Student> getGraduatedStudents();

    @Override
    public String toString() {
        return "Course{" + "name='" + name + '\'' + ", teacher=" + teacher + ", assistants=" + assistants + ", grades=" + grades + ", groups=" + groups + ", creditPoints=" + creditPoints + '}';
    }

    public Course(CourseBuilder builder){
        this.name = builder.name;
        this.teacher = builder.teacher;
        this.assistants = builder.assistants;
        this.groups = builder.groups;
        this.grades = (TreeSet<Grade>) builder.grades;
        this.creditPoints = builder.creditPoints;
    }
    public abstract static class CourseBuilder {
        private String name;
        private Teacher teacher;
        private Assistant assistant;
        private Set<Assistant> assistants;
        private List<Grade> grades;
        private Map<String, Group> groups;
        private int creditPoints;

        public CourseBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CourseBuilder setTeacher(Teacher teacher) {
            this.teacher = teacher;
            return this;
        }

        public CourseBuilder setAssistant(Assistant assistant) {
            this.assistant = assistant;
            return this;
        }

        public CourseBuilder setAssistants(Set<Assistant> assistants) {
            this.assistants = assistants;
            return this;
        }

        public CourseBuilder setGrades(List<Grade> grades) {
            this.grades = grades;
            return this;
        }

        public CourseBuilder setGroups(Map<String, Group> groups) {
            this.groups = groups;
            return this;
        }

        public CourseBuilder setCreditPoints(int creditPoints) {
            this.creditPoints = creditPoints;
            return this;
        }

        public abstract Course build();
    }

    public void setBestStudentStrategy(BestStudentStrategy strategy) {
        this.strategy = strategy;
    }

    public Student getBestStudent() {
        return strategy.getBestStudent(grades);
    }

}
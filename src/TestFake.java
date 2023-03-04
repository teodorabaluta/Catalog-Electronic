import java.util.HashSet;
import java.util.Set;

public class TestFake {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Viorel", "Mortu");
        Teacher teacher2 = new Teacher("Mirela", "Cazacu");
        Teacher teacher3 = new Teacher("Angelica", "Luntraru");

        Student student1 = new Student("Marius", "Marin");
        Student student2 = new Student("Valentina", "Baluta");
        Student student3 = new Student("Ionela", "Naziru");
        Student student4 = new Student("Ioana", "Macreanu");

        Assistant assistant1 = new Assistant("Diana", "Stefan");
        Assistant assistant2 = new Assistant("Diana", "Gorescu");
        Assistant assistant3 = new Assistant("Maria", "Costea");

        String numeCurs1 = "romana";
        String numeCurs2 = "matematica";
        String numeCurs3 = "engleza";

        Set<Assistant> assistants = new HashSet<>();
        assistants.add(assistant1);
        assistants.add(assistant2);
        assistants.add(assistant3);


        Course curs1 = new PartialCourse.PartialCoursesBuilder()
                .setName("romana")
                .setCreditPoints(10)
                .setTeacher(teacher1)
                .setAssistants(assistants)
                .build();
        System.out.println(curs1);
    }
}

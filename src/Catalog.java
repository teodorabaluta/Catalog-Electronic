import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Catalog implements Subject{

    public ArrayList<Parent> Parents;
    public static Catalog object = null;

    public static Catalog getCatalog(){
        if(object == null){
            object = new Catalog();
        }
        return object;
    }
    private List<Course> courses;

    // Add a course to the catalog
    public void addCourse(Course course) {
        courses.add(course);
    }

    // Delete a course from the catalog
    public void removeCourse(Course course) {
        courses.remove(course);
    }


    @Override
    public void addObserver(Observer observer) {

    }

    @Override
    public void removeObserver(Observer observer) {

    }

    public void notifyObservers(Grade grade) {

    }
}
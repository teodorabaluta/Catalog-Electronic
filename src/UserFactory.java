public class UserFactory {
    public static User getUser(String userType, String firstName, String lastName) {
        if (userType == null) {
            return null;
        }
        if (userType.equals("Parent")) {
            return new Parent(firstName, lastName);
        } else if (userType.equals("Student")) {
            return new Student(firstName, lastName);
        } else if (userType.equals("Assistant")) {
            return new Assistant(firstName, lastName);
        } else if (userType.equals("Teacher")) {
            return new Teacher(firstName, lastName);
        }
        return null;
    }
}

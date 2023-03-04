public class Parent extends User implements Observer{
    public Parent(String firstName, String lastName){

        super(firstName, lastName);
    }

    @Override
    public void update(Notification notification) {

    }
}
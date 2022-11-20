package AnimalRescue;

public class Birds extends Animal {

    @Override
    public void animalsound() {
        System.out.println("The sound of the birds in general is: cirip, cirip");
    }

    @Override
    public void activities() {
        System.out.println("The main activity of the birds is flying");
    }
}

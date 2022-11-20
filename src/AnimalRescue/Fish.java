package AnimalRescue;

public class Fish extends Animal {

    @Override
    public void animalsound() {
        System.out.println("Fish don't have specialized vocal cords, larynxes or vocal folds ");
    }

    @Override
    public void activities() {
        System.out.println("The main activity of a fish is swimming");
    }
}

package AnimalRescue;

public class SmallAnimals extends Animal {

    public void animalsound(){
        System.out.println("Guinea Pig's sound: onki, onki ");
    }

    @Override
    public void activities() {
        System.out.println("Guinea Pigs activity: running on the wheel ");
    }
}

package AnimalRescue;

public class GuineaPig extends SmallAnimals{
    @Override
    public void animalsound() {
        System.out.println("Guinea Pig's sound: onki, onki ");

    }

    @Override
    public void activities() {
        System.out.println("Guinea Pigs activity: running on the wheel ");

    }

    @Override
    public void eat() {

    }

    @Override
    public void run() {

    }

    @Override
    public void sleep() {
        System.out.println("Guinea pigs don't usually have regular sleeping habits in general. " +
                "They tend to sleep for short periods of time, kind of like short naps");
    }
}

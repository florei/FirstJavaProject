package AnimalRescue;

public abstract class Cat extends Animal {

    public abstract void purring ();
    public abstract void meow();
    public abstract void hissing ();
    public abstract void yowl ();
    public abstract void chattering ();


    public void animalsound (){
        System.out.println("Cat's sound: meow, meow");
    }

    @Override
    public void activities() {
        System.out.println("Cats activity: purring ");
    }

    @Override
    public void eat() {

    }

    @Override
    public void run() {

    }

    @Override
    public void sleep() {

    }
}

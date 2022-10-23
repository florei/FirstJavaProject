package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {

        Dog cic = new Dog();

        System.out.println(cic.name);
        System.out.println(cic.age);

        AnimalsFood food = new AnimalsFood();

        System.out.println(food.availability);

        Owner about = new Owner();

        System.out.println(about.nameOwner);

        RecreationalActivities activity = new RecreationalActivities();

        System.out.println(activity.activityName);

        Vet details = new Vet();

        System.out.println(details.speciality);

    }
}

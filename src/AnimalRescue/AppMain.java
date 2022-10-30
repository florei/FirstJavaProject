package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {

        Dog animal = new Dog();


        animal.setName("Rex");

        System.out.println("Pet's name is:" + animal.getName());

        animal.setAge(1);

        System.out.println("The age of the pet is:"+ animal.getAge());


        AnimalsFood food = new AnimalsFood();

        food.setPrice(6);
        System.out.println("The price of the product is (euro):" + food.getPrice());

        food.setAvailability("available");
        System.out.println("Status food availability:" + food.getAvailability());


        Owner about = new Owner();

        about.setNameOwner("Stefan");

        System.out.println("Name of the owner is:" + about.getNameOwner());



        RecreationalActivities activity = new RecreationalActivities();

        activity.setActivityName("Playing with the ball");

        System.out.println("The recreational activity is:" + activity.getActivityName());



        Vet details = new Vet();

        details.setSpeciality("Surgery");

        System.out.println("The vet speciality is:" + details.getSpeciality());

    }
}

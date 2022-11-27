package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {

      /*  Dog animal = new Dog();


        animal.setName("Rex");

        System.out.println("Pet's name is:" + animal.getName());

        animal.setAge(1);

        System.out.println("The age of the pet is:"+ animal.getAge());


        CatFood food = new CatFood();

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
*/

        BullDogs max = new BullDogs();
        max.setName("Max");
        System.out.println("The BullDog's name is:" + max.getName());
        System.out.println("BullDog Particularities:");
        max.featuresBullDog();

        RagdollCats kitty = new RagdollCats();

        kitty.setName("Kitty");
        System.out.println("The RaddollCat's name is:" + kitty.getName());
        kitty.setAge(5);
        System.out.println("The RaddollCat's age is:" + kitty.getAge());
        System.out.println("RagdollCat features are:");


        Reptiles snake = new Reptiles();
        snake.animalsound();
        snake.activities();

        GuineaPig guineaPig = new GuineaPig();
        guineaPig.animalsound();
        guineaPig.activities();
        guineaPig.sleep();

        Birds birds = new Birds();
        birds.animalsound();
        birds.activities();

        Fish fish = new Fish();
        fish.animalsound();
        fish.activities();
        fish.eat();


        Nurse nurse = new Nurse();
        nurse.expertness();
        Vet vet = new Vet();
        vet.expertness();

        Women woman = new Women();
        woman.nameOwner();
        woman.ageOfTheOwner();
        woman.telephoneNumber();
    }
}

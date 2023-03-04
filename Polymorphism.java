public class Polymorphism {

    public static void main(String args[]) {
        System.out.println("Hello World");
        FarmAnimal cow1 = new FarmAnimal(234542);
        FarmAnimal cow2 = new FarmAnimal(123321);
        FarmAnimal cow3 = new FarmAnimal(657767);
        FarmAnimal sheep1 = new FarmAnimal("Daisy");

        cow1.display();
        cow2.display();
        cow3.display();
        sheep1.display();

        Cow animal1 = new Cow("Daisy");
        Pig animal2 = new Pig(42);
        System.out.println(animal1.getName() + " says " + animal1.noise());
        System.out.println(animal2.getName() + " says " + animal2.noise());

        // Exercise 3 answer : "a vague snuffling noise"

    }
}

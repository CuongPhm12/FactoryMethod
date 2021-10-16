public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal a1 = AnimalFactory.getAnimal("feline");
        System.out.println("a1 sound: " + a1.makeSound());

        Animal a2 = AnimalFactory.getAnimal("canine");
        System.out.println("a2 sound " + a2.makeSound());
    }
}

public class Pigeon extends Bird implements Flyable {

    public Pigeon(int size, int weight, String type) {
        super(size, weight, type);
    }

    @Override
    public void fly() {
        System.out.println("Pigeon can fly !");
    }

    @Override
    public void eat() {
        System.out.println(type + " can eats");
    }

    @Override
    public void makeSound() {
        System.out.println(type + " can make sound");
    }
}

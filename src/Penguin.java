public class Penguin extends Bird {

    public Penguin(int size, int weight, String type) {
        super(size, weight, type);
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

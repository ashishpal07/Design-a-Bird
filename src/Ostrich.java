public class Ostrich extends Bird {

    public Ostrich(int size, int weight, String type) {
        super(size, weight, type);
    }

    @Override
    public void eat() {
        System.out.println(type + " can eat!");
    }

    @Override
    public void makeSound() {
        System.out.println(type + " can make sound!");
    }
}

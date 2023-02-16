public abstract class Bird {

    int size;
    int weight;
    String type;

    public void eat(String type) {
        System.out.println(type + " can eat!");
    }

    public void makeSound(String type) {
        System.out.println(type + " can make sound !");
    }

}

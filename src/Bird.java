public abstract class Bird {

    int size;
    int weight;
    String type;

    public Bird(int size, int weight, String type) {
        this.size = size;
        this.weight = weight;
        this.type = type;
    }

    public abstract void eat();

    public abstract void makeSound();

}

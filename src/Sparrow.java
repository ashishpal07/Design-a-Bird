import java.awt.datatransfer.FlavorEvent;

public class Sparrow extends Bird implements DefaultFlyable {


    public Sparrow(int size, int weight, String type) {
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

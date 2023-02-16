public class Ostrich extends Bird implements NonFlyable {
    @Override
    public void nonFly() {
        System.out.println("Ostrich can not fly!");
    }
}

public class Sparrow extends Bird implements Flyable {

    FlyingBehaviour fb;
    public Sparrow(FlyingBehaviour fb) {
        this.fb = new CrowSparrowFlying();
    }

    @Override
    public void fly() {
        fb.makeFly("Sparrow");
    }
}

public class Crow extends Bird implements Flyable {
    FlyingBehaviour fb;

    public Crow(FlyingBehaviour fb) {
        this.fb = new CrowSparrowFlying();
    }

    @Override
    public void fly() {
        fb.makeFly("Crow");
    }
}

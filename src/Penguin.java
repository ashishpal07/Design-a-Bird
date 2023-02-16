import javax.sound.midi.SysexMessage;

public class Penguin extends Bird implements NonFlyable {

    @Override
    public void nonFly() {
        System.out.println("Penguin can not fly!");
    }
}

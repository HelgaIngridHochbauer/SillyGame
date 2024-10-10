import java.util.Random;

public class InputDevice {
    private Random random;

    public InputDevice() {
        this.random = new Random();
    }

    public String getType() {
        return "random";
    }

    public int nextInt() {
        return random.nextInt(100) + 1;
    }
}

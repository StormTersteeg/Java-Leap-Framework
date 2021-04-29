package src;
import src.core.Frame;
import src.views.*;

public class Main {
    public static boolean enableAudio = true;

    public static void main(String[] args) {
        Frame frame = new Frame();

        // Add custom views here
        frame.addPanel(new Test(frame.getContainer(), "Test"));
    }
}
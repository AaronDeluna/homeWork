package homework3.phone.factory.factory;

import homework3.phone.factory.components.Camera;
import homework3.phone.factory.components.Frame;
import homework3.phone.factory.components.Processor;
import homework3.phone.factory.phone.Samsung;

public class SamsungFactory {
    private static final int MHZ = 1500;
    private static final int MEGAPIXELS = 16;
    private static final int WIDTH = 60;
    private static final int HEIGHT = 200;
    private static final int LENGTH = 15;

    public static Samsung createSamsung() {
        Processor processor = new Processor(MHZ);
        Camera camera = new Camera(MEGAPIXELS);
        Frame frame = new Frame(WIDTH, HEIGHT, LENGTH);
        return new Samsung(processor, camera, frame);
    }
}

package homework3.phone.factory.factory;

import homework3.phone.factory.components.Camera;
import homework3.phone.factory.components.Frame;
import homework3.phone.factory.components.Processor;
import homework3.phone.factory.phone.Iphone;

public class IphoneFactory {
    private static final int MHZ = 1000;
    private static final int MEGAPIXELS = 8;
    private static final int WIDTH = 60;
    private static final int HEIGHT = 200;
    private static final int LENGTH = 10;

    public static Iphone createIphone() {
        Processor[] processors = {new Processor(MHZ), new Processor(MHZ)};
        Camera camera = new Camera(MEGAPIXELS);
        Frame frame = new Frame(WIDTH, HEIGHT, LENGTH);
        return new Iphone(processors, camera, frame);
    }
}

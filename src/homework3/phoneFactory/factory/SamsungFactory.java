package homework3.phoneFactory.factory;

import homework3.phoneFactory.components.Camera;
import homework3.phoneFactory.components.Frame;
import homework3.phoneFactory.components.Processor;
import homework3.phoneFactory.phone.Samsung;

public class SamsungFactory {
    public static Samsung createSamsung() {
        Processor processor = new Processor(1500);
        Camera camera = new Camera(16);
        Frame frame = new Frame(60, 200, 15);
        return new Samsung(processor, camera, frame);
    }
}

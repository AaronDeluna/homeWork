package homework3.phoneFactory.phone;

import homework3.phoneFactory.components.Camera;
import homework3.phoneFactory.components.Frame;
import homework3.phoneFactory.components.Processor;

public class Samsung extends Phone {
    private Processor processor;

    public Samsung(Processor processor, Camera camera, Frame frame) {
        super(camera, frame);
        this.processor = processor;
    }
}

package homework3.phone.factory.phone;

import homework3.phone.factory.components.Camera;
import homework3.phone.factory.components.Frame;
import homework3.phone.factory.components.Processor;

public class Samsung extends Phone {
    private Processor processor;

    public Samsung(Processor processor, Camera camera, Frame frame) {
        super(camera, frame);
        this.processor = processor;
    }
}

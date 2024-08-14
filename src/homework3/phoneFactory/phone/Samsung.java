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

    //TODO - Подумать над методом, возможно он тут и не нужен
    public void takePhoto() {
        super.takePhoto();
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }
}

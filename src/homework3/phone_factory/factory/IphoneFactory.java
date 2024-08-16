package homework3.phone_factory.factory;

import homework3.phone_factory.components.Camera;
import homework3.phone_factory.components.Frame;
import homework3.phone_factory.components.Processor;
import homework3.phone_factory.phone.Iphone;

public class IphoneFactory {

    public static Iphone createIphone() {
        Processor[] processors = {new Processor(1000), new Processor(1000)};
        Camera camera = new Camera(8);
        Frame frame = new Frame(60, 200, 10);
        return new Iphone(processors, camera, frame);
    }
}

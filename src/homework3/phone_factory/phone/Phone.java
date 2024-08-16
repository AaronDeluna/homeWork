package homework3.phone_factory.phone;

import homework3.phone_factory.components.Camera;
import homework3.phone_factory.components.Frame;

public abstract class Phone {
    private Camera camera;
    private Frame frame;

    public Phone(Camera camera, Frame frame) {
        this.camera = camera;
        this.frame = frame;
    }

    public void takePhoto() {
        camera.takePhoto();
    }
}

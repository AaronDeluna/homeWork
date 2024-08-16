package homework3.phone.factory.phone;

import homework3.phone.factory.components.Camera;
import homework3.phone.factory.components.Frame;

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

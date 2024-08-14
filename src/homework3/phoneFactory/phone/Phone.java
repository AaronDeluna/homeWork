package homework3.phoneFactory.phone;

import homework3.phoneFactory.components.Camera;
import homework3.phoneFactory.components.Frame;

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

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }
}

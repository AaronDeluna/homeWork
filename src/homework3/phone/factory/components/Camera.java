package homework3.phone.factory.components;

public class Camera {
    private int megapixels;

    public Camera(int megapixels) {
        this.megapixels = megapixels;
    }

    public void takePhoto() {
        System.out.println("сделано фото");
    }
}

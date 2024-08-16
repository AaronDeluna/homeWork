package homework3.phone.factory.phone;

import homework3.phone.factory.components.Camera;
import homework3.phone.factory.components.Frame;
import homework3.phone.factory.components.Processor;

public class Iphone extends Phone {
    private Processor[] processors;
    public Iphone(Processor[] processors, Camera camera, Frame frame) {
        super(camera, frame);
        this.processors = processors;
    }

    public void printProcessorInfo() {
        for (Processor processor : processors) {
            System.out.println("Iphone: Процессор с частатой: " + processor.getMhz() + " Mhz");
        }
    }
}

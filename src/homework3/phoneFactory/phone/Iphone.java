package homework3.phoneFactory.phone;

import homework3.phoneFactory.components.Camera;
import homework3.phoneFactory.components.Frame;
import homework3.phoneFactory.components.Processor;

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

package mirea.lab6.task6_10;

public class Computer {
    private Brand brand;
    private Processor processor;
    private Monitor monitor;
    private Memory memory;

    public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor){
        this.brand=brand;
        this.memory=memory;
        this.monitor=monitor;
        this.processor=processor;
    }

    public Brand getBrand() {
        return brand;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Processor getProcessor() {
        return processor;
    }

    @Override
    public String toString(){
        return "Computer [brand=" + brand + ", processor=" + processor.getModel() + ", memory=" + memory.getSize() + "GB, monitor=" + monitor.getSize() + "\"]";
    }
}

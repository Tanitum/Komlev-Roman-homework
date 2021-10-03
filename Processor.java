package Component;

public class Processor extends Component { //процессор
    private String processor;
    private int numbercores;
    private double frequency;

    public Processor(String processor) {
        this(processor, 8, 2.50);
    }

    public Processor(String processor2, int numbercores2, double frequency2) {
        processor = processor2;
        this.numbercores = numbercores2;
        frequency = frequency2;
    }

    public String toString() {
        return processor + " (" + numbercores + "-ядерный, " + super.toString()+", частота: "+ frequency + " GHz)";
    }
}

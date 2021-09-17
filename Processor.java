package Component;

public class Processor extends Component { //процессор
    String _processor;
    int numbercores;
    double _frequency;

    public Processor(String processor) {
        this(processor, 8, 2.50);
    }

    public Processor(String processor, int numbercores, double frequency) {
        _processor = processor;
        this.numbercores = numbercores;
        _frequency = frequency;
    }

    public String toString() {
        return _processor + " (" + numbercores + "-ядерный, " + super.toString()+", частота: "+ _frequency + " GHz)";
    }
}

package Component;

public class Harddisk extends Component { //монитор
    String _harddisk;
    String _type;
    int _capacity;
    public Harddisk(String processor) {
        this(processor, "internal", 800);
    }

    public Harddisk(String harddisk, String type, int capacity) {
        _harddisk= harddisk;
        _type = type;
        _capacity = capacity;
    }

    public String toString() {
        return _harddisk +" (тип:"+_type+" объем:"+_capacity+", " + super.toString()+")";
    }
}

package Component;

public class Harddisk extends Component { //монитор
    private String harddisk;
    private String type;
    private int capacity;
    public Harddisk(String processor) {
        this(processor, "internal", 800);
    }

    public Harddisk(String harddisk2, String type2, int capacity2) {
        harddisk= harddisk2;
        type = type2;
        capacity = capacity2;
    }

    public String toString() {
        return harddisk +" (тип:"+type+" объем:"+capacity+", " + super.toString()+")";
    }
}

package Component;

public class Ozu extends Component { //ОЗУ
    String ozu1;
    String memory;
    int frequency;

    public Ozu(String ozu) {
        ozu1 = ozu;
        frequency = 800;
        memory ="10 ГБ";
    }

    public String toString() {
        return ozu1 + " (память:"+memory+", " + super.toString() +" частота:"+ frequency + " MHz)";
    }
}

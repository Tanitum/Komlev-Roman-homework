package Component;

public class Display extends Component { //монитор
    String display1;

    public Display(String display) {
        display1 = display;
    }

    public String toString() {
        return display1 +" (" +super.toString()+")";
    }
}

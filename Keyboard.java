package Component;

public class Keyboard extends Component { //клавиатура
    String keyboard1;

    public Keyboard(String keyboard) {
        keyboard1 = keyboard;
    }

    public String toString() {
        return keyboard1+" (" + super.toString()+")";
    }
}

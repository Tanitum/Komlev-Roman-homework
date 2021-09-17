package Component;

public class GraphicsCard extends Component { //видеокарта
    String graphicsCard1;
    String memory;

    public GraphicsCard(String graphicsCard) {
        super("Intel");
        graphicsCard1 = graphicsCard;
        memory = "8 ГБ";
    }

    public String toString() {
        return graphicsCard1 + " (" + memory + ", " + super.toString() + ")";
    }
}

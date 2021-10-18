package Component;

public class GraphicsCard extends Component { //видеокарта
    private String graphicsCard1;
    private String memory;

    public GraphicsCard(String graphicsCard) {
        super("Intel");
        graphicsCard1 = graphicsCard;
        memory = "8 ГБ";
    }

    public String toString() {
        return graphicsCard1 + " (" + memory + ", " + super.toString() + ")";
    }
}

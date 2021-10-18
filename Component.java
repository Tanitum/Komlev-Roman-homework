package Component;

public abstract class Component
{
    protected String componentmaker;
    public Component(){
        this("Asus");
    }
    public Component( String componentmaker){
        this.componentmaker = componentmaker;
    }

    public String toString() {
        return "Производитель: "+componentmaker;
    }
}



package Component;

public abstract class Component
{
    String _componentmaker;
    public Component(){
        this("Asus");
    }
    public Component( String componentmaker){
        this._componentmaker = componentmaker;
    }

    public String toString() {
        return "Производитель: "+_componentmaker;
    }
}



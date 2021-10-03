package com.company;
import Component.*;
public abstract class ComputerImpl implements Computer
{
    protected String maker;
    protected String model;
    protected Harddisk harddisk;
    protected Processor processor;
    protected Ozu ozu;
    //так мы избавляемся от дублирующего кода
    //в дальнейшем, все что нам нужно - переопределить метод toString
    public String toString()
    {
        return ("Модель: "+this.model+" Производитель: "+this.maker+" Процессор: "+this.processor+" Жёсткий диск: "+this.harddisk+" ОЗУ: "+this.ozu);
    }
    public String turnOn() {
        return "Turn on "+getClass().getSimpleName()+" "+toString();
    }

    public String turnOff() {
        return "Turn off "+getClass().getSimpleName()+" "+toString();
    }

    public String connect() {
        return "Connect to internet "+getClass().getSimpleName()+" "+toString();
    }
}

abstract class PortableComputer extends ComputerImpl{ // портативный компьютер
    protected Display display;
    protected Keyboard keyboard;
    public String toString()
    {
        return ("Модель: "+this.model+" Производитель: "+this.maker+" Процессор: "+this.processor+" Жёсткий диск: "+this.harddisk+" ОЗУ: "+this.ozu+" Монитор: "+this.display+" Клавиатура: "+this.keyboard);
    }
}
abstract class DesktopComputer extends ComputerImpl{ // настольный компьютер

}

class Laptop extends PortableComputer // Ноутбук: процессор, ОЗУ, жесткий диск, монитор, клавиатура
{
    public Laptop(String Model, String Maker, Processor Processor2, Harddisk Harddisk2, Ozu Ozu2, Display Display2, Keyboard Keyboard2) {
        maker =Maker;
        model =Model;
        harddisk =Harddisk2;
        ozu =Ozu2;
        processor =Processor2;
        this.display =Display2;
        this.keyboard =Keyboard2;
    }
}

class Netbook extends PortableComputer // Нетбук: процессор, ОЗУ, жесткий диск, монитор, клавиатура
{
    public Netbook(String Model, String Maker, Processor Processor2, Harddisk Harddisk2, Ozu Ozu2, Display Display2, Keyboard Keyboard2) {
        maker =Maker;
        model =Model;
        harddisk =Harddisk2;
        ozu =Ozu2;
        processor =Processor2;
        display =Display2;
        keyboard =Keyboard2;
    }
}

class Tablet extends PortableComputer // планшет: процессор, ОЗУ, жесткий диск, монитор, клавиатура
{
    public Tablet(String Model, String Maker, Processor Processor2, Harddisk Harddisk2, Ozu Ozu2, Display Display2, Keyboard Keyboard2) {
        maker =Maker;
        model =Model;
        harddisk =Harddisk2;
        ozu =Ozu2;
        processor =Processor2;
        display =Display2;
        keyboard =Keyboard2;
    }
}


class PersonalComputer extends DesktopComputer // ПК: процессор, ОЗУ, жесткий диск, видеокарта
{
    private GraphicsCard graphicsCard;
    public PersonalComputer(String Model, String Maker, Processor Processor2, Harddisk Harddisk2, Ozu Ozu2,GraphicsCard graphicsCard2) {
        maker =Maker;
        model =Model;
        harddisk =Harddisk2;
        ozu =Ozu2;
        processor =Processor2;
        graphicsCard=graphicsCard2;
    }
    public String toString()
    {
        return ("Модель: "+this.model+" Производитель: "+this.maker+" Процессор: "+this.processor+" Жёсткий диск: "+this.harddisk+" ОЗУ: "+this.ozu+" Видеокарта: "+this.graphicsCard );
    }
}

class Nettop extends DesktopComputer // Неттоп: процессор, ОЗУ, жесткий диск
{
    public Nettop(String Model, String Maker, Processor Processor2, Harddisk Harddisk2, Ozu Ozu2) {
        maker =Maker;
        model =Model;
        harddisk =Harddisk2;
        ozu =Ozu2;
        processor =Processor2;
    }
}

class Monoblock extends DesktopComputer // Моноблок: процессор, ОЗУ, жесткий диск, монитор
{
    Display display;
    public Monoblock (String Model, String Maker, Processor Processor2, Harddisk Harddisk2, Ozu Ozu2,Display Display2) {
        maker =Maker;
        model =Model;
        harddisk =Harddisk2;
        ozu =Ozu2;
        processor =Processor2;
        display =Display2;
    }
    public String toString()
    {
        return ("Модель: "+this.model+" Производитель: "+this.maker+" Процессор: "+this.processor+" Жёсткий диск: "+this.harddisk+" ОЗУ: "+this.ozu+" Монитор: "+this.display);
    }
}

class Server extends ComputerImpl // Сервер: процессор, ОЗУ, жесткий диск
{
    public Server (String Model, String Maker, Processor Processor2, Harddisk Harddisk2, Ozu Ozu2) {
        maker =Maker;
        model =Model;
        harddisk =Harddisk2;
        ozu =Ozu2;
        processor =Processor2;
    }
}
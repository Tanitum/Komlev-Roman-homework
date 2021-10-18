package com.company;
import java.util.*;
import java.math.*;
import Component.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {
    public static Scanner scan= new Scanner (System.in);
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("B.txt"); // этот файл находится на одном уровне с src
        Scanner scan2 = new Scanner(f);

        Vector a = new Vector(5,6,7);
        Vector b = new Vector(8,9,10);
        // Ввод координат с клавиатуры:
        //   Vector c = new Vector(scan.nextDouble(),scan.nextDouble(),scan.nextDouble());
        //   Vector e = new Vector(scan.nextDouble(),scan.nextDouble(),scan.nextDouble());
        System.out.println("Задание 1");
        System.out.println("Длина вектора a: " + a.length());
        System.out.println("Длина вектора b: " + b.length());
        System.out.println("Скалярное произведение векторов a и b: " + a.scalarProduct(b));
        System.out.println("Векторное произведение векторов a и b: " + a.crossProduct(b));
        System.out.println("Косинус между векторами a и b: " + a.cos(b));
        System.out.println("Сумма двух векторов a и b: " + a.add(b));
        System.out.println("Разность двух векторов a и b: " + a.subtract(b));
        System.out.println("hashCode а: " + a.hashCode());
        System.out.println("hashCode b: " + b.hashCode());
        System.out.println("equals a и b: " + a.equals(b));

        System.out.println("");
        System.out.println("Задание 2");
        Keyboard k = new Keyboard("Какая-то клава");
        GraphicsCard v = new GraphicsCard("Старая видеокарта");
        Display d= new Display("Лучший дисплей");
        Computer[] computers={
                new Laptop("11","12",new Processor("13"),new Harddisk("14"),new Ozu("15"),d,k),
                new Netbook("21","22",new Processor("23"),new Harddisk("24"),new Ozu("25"),d,k),
                new Tablet("31","32",new Processor("33"),new Harddisk("34"),new Ozu("35"), d,k),
                new PersonalComputer("41","42",new Processor("43"),new Harddisk("44"),new Ozu("45"),v),
                new Nettop("51","52",new Processor("53"),new Harddisk("54"),new Ozu("55")),
                new Monoblock("61","62",new Processor("63"),new Harddisk("64"),new Ozu("65"),d),
                new Server("71","72",new Processor("73"),new Harddisk("74"),new Ozu("75"))};
        for(int i=0;i<7;i++){
            System.out.println(computers[i].turnOn());
            System.out.println(computers[i].turnOff());
            System.out.println(computers[i].connect());
            System.out.println();
        }

        int number=0;
        Computer[] computers2=new Computer[999999]; // массив компьютеров из файла
        while (scan2.hasNextLine()) {
            String[] words = scan2.nextLine().split(" "); // массив всех слов из строки
            if (words[0].equals("Laptop")){
                Keyboard k2 = new Keyboard(words[7]);
                Display d2= new Display(words[6]);
                 computers2[number]= new Laptop(words[1], words[2], new Processor(words[3]), new Harddisk(words[4]), new Ozu(words[5]), d2, k2);
            }
            if (words[0].equals("Netbook")){
                Keyboard k2 = new Keyboard(words[7]);
                Display d2= new Display(words[6]);
                computers2[number]= new Netbook(words[1], words[2], new Processor(words[3]), new Harddisk(words[4]), new Ozu(words[5]), d2, k2);
            }
            if (words[0].equals("Tablet")){
                Keyboard k2 = new Keyboard(words[7]);
                Display d2= new Display(words[6]);
                computers2[number]= new Tablet(words[1], words[2], new Processor(words[3]), new Harddisk(words[4]), new Ozu(words[5]), d2, k2);
            }
            if (words[0].equals("PersonalComputer")){
                GraphicsCard v2 = new GraphicsCard(words[6]);
                computers2[number]= new PersonalComputer(words[1], words[2], new Processor(words[3]), new Harddisk(words[4]), new Ozu(words[5]), v2);
            }
            if (words[0].equals("Nettop")){
                computers2[number]= new Nettop(words[1], words[2], new Processor(words[3]), new Harddisk(words[4]), new Ozu(words[5]));
            }
            if (words[0].equals("Monoblock")){
                Display d2= new Display(words[6]);
                computers2[number]= new Monoblock(words[1], words[2], new Processor(words[3]), new Harddisk(words[4]), new Ozu(words[5]), d2);
            }
            if (words[0].equals("Server")){
                computers2[number]= new Server(words[1], words[2], new Processor(words[3]), new Harddisk(words[4]), new Ozu(words[5]));
            }
            number+=1;
 //           computers2[0].
        }
        for(int j=0;j<number;j++){ // вывод всех компьютеров из файла
            System.out.println(computers2[j].turnOn());
            System.out.println(computers2[j].turnOff());
            System.out.println(computers2[j].connect());
            System.out.println();
        }

    }
}

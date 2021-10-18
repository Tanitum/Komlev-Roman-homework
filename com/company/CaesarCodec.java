package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class CaesarCodec implements Coder {
    int key;
    Map<Integer,Character> mapMoved;
    Map<Integer,Character> mapStandard;

    public CaesarCodec(int key){
        char [] a= {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П',
                'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'}; //всего 33 буквы
        this.key=key;
        while (key>=33){key-=33;}
        while (key<0){key+=33;} // в итоге key принимает значения от 0 до 32
        Map<Integer, Character>mapStandard=new HashMap<>();
        for (int i=0;i<33;i++){
            mapStandard.put(i,a[i]);
        }
        this.mapStandard=mapStandard;

        Map<Integer, Character>mapMoved=new HashMap<>();
        for (int i=0;i<33;i++){
            if (i+key<33){
                mapMoved.put(i+key,a[i]);}
            else {mapMoved.put(i+key-33,a[i]);}
        }
        this.mapMoved=mapMoved;
    }

    public String decode(String input) { //раскодировать
        String r = "";
        for (int i = 0; i < input.length(); i++) { // считывание очередного символа
            if (input.charAt(i) != ' ') {
                for (Map.Entry entry : mapStandard.entrySet()) {
                    if (Objects.equals(entry.getValue(), input.charAt(i))) {
                        for (Map.Entry entry2 : mapMoved.entrySet()) {
                            if (Objects.equals((Integer) entry.getKey(), (Integer) entry2.getKey())) {
                                r += entry2.getValue();
                            }
                        }
                    }
                }
            }else {r+=" ";}
        }
        return r;
    }

    public String encode(String input){ //закодировать
        String x = "";
        for (int i = 0; i < input.length(); i++) { // считывание очередного символа
            if (input.charAt(i) != ' ') {
                for (Map.Entry entry : mapMoved.entrySet()) {
                    if (Objects.equals(entry.getValue(), input.charAt(i))) {
                        for (Map.Entry entry2 : mapStandard.entrySet()) {
                            if (Objects.equals((Integer) entry.getKey(), (Integer) entry2.getKey())) {
                                x += entry2.getValue();
                            }
                        }
                    }
                }
            }else {x+=" ";}
        }
        return x;
    }

    public static void main (String[]args){
        CaesarCodec c = new CaesarCodec(3);
        System.out.println(c.encode("АБ")); //ГД
        System.out.println(c.decode("ГЕ")); //АВ
        CaesarCodec n = new CaesarCodec(-2);
        System.out.println(n.encode("ЕК")); //ГИ
        System.out.println(n.decode("ИА")); //КВ
        System.out.println(n.encode("А Б В Г Д Е Ё Ж З И Й К Л М Н О П Р С Т У Ф Х Ц Ч Ш Щ Ъ Ы Ь Э Ю Я"));
        //Ю Я А Б В Г Д Е Ё Ж З И Й К Л М Н О П Р С Т У Ф Х Ц Ч Ш Щ Ъ Ы Ь Э
        System.out.println(n.decode("А Б В Г Д Е Ё Ж З И Й К Л М Н О П Р С Т У Ф Х Ц Ч Ш Щ Ъ Ы Ь Э Ю Я"));
        //В Г Д Е Ё Ж З И Й К Л М Н О П Р С Т У Ф Х Ц Ч Ш Щ Ъ Ы Ь Э Ю Я А Б
        CaesarCodec d = new CaesarCodec(67);
        System.out.println(d.encode("ЕК")); //ЁЛ
        System.out.println(d.decode("ИА")); //ЗЯ
    }
}
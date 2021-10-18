package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Names {
    public static HashMap<String, String> createMap(){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Иванов","Иван");
        map.put("Петров","Пётр");
        map.put("Крылов","Пётр");
        map.put("Соколов","Пётр");
        map.put("Пушкин","Александр");
        map.put("Журавлёв","Василий");
        map.put("Алексеев","Иван");
        map.put("Кузнецов","Роман");
        map.put("Рыбкин","Глеб");
        map.put("Попов","Василий");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashSet<String> names = new HashSet<String>();
        HashSet<String> repeatNames = new HashSet<String>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!names.add(entry.getValue()))
                repeatNames.add(entry.getValue());
        }
        for (String name : repeatNames) {
            removeItemFromMapByValue(map,name);
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        Iterator itr = map.entrySet().iterator();
        while(itr.hasNext()) {
            HashMap.Entry entry = (HashMap.Entry) itr.next();
            if(entry.getValue().equals(value)){
                map.remove(entry.getKey(), entry.getValue());
                itr = map.entrySet().iterator();}
        }
    }

    public static void printMap(HashMap<String,String> map){
        for(HashMap.Entry entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        printMap(map);
        removeTheFirstNameDuplicates(map);
        printMap(map);
    }
}

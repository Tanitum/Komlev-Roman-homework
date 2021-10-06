package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("Вывод задачи 1");
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        System.out.println(i+" "+s);
        System.out.println(pair);
        System.out.println(pair2.getFirst()+" "+pair2.getSecond());
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); //true!
        System.out.println(mustBeTrue+" "+mustAlsoBeTrue);
        System.out.println(pair.hashCode()+" "+pair2.hashCode());

    }
}

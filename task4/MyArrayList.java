package task4;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Должен наследовать SimpleList
 *
 * Должен иметь 2 конструктора
 * - без аргументов - создает внутренний массив дефолтного размера
 на ваш выбор
 * - с аргументом - начальный размер массива
 */
public class MyArrayList implements SimpleList { // в этот список нельзя передавать 0 (0 считается за неопределённый элемент)
    public int array[];
    public int current_size; // количество элементов в листе
    public int size; // текущий размер листа; удваивается каждый раз, когда начинает совпадать с current_size

    public MyArrayList() { // ваш 1й конструктор
        this (150);
    }

    public MyArrayList(int capacity) { // ваш 2й конструктор
        size = capacity;
        array = new int[size];
    }

    @Override
    public void add(int item) { // Добавить элемент в конец списка
        if (current_size >= size) {
            int[] new_array = new int[size * 2];
            for (int i = 0; i < size; i++) {
                new_array[i] = array[i];
            }
            size *= 2;
            array = new_array;
        }
        array[current_size] = item;
        current_size+=1;
    }

    @Override
    public int remove(int idx) throws NoSuchElementException { // Удалить элемент по индексу idx, если такого индекса нет или он невалидный, то бросить ошибку, если ок - вернуть удаленный элемент
        int rm_element;
        if (idx >= size || array[idx] == 0){
            throw new NoSuchElementException("В массиве нет элемента с таким индексом");}
        else{
            rm_element = array[idx];}
        while (idx + 1 < size && array[idx + 1] != 0) {
            array[idx] = array[idx + 1];
            idx+=1;
        }
        current_size-=1;
        return rm_element;
    }

    @Override
    public int size() { // Количество элементов списка
        return current_size;
    }

    @Override
    public int get(int idx) throws NoSuchElementException{ // Получить элемент с позиции idx или бросить исключение, если такого индекса нет
        int element;
        if (idx >= size || array[idx] == 0)
            throw new NoSuchElementException("В массиве нет элемента с таким индексом (или вы ввели 0)");
        else
            element = array[idx];
        return element;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MyArrayList list = new MyArrayList(7);
       for (int i = 0; i < 10; i++) {
            list.add(scan.nextInt());
            System.out.println(list.size+" "+list.current_size+" "+list.get(list.current_size-1));
        }
    }
}
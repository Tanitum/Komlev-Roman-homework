package homework;

import java.util.Locale;

public class Task1
{
    //посчитать факториал числа n
    //0.5 балла - если посчитаете в цикле
    //1 балл - если посчитаете рекурсией
    public static long fact(int n){
        long a=1;
        if (n!=0 && n!=1) {
            a = fact(n - 1) * n;
        }
        return a;
    }

    //вывести таблицу умножения на экран - 1 балл
    //подсказка - использовать двойной for
    public static void table(){
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
            System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }

    //посчитать сумму цифр числа
    //можно посчитать для трехзначного - 0.5 балла
    //для любого числа - 1 балл
    //подсказка - в случае для любого числа используйте while
    public static int sum(int n){
        int sm=0;
        int k;
        while (n>=10){
            k=n;
            n=n/10;
            sm+=k-10*n;
        }
        sm+=n;
        return sm;
    }

    //определить, является ли год високосным
    //В високосном году - 366 дней, тогда как в обычном - 365.
    //Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
    //Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
    //Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
    //Годы 2100, 2200 и 2300 - не високосные.
    //за правильный ответ - 0.5 балла
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //здесь вам нужно будет использовать результат прошлой задачи
    //и вывести, сколько дней в году
    //правильный ответ - 0.5 балла
    public static int daysInYear(int year) {
        if (isLeapYear(year)){
            return 366;
        } else {
            return 365;
        }
    }

    //определить номер дня недели по строке
    //например: Понедельник - 1
    //правильный ответ - 1 балл
    public static int dayOfTheWeek(String n){
        if (n.toLowerCase(Locale.ROOT).equals("понедельник")){
            return 1;
        }else if(n.equals("Вторник") || n.equals("вторник")){
            return 2;
        }else if(n.equals("Среда") || n.equals("среда")){
            return 3;
        }else if(n.equals("Четверг") || n.equals("четверг")){
            return 4;
        }else if(n.equals("Пятница") || n.equals("пятница")){
            return 5;
        }else if(n.equals("Суббота") || n.equals("суббота")){
            return 6;
        }else if(n.equals("Воскресенье") || n.equals("воскресенье")){
            return 7;
        }
        return 0;

    }

    //вывести массив на экран в виде: [1, 5, 3, 7, 10, 2, 5]
    //правильное решение - 0.5 балла
    public static void printArray(int[] array){
        System.out.print("[");
        for(int i=0;i<array.length-1;i++){
            System.out.print(array [i] + ", ");
        }
        System.out.println(array [array.length-1] + "]");
    }

    //вывести двойной массив на экран в виде:
    // [1, 5, 3, 7, 10, 2, 5]
    // [1, 5, 3, 7, 10, 2, 5]
    // ...
    //правильное решение - 0.5 балла
    public static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[i].length-1; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println(array[i][array[i].length-1] + "]");
        }
    }

    //отсортировать одномерный массив в порядке возрастания
    //если не знаете, как сортировать, то подсказка -
    //метод пузырька (один из самых простых для понимания)
    //правильный ответ - 1 балл
    public static int[] sort(int[] array){
        boolean b = false;
        int x;
        while(!b) {
            b = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    b = false;
                    x = array[i];
                    array[i] = array[i+1];
                    array[i+1] = x;
                }
            }
        }
        return array;
    }


    //здесь можете тестировать свои решения
    public static void main(String[] args){
        System.out.println("Факториал:");
        System.out.println(fact(5));

        System.out.println("Таблица умножения:");
        table();

        System.out.println("Сумма цифр числа:");
        System.out.println(sum(12345));

        System.out.println("Дней в году:");
        System.out.println(daysInYear(2020));

        System.out.println("День недели:");
        System.out.println(dayOfTheWeek("ПонеделЬник"));

        int[] array1D = {1,5,3,7,10,2,5};
        System.out.println("Вывод отсортированного массива:");
        printArray(sort(array1D));

        System.out.println("Вывод двумерного массива:");
        int[][] array2D = {{1,5,3,7,10,2,5}, {1,5,3,7,10,2,5}, {2,1,4,5,7,10,2,5}, {5,6,7,65} };
        printArray(array2D);
    }
}

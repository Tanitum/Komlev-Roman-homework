package task2;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class List {

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> divisor3 = new ArrayList<>();
        ArrayList<Integer> divisor2 = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();

        numbers20(divisor3,divisor2,other); // если ввести больше 20 чисел, то лишние числа не будут обработаны

        System.out.print("Делятся на 3: ");
        printList(divisor3);
        System.out.print("Делятся на 2: ");
        printList(divisor2);
        System.out.print("Другие числа: ");
        printList(other);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int j : list) {
            System.out.print(j+" ");
        }
        System.out.println();
    }

    public static void numbers20(ArrayList<Integer> divisor3,ArrayList<Integer> divisor2,ArrayList<Integer> other) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> allscan= new ArrayList<>(); // лист со всеми целыми числами, введенными до момента возникновения InputMismatchException
        allscan.add(0); // иначе в catch может ломаться printList(allscan);
        int next_number;
        try {
            for (int i = 0; i < 20; i++) {
                next_number = scan.nextInt();

                if (next_number % 3 == 0) {
                    divisor3.add(next_number);
                }
                if (next_number % 2 == 0) {
                    divisor2.add(next_number);
                }
                if (next_number % 2 != 0 && next_number % 3 != 0) {
                    other.add(next_number);
                }
                allscan.add(next_number);
            }
        } catch  (InputMismatchException e){
            System.out.println("Вы ввели не целое число, а что-то другое. Перезапустите программу, если хотите положить 20 целых чисел.");
            System.out.print("Вы ввели: ");
            allscan.remove(0); // удаление искусственно созданного элемента, равного 0
            printList(allscan);
            System.out.println("Следующее число, введенное после тех, которые находятся на строчке выше, оказалось не целым или не числом.");
        }
    }
}
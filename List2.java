package task2;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class List2 {

    public static void main(String[] args) throws Exception {
        List<Integer> divisor3 = new ArrayList<>();
        List<Integer> divisor2 = new ArrayList<>();
        List<Integer> other = new ArrayList<>();

        numbers20(divisor3,divisor2,other); // если ввести больше 20 чисел, то лишние числа не будут обработаны

        System.out.print("Делятся на 3: ");
        printList(divisor3);
        System.out.println();
        System.out.print("Делятся на 2: ");
        printList(divisor2);
        System.out.println();
        System.out.print("Другие числа: ");
        printList(other);
    }

    public static void printList(List<Integer> list) {
        for (int j : list) {
            System.out.print(j+" ");
        }
    }

    public static void numbers20(List<Integer> divisor3,List<Integer> divisor2,List<Integer> other) {
        Scanner scan = new Scanner(System.in);
        List<Integer> allscan= new ArrayList<>(); // лист со всеми целыми числами, введенными до момента возникновения InputMismatchException
        allscan.add(0); // иначе в catch может ломаться printList(allscan);
        Integer nextNumber; // принимает число из строки (в каждой строке может находиться не более 1 числа)
        String inputValue; // будет содержать последнюю введенную строку
        try {
            for (int i = 0; i < 20; i++) {
                inputValue=scan.nextLine();
                try{
                    nextNumber=Integer.parseInt(inputValue);
                }catch (Exception ex){
                    throw new MyOwnException(inputValue);
                }
                if (nextNumber % 3 == 0) {
                    divisor3.add(nextNumber);
                }
                if (nextNumber % 2 == 0) {
                    divisor2.add(nextNumber);
                }
                if (nextNumber % 2 != 0 && nextNumber % 3 != 0) {
                    other.add(nextNumber);
                }
                allscan.add(nextNumber);
            }
        } catch  (MyOwnException e){
            System.out.println("Вы ввели не целое число, а что-то другое. Также недопустим ввод нескольких чисел в одной строке. Перезапустите программу, если хотите положить 20 целых чисел.");
           System.out.print("Вы ввели: ");
            allscan.remove(0); // удаление искусственно созданного элемента, равного 0
            printList(allscan);
            System.out.println(e.getInvalidStr()); //вывод последней введенной строки (из-за которой всё сломалось)
        }
    }
}

class MyOwnException extends InputMismatchException{
    private String invalidStr;
    public MyOwnException(String invalidStr){
        this.invalidStr=invalidStr;
    }
    public String getInvalidStr(){
        return invalidStr;
    }
}
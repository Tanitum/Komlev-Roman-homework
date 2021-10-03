package task3;

import java.util.Set;
import java.util.HashSet;

public class SymmetricDifference {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

            set1.add(0);
            set1.add(1);
            set1.add(2);

            set2.add(4);
            set2.add(2);
            set2.add(4);
            set2.add(0);
        Set answer = symmetricDifference(set1, set2);
        for (Object j : answer) {
            System.out.print(j + " ");
        }
    }
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> answer = new HashSet<>();

        for (T element1 : set1) {
            if (!set2.contains(element1)) answer.add(element1);
        }
        for (T element2 : set2) {
            if (!set1.contains(element2)) answer.add(element2);
        }
        return answer;
    }
}



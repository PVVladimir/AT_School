package at.school;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class ArrayListIntRandomInt {
    public static void main(String[] args) {
        final int COUNT_ITEMS = 20;
        ArrayList<Integer> arrayListInt = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < COUNT_ITEMS; i++) {
            arrayListInt.add(random.nextInt(100));
        }
        System.out.println("Source array list");
        for (Integer i : arrayListInt) {
            System.out.print(i + ", ");
        }
        System.out.println("\nSorted asc array list");
        Collections.sort(arrayListInt);
        for (Integer i : arrayListInt) {
            System.out.print(i + ", ");
        }
        System.out.println("\nSorted desc array list");
        Collections.reverse(arrayListInt);
        for (Integer i : arrayListInt) {
            System.out.print(i + ", ");
        }
    }
}

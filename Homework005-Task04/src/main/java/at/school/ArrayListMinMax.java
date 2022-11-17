package at.school;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListMinMax {
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
        Integer minInArray = Collections.min(arrayListInt);
        Integer maxInArray = Collections.max(arrayListInt);
        System.out.println("\nMinimum in array list: " + minInArray);
        System.out.println("Maximum in array list: " + maxInArray);
    }
}

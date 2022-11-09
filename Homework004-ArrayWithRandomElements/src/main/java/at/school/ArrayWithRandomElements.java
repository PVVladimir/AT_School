package at.school;

import java.util.concurrent.ThreadLocalRandom;

public class ArrayWithRandomElements {
    public static void main(String[] args) {
        final int COUNT_ELEMENTS = 1000;
        int[] intArray = new int[COUNT_ELEMENTS];
        for (int i = 0; i < COUNT_ELEMENTS; i++){
            int randomNumber = ThreadLocalRandom.current().nextInt(99) + 1;
            intArray[i] = randomNumber;
            if (randomNumber == 0) System.out.print(i + ") " + randomNumber + " ");
        }
    }
}

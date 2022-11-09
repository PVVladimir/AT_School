package at.school;

import java.util.ArrayList;
import java.util.Random;

public class AnomaliesInTheArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayWithAnomalies = new ArrayList<>();
        final int COUNT_ELEMENTS = 100;
        int startIndex = 0;
        Random random = new Random();
        for (int i = 0; i < COUNT_ELEMENTS; i++) {
            arrayWithAnomalies.add(random.nextInt(100));
        }
        boolean isIncrease;
        System.out.println(arrayWithAnomalies.get(startIndex));
        do {
            isIncrease = arrayWithAnomalies.get(startIndex) < arrayWithAnomalies.get(startIndex + 1);
            startIndex++;
            if (arrayWithAnomalies.get(startIndex - 1) == arrayWithAnomalies.get(startIndex)) {
                System.out.println(arrayWithAnomalies.get(startIndex) + "<---- аномальный элемент");
            } else {
                System.out.println(arrayWithAnomalies.get(startIndex));
            }
        } while (arrayWithAnomalies.get(startIndex - 1) == arrayWithAnomalies.get(startIndex) &&
                startIndex < COUNT_ELEMENTS - 1);
        for (int i = startIndex + 1; i < COUNT_ELEMENTS; i++) {
            if (isIncrease && arrayWithAnomalies.get(i - 1) >= arrayWithAnomalies.get(i) ||
                    !isIncrease && arrayWithAnomalies.get(i - 1) <= arrayWithAnomalies.get(i)) {
                isIncrease = !isIncrease;
                System.out.println(arrayWithAnomalies.get(i) + "<---- аномальный элемент");
            } else {
                System.out.println(arrayWithAnomalies.get(i));
            }
        }
    }
}

package at.school;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class AnomaliesInTheArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayWithAnomalies = new ArrayList<>();
        final int COUNT_ELEMENTS = 100;
        Random random = new Random();
        for (int i = 0; i < COUNT_ELEMENTS; i++) {
//            arrayWithAnomalies.add(8);
//            arrayWithAnomalies.add(i);
//            arrayWithAnomalies.add(100 - i);
            arrayWithAnomalies.add(random.nextInt(100));
        }
        System.out.println(arrayWithAnomalies.get(0));
        boolean isIncrease = arrayWithAnomalies.get(0) < arrayWithAnomalies.get(1);
        boolean isDecrease = arrayWithAnomalies.get(0) > arrayWithAnomalies.get(1);
        for (int i = 1; i < COUNT_ELEMENTS; i++) {
            if (arrayWithAnomalies.get(i - 1) == arrayWithAnomalies.get(i)) {
                System.out.println(arrayWithAnomalies.get(i) + "<---- аномальный элемент");
                isIncrease = isDecrease = false;
            } else {
                if (!isIncrease && !isDecrease){
                    isIncrease = arrayWithAnomalies.get(i - 1) < arrayWithAnomalies.get(i);
                    isDecrease = arrayWithAnomalies.get(i - 1) > arrayWithAnomalies.get(i);
                    System.out.println(arrayWithAnomalies.get(i));
                } else {
                    if (isIncrease && arrayWithAnomalies.get(i - 1) < arrayWithAnomalies.get(i) ||
                            isDecrease && arrayWithAnomalies.get(i - 1) > arrayWithAnomalies.get(i)) {
                        System.out.println(arrayWithAnomalies.get(i));
                    } else {
                        System.out.println(arrayWithAnomalies.get(i) + "<---- аномальный элемент");
                        isIncrease = isDecrease = false;
                    }
                }
            }
        }
    }
}

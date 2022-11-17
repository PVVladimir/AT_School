package at.school;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        final int COINT_LOTS = 100;
        ArrayList<Integer> lottery = new ArrayList<>();
        for (int i = 0; i < COINT_LOTS; i++) {
            lottery.add(i);
        }
        Collections.shuffle(lottery);
        for (int i = 0; i < 10; i++) {
            System.out.print(lottery.get(i) + ", ");
        }
    }
}

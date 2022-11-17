package at.school;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class HashMapHouse {
    public static void main(String[] args) {
        final int RESIDENT_COUNT = 20;
        HashMap<String, Integer> resident = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < RESIDENT_COUNT; i++) {
            int age = random.nextInt(100);
            resident.put("Фамилия" + age, age);
        }
        ArrayList<String> fioList = new ArrayList<>();
        resident.forEach((key, value) -> {
            if (value > 18){
                fioList.add(key);
            }
        });
        Collections.sort(fioList);
        fioList.forEach(fio -> {
            System.out.println("fio = " + fio);
        });
    }
}

package at.school;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SunSystem {
    public static void main(String[] args) {
        ArrayList<String> sunSystem = new ArrayList<>(Arrays.asList(
                "mercury", "venus", "earth", "mars", "jupiter", "saturn", "neptune", "uranus"));
        Collections.swap(sunSystem, 6, 7);
        sunSystem.forEach(planet -> {
            System.out.print(planet + ", ");
        });
    }
}

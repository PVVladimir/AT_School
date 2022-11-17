package at.school;

import java.util.*;

public class HashMapMergCatAndDogs {
    public static void main(String[] args) {
        final ArrayList<String> catNicknames = new ArrayList<>(Arrays.asList(
                "Соня", "Клеопатра", "Цунами", "Забияка", "Матильда",
                "Кнопка", "Масяня", "Царапка", "Серсея", "Ворсинка"));
        final ArrayList<String> dogNicknames = new ArrayList<>(Arrays.asList(
                "Оскар", "Арчи", "Оливия", "Юджин", "Зевс",
                "Жасмин", "Жаклин", "Цезарь", "Николь", "Глория"));
        HashMap<String, Integer> cats = new HashMap<>();
        HashMap<String, Integer> dogs = new HashMap<>();
        HashMap<String, Integer> pets = new HashMap<>();
        Random random = new Random();
        catNicknames.forEach(nickname -> {
            cats.put(nickname, random.nextInt(catNicknames.size()));
        });
        dogNicknames.forEach(nickname -> {
            dogs.put(nickname, random.nextInt(dogNicknames.size()));
        });
        pets.putAll(cats);
        pets.putAll(dogs);
        pets.forEach((nickname, age) -> {
            System.out.println(nickname + " age " + age);
        });
    }
}

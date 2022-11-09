package at.school;

public class WeightLossProgram {
    public static void main(String[] args) {
        final int developerConsumedCaloriesPerDay = 123;
        if (developerConsumedCaloriesPerDay + 500 <= 1400) {
            System.out.println("Можно съесть любое из блюд: сало, шоколадку или тарелку каши");
        } else if (developerConsumedCaloriesPerDay + 340 <= 1400) {
            System.out.println("Можно съесть шоколадку или тарелку каши");
        } else if (developerConsumedCaloriesPerDay + 250 <= 1400) {
            System.out.println("Можно съесть только тарелку каши");
        } else {
            System.out.println("Лимит калорий на сегодня исчерпан");
        }
    }
}

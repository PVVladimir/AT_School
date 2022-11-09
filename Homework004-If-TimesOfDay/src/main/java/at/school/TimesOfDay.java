package at.school;

public class TimesOfDay {
    public static void main(String[] args) {
        final int curHour = 11;
        if (curHour < 5) {
            System.out.println("Ночь");
        } else if (curHour < 11) {
            System.out.println("Утро");
        } else if (curHour < 17) {
            System.out.println("День");
        } else {
            System.out.println("Вечер");
        }
    }
}

package at.school;

public class TimeOfDayWithErrorNotifications {
    public static void main(String[] args) {
        final int curHour = 22;
        if (curHour < 0) {
            System.out.println("Время суток нужно ввести правильно");
        } else if (curHour < 5) {
            System.out.println("Ночь");
        } else if (curHour < 11) {
            System.out.println("Утро");
        } else if (curHour < 17) {
            System.out.println("День");
        } else if (curHour > 23) {
            System.out.println("Вам следует вернуться с другой планеты на Землю");
        } else {
            System.out.println("Вечер");
        }
    }
}

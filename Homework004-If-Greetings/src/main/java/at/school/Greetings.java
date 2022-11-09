package at.school;

public class Greetings {
    public static void main(String[] args) {
        final int curHour = 11;
        final int curDay = 4;
        final boolean weakDay = curDay < 6;

        if (weakDay) {
            if (curHour < 8) {
                System.out.println("Доброе утро!");
            } else if (curHour < 11) {
                System.out.println("Все пропало! Ты проспал!");
            } else {
                System.out.println("Включай почту, составляй письмо, что сегодня берёшь отгул!");
            }
        } else {
            if (curHour < 12) {
                System.out.println("Доброе утро!");
            } else if (curHour < 16) {
                System.out.println("Лучше поспать ещё!");
            } else if (curHour < 18) {
                System.out.println("Вставай, тебя ждёт недоигранный Ведьмак!");
            } else {
                System.out.println("Дааа, с режимом надо что-то делать...");
            }
        }
    }
}

package at.school;

public class FightBetweenJediAndSith {
    public static void main(String[] args) {
        final int heightJedi = 15;
        final String nameJedi = "Оби Ван";
        final int heightSith = 12;
        final String nameSith = "Паладин";
        final boolean isSithWin = nameSith.equals("Паладин") || heightJedi == heightSith &&
                !(nameJedi.equals("Оби Ван") && nameSith.equals("Дарт Мол"));
        if (isSithWin) {
            System.out.println("Ситх победит!");
        } else {
            System.out.println("Джедай победит!");
        }
    }
}

package at.school;

public class PinokioAndApple {
    public static void main(String[] args) {
        final int countPinokioApple = 51;
        System.out.println("У Буратино было " + countPinokioApple + " яблок.");
        final int takeKarabasBarabasApple = 32;
        System.out.println("Карабас Барабас забрал у него " + takeKarabasBarabasApple
                + " яблока.");
        final int leftPinokioApple = countPinokioApple - takeKarabasBarabasApple;
        System.out.println("У Буратино осталось всего " + leftPinokioApple + " яблока.");
    }
}

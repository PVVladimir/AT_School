package at.school;

public class IdealWeight {
    public static void main(String[] args) {
        final double personWeight = 49.8;
        final double personHeight = 179.5;
        final double idealWeight = (personHeight - 100) * (1 - 0.10);
        if (idealWeight - 5 <= personWeight && personWeight <= idealWeight + 5) {
            System.out.println("Идеальный вес");
        }else {
            System.out.println("Не идеальный вес");
        }
    }
}

package at.school;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%3d ", i * j);
                if (j == 1) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if (i == 1) {
                for (int j = 0; j < 9; j++) {
                    System.out.print("----");
                }
                System.out.println("-----");
            }
        }
    }
}

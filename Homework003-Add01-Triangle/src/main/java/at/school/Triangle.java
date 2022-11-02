package at.school;

public class Triangle {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(0);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print(0);
            }
            System.out.println();
        }
    }
}

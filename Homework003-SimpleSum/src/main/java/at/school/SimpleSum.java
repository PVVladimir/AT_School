package at.school;

public class SimpleSum {
    public static void main(String[] args) {
        // Решение - сумма всех неотрицательных чисел не превышающих 100
        final int minElement = 0;
        final int maxElement = 100;
        int sumSimple = 0;
        for (int i = minElement; i <= maxElement; i++) {
            sumSimple += i;
        }
        System.out.println("sum = " + sumSimple);

        // Решение - сумма всех степеней с онованием 2 и показателем неотрицательных чисел не превышающих 100
        // Ряд чисел: 1, 2, 4, 8, 16, ...
        final int baseOfDegree = 2;
        int sumCheese = 0;
        for (int i = minElement; i <= maxElement; i++) {
            sumCheese += Math.pow(baseOfDegree, i);
        }
        System.out.println("sum = " + sumCheese);
    }
}

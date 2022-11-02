package at.school;

public class PrimeNumbers {
    public static void main(String[] args) {
        final int number = 14;
        boolean isPrimeNumber = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }
        if (isPrimeNumber) {
            System.out.println("number = " + number + ", простое число");
        } else {
            System.out.println("number = " + number + ", не простое число");
        }
    }
}

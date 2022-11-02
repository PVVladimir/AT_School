package at.school;

public class FamousFizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            final boolean fizz = i % 3 == 0;
            final boolean buzz = i % 5 == 0;
            if (fizz && buzz) {
                System.out.println("FizzBuzz");
            } else if (fizz) {
                System.out.println("Fizz");
            } else if (buzz) {
                System.out.println("Buzz");
            }
        }
    }
}

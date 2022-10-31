package at.school;

public class MortgageDownPayment {
    public static void main(String[] args) {
        final int apartmentPrice = 17_158_960;
        System.out.println("Стоимость квартиры " + apartmentPrice + " y.e.");

        final float downPaymentPercentage = 33.7F;
        System.out.println("Процент первоначального взноса " + downPaymentPercentage + " y.e.");

        final float downPaymentAmount = apartmentPrice * downPaymentPercentage / 100;
        System.out.println("Сумма первоначального взноса " + downPaymentAmount + " y.e.");
    }
}

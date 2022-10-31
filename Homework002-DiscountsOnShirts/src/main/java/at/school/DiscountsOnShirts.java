package at.school;

public class DiscountsOnShirts {
    public static void main(String[] args) {
        final int priceOfOneShirt = 7;
        System.out.printf("Цена одной рубашки без скидки %d у.е.\n", priceOfOneShirt);

        final int numberOfSelectedShirts = 15;
        System.out.printf("Количество уже выбранных рубашек %d шт\n", numberOfSelectedShirts);

        final int numberOfShirtsToReceiveADiscount = 23;
        System.out.printf("Количество рубашек, которые надо купить, чтобы получить " +
                "скидку %d шт\n", numberOfShirtsToReceiveADiscount);

        final int numberOfShirtsAddForDiscount = numberOfShirtsToReceiveADiscount -
                numberOfSelectedShirts;
        System.out.printf("Количество рубашек, которые надо добавить к купленным, " +
                "чтобы получить скидку %d шт\n", numberOfShirtsAddForDiscount);

        final int totalPriceOfSelectedShirtsWithoutDiscount = numberOfSelectedShirts *
                priceOfOneShirt;
        System.out.printf("Общая цена уже выбранных рубашек без скидки %d у.е.\n",
                totalPriceOfSelectedShirtsWithoutDiscount);

        final int totalPriceOfShirtsWithoutDiscountMustBuy = numberOfShirtsAddForDiscount *
                priceOfOneShirt;
        System.out.printf("Общая цена рубашек (без скидки), которые надо докупить, чтобы " +
                "получить скидку %d у.е.\n", totalPriceOfShirtsWithoutDiscountMustBuy);

        final float discountPercentage = 7.5F;
        System.out.printf("Процент скидки %.2f%%\n", discountPercentage);

        final float discountPriceOfAllShirts = (totalPriceOfSelectedShirtsWithoutDiscount
                + totalPriceOfShirtsWithoutDiscountMustBuy) * (100 - discountPercentage) / 100;
        System.out.printf("Цена всех рубашек со скидкой %.2f у.е.\n", discountPriceOfAllShirts);

        final float discountPriceOfOneShirt = priceOfOneShirt * (100 - discountPercentage) / 100;
        System.out.printf("Цена одной рубашки со скидкой %.2f у.е.\n", discountPriceOfOneShirt);

        final float amountOfMoneySaved = totalPriceOfSelectedShirtsWithoutDiscount +
                totalPriceOfShirtsWithoutDiscountMustBuy - discountPriceOfAllShirts;
        System.out.printf("Количество сэкономленных денег, если рубашки куплены со скидкой " +
                "%.2f шт\n", amountOfMoneySaved);

        final float theNumberOfShirtsReceivedForFree = amountOfMoneySaved / discountPriceOfOneShirt;
        System.out.printf("Количество рубашек, которые из-за скидки считай получены на халяву %.2f шт\n",
                theNumberOfShirtsReceivedForFree);
    }
}

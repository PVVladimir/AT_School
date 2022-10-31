package at.school;

public class TravelTime {
    public static void main(String[] args) {
        final int pathFromHomeToOffice = 12;
        System.out.printf("Расстояние от дома до работы %d км\n", pathFromHomeToOffice);

        final float avgTaxiSpeed = 60.5F;
        System.out.printf("Средняя скорость такси %.2f км/ч\n", avgTaxiSpeed);

        final float pathTimeToWork = pathFromHomeToOffice / avgTaxiSpeed;
        System.out.printf("Время на путь от дома до офиса %.2f ч\n", pathTimeToWork);

        final float eveningTrafficDecelerationCoefficient = 0.5F;
        System.out.printf("Коэф-т замедления транспорта ветром %.2f ед\n", eveningTrafficDecelerationCoefficient);

        final float pathTimeToHome = eveningTrafficDecelerationCoefficient * pathTimeToWork;
        System.out.printf("Время на путь от работы до дома %.2f ч\n", pathTimeToHome);
    }
}

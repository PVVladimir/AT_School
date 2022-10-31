package at.school;

public class TheAgeOfTheUniverseVsTheAgeOfHumanity {
    public static void main(String[] args) {
        final long ageUniverse = 13_000_000_000L;
        System.out.println("Возраст Вселенной " + ageUniverse + " лет.");

        final long ageHuman = 100_000L;
        System.out.println("Возраст Человечества как вида " + ageHuman + " лет.");

        final long howManyTimesOlder = ageUniverse / ageHuman;
        System.out.println("Вселенная в " + howManyTimesOlder + " раз старше людей.");
    }
}

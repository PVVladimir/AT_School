package at.school;

public class SarumanAndLannisters {
    public static void main(String[] args) {
        final int countLannistersSolders = 435;
        System.out.println("В армии Ланнистеров " + countLannistersSolders + " солдат.");

        final int countSarumanOrcs = 372;
        System.out.println("В армии Сарумана " + countSarumanOrcs + " орков.");

        final int allMilitary = countLannistersSolders + countSarumanOrcs;
        System.out.println("Общее количество пехоты в союзе Ланнистеров и Сарумана "
                + allMilitary + " единиц.");
    }
}

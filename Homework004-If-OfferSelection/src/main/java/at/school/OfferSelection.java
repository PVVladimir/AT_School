package at.school;

public class OfferSelection {
    public static void main(String[] args) {
        final double timeToWorkAndBackFirstCompany = 1.7;
        final int offerFirstCompany = 300_000;
        final int workTime = 8;
        final double salaryPerHourFirstCompany = offerFirstCompany /
                ((workTime + timeToWorkAndBackFirstCompany) * 20);
        final double timeToWorkAndBackSecondCompany = 0.7;
        final int offerSecondCompany = 120_000;
        final double salaryPerHourSecondCompany = offerSecondCompany /
                ((workTime + timeToWorkAndBackSecondCompany) * 20);
        if (salaryPerHourFirstCompany > salaryPerHourSecondCompany) {
            System.out.println("Программисту стоит выбрать первую компанию.");
        } else {
            System.out.println("Программисту стоит выбрать вторую компанию.");
        }
    }
}

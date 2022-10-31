package at.school;

public class TheTaskOfTheNumberOfEmployeesOnTheProject {
    public static void main(String[] args) {
        final int countProgrammers = 37;
        System.out.println("Программистов на проекте " + countProgrammers + " работника");

        final int countTestersPerOneProgrammer = 3;
        System.out.println("Необходимо тестировщиков на одного программиста "
                + countTestersPerOneProgrammer + " работника");

        final int countSupportsPerOneProgrammer = 4;
        System.out.println("Необходимо специалистов поддержки на одного программиста "
                + countSupportsPerOneProgrammer + " работников");

        final int countTestersForProject = countProgrammers * countTestersPerOneProgrammer;
        System.out.println("Всего тестировщиков на проекте " + countTestersForProject
                + " работников");

        final int countSupportsForProject = countProgrammers * countSupportsPerOneProgrammer;
        System.out.println("Всего специалистов поддержки на проекте = " + countSupportsForProject
                + " работников");

        final int countAllEngineers = countTestersForProject + countSupportsForProject;
        System.out.println("Общее количество технических специалистов на проекте "
                + countAllEngineers + " работников");
    }
}

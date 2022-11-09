package at.school;

public class UnfinishedWorkWeek {
    public static void main(String[] args) {
        int[] hourPerDay = {1, 2, 7, 4, 2, 5, 0, 1, 5, 4, 2, 6, 1, 0, 5};
        final int COUNT_WEEK = (int)Math.ceil(hourPerDay.length / 7.0);
        int[] hourPerWeek = new int[COUNT_WEEK];
        for (int i = 1; i <= hourPerDay.length; i++) {
            int currentWeek = (int)Math.ceil(i / 7.0) - 1;
            hourPerWeek[currentWeek] += hourPerDay[i - 1];
        }
        for (int element: hourPerWeek) {
            System.out.println("hour per week = " + element);
        }
    }
}

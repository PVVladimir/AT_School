package at.school;

public class PrintAllArrayElementsWhithIndex {
    public static void main(String[] args) {
        int[] intArray = {2, 4, 7, 1, 0, 3, 6, 7, 2, 9};
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(i + " - " + intArray[i]);
        }
    }
}

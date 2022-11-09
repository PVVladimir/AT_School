package at.school;

public class SortedAndUnsortedArray {
    public static void main(String[] args) {
        int[] intArray = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
//        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int[] intArray = {0, 1, 2, 3, 5, 4, 6, 7, 8, 9};
        boolean sorted = true;
        boolean sortedAsc = true;
        boolean sortedDesc = true;
        for (int i = 0; i < intArray.length - 1; i++) {
            if (intArray[i] > intArray[i + 1]) sortedAsc = false;
            if (intArray[i] < intArray[i + 1]) sortedDesc = false;
            sorted = sortedAsc || sortedDesc;
            if (!sorted) break;
        }
        if (sorted){
            System.out.println("Элементы массива отсортированы");
        } else {
            System.out.println("Элементы массива не отсортированы");
        }
    }
}

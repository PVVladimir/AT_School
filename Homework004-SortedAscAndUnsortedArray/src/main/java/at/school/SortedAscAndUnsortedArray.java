package at.school;

public class SortedAscAndUnsortedArray {
    public static void main(String[] args) {
        //int[] intArray = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean sortedAsc = true;
        for (int i = 0; i < intArray.length - 1; i++) {
            if (intArray[i] > intArray[i + 1]) {
                sortedAsc = false;
                break;
            }
        }
        if (sortedAsc){
            System.out.println("Массив отсортирован по возрастанию");
        } else {
            System.out.println("Массив не отсортирован по возрастанию");
        }
    }
}

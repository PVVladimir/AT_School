package at.school;

public class AutoFillArray {
    public static void main(String[] args) {
        int[] intArray = new int[100];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }
        for (int element: intArray) {
            System.out.print(element + ", ");
        }
    }
}

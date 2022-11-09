package at.school;

public class AutoFillArrayDesc {
    public static void main(String[] args) {
        int[] intArray = new int[100];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = intArray.length - 1 - i;
        }
        for (int element: intArray) {
            System.out.print(element + ", ");
        }
    }
}

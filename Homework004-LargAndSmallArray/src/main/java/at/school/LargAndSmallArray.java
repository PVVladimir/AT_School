package at.school;

public class LargAndSmallArray {
    public static void main(String[] args) {
        int[] intArray = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int sum = 0;
        for (int element: intArray){
            sum += element;
        }
        if (sum > 100 ){
            System.out.println("Это большой массив");
        } else if (sum < 100 ) {
            System.out.println("Это маленький массив");
        } else {
            System.out.println("Это средний массив");
        }
    }
}

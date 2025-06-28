// Question 1: Find Maximum Element in Array
//  Input: {10, 25, 5, 40, 30}
//  Output: Maximum = 40

package Day07;

public class Find_Max_Array {

    public static void main(String[] args) {

        int arr[] = { 10, 25, 35, 40, 18 };

        System.out.print("Array values: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("\nmaximum value in array is : " + max);

    }
}

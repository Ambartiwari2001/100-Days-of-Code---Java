package Day06;

import java.util.*;

public class Take_Input_And_Print {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total size of array : ");

        int num = sc.nextInt();

        int arr[] = new int[num];

        System.out.println("Enter the values : ");

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("You entered: ");

        for (int j = 0; j < num; j++) {
            System.out.println(arr[j]);
        }

    }
}

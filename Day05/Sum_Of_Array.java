package Day05;

public class Sum_Of_Array {
    public static void main(String[] args) {
        int num[] = { 5, 10, 15, 20 };
        for (int i = 0; i < num.length; i++) {
            System.out.println("Index " + i + ": " + num[i]);
        }

        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println("Total Sum Of Array is : " + sum);

    }
}

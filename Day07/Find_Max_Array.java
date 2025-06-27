package Day07;

public class Find_Max_Array {

    public static void main(String[] args) {

        int num[] = { 10, 25, 5, 40, 30 };
        System.out.print("Array values: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {

                if (num[i] > num[j]) {
                    int n = num[j];
                    num[j] = num[i];
                    num[i] = n;
                }
            }
        }
        int len = num.length;
        System.out.println("maximum number is : " + num[len - 1]);
    }
}

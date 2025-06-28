// Pattern 3: Number Triangle
// 1
// 12
// 123
// 1234

package Day08;

public class Number_Triangle {

    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j);

            }
            System.out.println();
        }

    }

}

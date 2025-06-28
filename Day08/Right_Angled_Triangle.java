//  Pattern 2: Right-Angled Triangle
// *
// **
// ***
// ****
package Day08;

public class Right_Angled_Triangle {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print("*");

            }
            System.out.println();
        }

    }
}
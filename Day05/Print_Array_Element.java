// Q: Create an array of 5 integers and print each element with its index.
// Sample Output:

// yaml
// Copy
// Edit
// Index 0: 5  
// Index 1: 10  
// Index 2: 15  
// Index 3: 20   
// Index 4: 25  
 
package Day05;

public class Print_Array_Element {

    public static void main(String[] args) {
        int num[] = { 5, 10, 15, 20, 25 };
        for (int i = 0; i < num.length; i++) {
            System.out.println("Index " + i + ": " + num[i]);
        }
    }
}
 
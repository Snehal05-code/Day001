//This class demonstrates iterative constructs like for and do-while loops.
public class Iterative {
// The main method for the program execution.
    public static void main(String[] args) {
         // Initializes an integer variable 'x' with the value 1.
        int x=1;
        // for loop 'i' is initializes to 0,'i' is less then 100,'i' is increment by 1
        for (int i = 0; i < 100; i++) {
            //print value in'i'
            System.out.println(i);
        }
        do {
            //print the value in 'x'
            System.out.println(x);
            //Increment x  by 1
            x++;

        }while (x <= 100);// loop continue till x is equal to or less than 100
    }
}

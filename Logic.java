//Used for taking iput from user
import java.util.Scanner;

public class Logic {
   // The main method  of the program.
    public static void main(String[] args) {
        //Declare the value 'n'to store the user input
        int n;
        // Create scanner object 'sc' for user input 
        Scanner sc = new Scanner(System.in);
        // Reads an integer input from the user and assigns it to the variable 'n'.
        n = sc.nextInt();
         // Declares two integer variables: 'count' to keep track of the number of divisors of 'n' and 'i' as the loop control variable.
        int count,i;
        // Initializes 'count' to 0
        count = 0;
        // Initializes 'i' to 1
        i=1;
        // Startthe loop that iterates from 1 to 'n'
        while(i<=n) {
             // Checks if 'i' is a divisor of 'n' 
            if(n%i==0) {
                //Increment 'count' by 1 
                count++;
            }
            //Increment 'i' by 1
            i++;
        }
        // Checks if the number of divisors of 'n' is exactly 2.
            // A prime number has only two divisors: 1 and itself.
        if(count==2) {
            //Print message indicating  number is prime
            System.out.println("It is prime number");
        }
        else {
            // Prints a message indicating that the number is not prime.
            System.out.println("It is not prime number");
        }
    }
}

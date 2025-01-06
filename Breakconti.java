//Defines the class for the program
public class Breakconti {
    // The main method of the program.
    public static void main(String[] args) {
         // Initialize the variable 'i'
        int i=1;
        //Start the loop till 'i'is less then or equal to 10
        while (i<=10) {
            System.out.println(i);
             // Check if the value of 'i'
            if (i==5) {
                // Exit the loop immediately if 'i=5'
                break;
            }
            i++;
            //Skip the rest part of loop
               continue;
        }

    }
}

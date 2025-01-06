 // Defines a public class named 'Ex4'
public class Ex4 {
     // The main method for the program execution.
    public static void main(String[] args) {
         // Initializes two integer variables 'a' and 'b'
        int a=5,b=6;
          // Performs a bitwise AND operation between 'a' and 'b'and result is stored in 'c'
        int c=a&b;
        //Print the result
        System.out.println(c);
         // Performs a bitwise OR operation between 'a' and 'b'and result is stored in 'd'
        int d=a|b;
        //Print the result store in d
        System.out.println(d);
         // Performs a bitwise XOR operation between 'a' and 'b'and result is stored in 'e'
        int e=a^b;
        //Print the result store in e
        System.out.println(e);
        // Performs a bitwise NOT operation on 'a' and stores the result in 'f'.
        int f=~a;
        //Print the result store in f
        System.out.println(f);

        // Initializes an integer variable 'value' with 10
        int value = 10;
        // Performs a left shift operation on 'value' by 2 positions
        int x= value<<2;
        //Performs a right shift operation on 'value' by  2 positions
        int y= value>>2;
        // Performs an unsigned right shift operation on 'value' by 2 positions 
        int z= value>>>2;
        //Initializes an integer variable 'negValue' with -123
        int negValue=-123;
        //Perform a right shift operation on 'value' by 2 position
        int z1=negValue>>>1;
        //Print the result in'x','y','z',z1
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(z1);
    }
}

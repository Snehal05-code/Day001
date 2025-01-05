import java.util.Scanner;
public class Logic {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int count,i;
        count = 0;
        i=1;
        while(i<=n) {
            if(n%i==0) {
                count++;
            }
            i++;
        }
        if(count==2) {
            System.out.println("It is prime number");
        }
        else {
            System.out.println("It is not prime number");
        }
    }
}

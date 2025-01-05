import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double area,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        r = sc.nextDouble();
        area = 3.14159*r*r;
        System.out.println("The area of the circle is "+area);

    }
}
public class Macro {
    public static void main(String [] args) {
        double a=big(12,3);
        double b=big(15,20);
        System.out.println("a is"+a);
        System.out.println("b is"+b);
    }

        static double big( double x, double y){
            if (x > y) {
                return x;
            } else {
                return y;
            }


    }
}

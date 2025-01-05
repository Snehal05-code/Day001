public class Ex4 {
    public static void main(String[] args) {
        int a=5,b=6;
        int c=a&b;
        System.out.println(c);
        int d=a|b;
        System.out.println(d);
        int e=a^b;
        System.out.println(e);
        int f=~a;
        System.out.println(f);

        int value = 10;
        int x= value<<2;
        int y= value>>2;
        int z= value>>>2;

        int negValue=-123;
        int z1=negValue>>>1;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(z1);
    }
}

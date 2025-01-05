public class Iterative {
    public static void main(String[] args) {
        int x=1;
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        do {
            System.out.println(x);
            x++;

        }while (x <= 100);
    }
}

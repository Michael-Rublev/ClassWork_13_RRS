public class Main {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void testSum() {
        int r1 = sum(5, 3);
        System.out.println(r1 == 8);

        int r2 = sum(1, 3);
        System.out.println(r2 == 4);

        int r3 = sum(0, 0);
        System.out.println(r3 == 0);

        int r4 = sum(-5, 8);
        System.out.println(r4 == 3);
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 5));

        testSum();
    }
}
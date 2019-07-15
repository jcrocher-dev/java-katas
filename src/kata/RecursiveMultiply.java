public class RecursiveMultiply {

    public static long multiply(int a, int b) {
        if (Math.abs(b) > Math.abs(a)) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b == 0) {
            return 0;
        }
        if (b < 0) {
            return -(a + multiply(a, -b - 1));
        }
        return a + multiply(a, b - 1);
    }
}

public class LargerDemo {
    public static int larger(int x, int y) {
        return (x > y) ? x : y;
    }
    public static double larger(double x, double y) {
        return (x > y) ? x : y;
    }
    // public static String larger(String x, String y)
    public static void main(String[] args) {
        System.out.println(larger(5.5, -10));
    }
}

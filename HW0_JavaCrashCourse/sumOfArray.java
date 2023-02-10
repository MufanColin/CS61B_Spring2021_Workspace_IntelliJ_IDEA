public class sumOfArray {
    /** Uses a basic for loop to sum a. */
    public static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i = i + 1) {
            sum += a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println("The sum of array numbers is: " + sum(numbers));
    }
}
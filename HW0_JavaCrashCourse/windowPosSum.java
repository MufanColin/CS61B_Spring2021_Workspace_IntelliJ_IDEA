public class windowPosSum {
    public static void replaceArray(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            int tmp = 0;
            if (a[i] > 0) {
                for (int j = i; j <= i + n; j++) {
                    if (j >= a.length) {
                        break;
                    }
                    tmp += a[j];
                }
                a[i] = tmp;
            }
        }
    }
    public static void main(String[] args) {
        int[] numbers = {1, -1, -1, 10, 5, -1};
        replaceArray(numbers, 2);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
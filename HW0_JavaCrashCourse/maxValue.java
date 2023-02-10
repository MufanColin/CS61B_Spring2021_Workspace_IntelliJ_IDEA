public class maxValue {
    public static int maxInArray(int[] arr) {
        int maxValue = -1;
        for (int i = 0; i < arr.length; i++) {
            maxValue = (arr[i] >= maxValue) ? arr[i] : maxValue;
        }
        return maxValue;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println("The maximum value in array numbers is: " + maxInArray(numbers));
    }
}

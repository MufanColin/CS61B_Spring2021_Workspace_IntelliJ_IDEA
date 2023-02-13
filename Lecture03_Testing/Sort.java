public class Sort {
    public static void sort(String[] x) {
        sort(x, 0);
    }
    /** Sorts x starting at position start */
    private static void sort(String[] x, int start) {
        if (start == x.length) {
            return;
        }
        int smallestIndex = findSmallest(x, start);
        swap(x, start, smallestIndex);
        sort(x, start + 1);
    }
    /** Swap item a with b. */
    public static void swap(String[] x, int a, int b) {
        String tmp = x[a];
        x[a] = x[b];
        x[b] = tmp;
    }
    /** Return the index of the smallest String in x starting at index start*/
    public static int findSmallest(String[] x, int start) {
        int smallestIndex = start;
        for (int i = start; i < x.length; i++) {
            int cmp = x[i].compareTo(x[smallestIndex]);
            // An int value: 0 if the string is equal to the other string.
            // < 0 if the string is lexicographically less than the other string
            // > 0 if the string is lexicographically greater than the other string (more characters)
            if (cmp < 0) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    public static void main(String[] args) {
        String[] input = {"i", "have", "an", "egg"};
        sort(input);
        for (String x: input) {
            System.out.println(x);
        }
    }
}

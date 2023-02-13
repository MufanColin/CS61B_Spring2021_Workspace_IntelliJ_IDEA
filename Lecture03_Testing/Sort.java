public class Sort {
    public static void sort(String[] x) {
        // Find the smallest item
        // Move it to the front
        // Selection sort the rest(using recursion??)
    }
    /** Return the smallest String in x */
    public static String findSmallest(String[] x) {
        int smallestIndex = 0;
        for (int i = 0; i < x.length; i++) {
            int cmp = x[i].compareTo(x[smallestIndex]);
            // An int value: 0 if the string is equal to the other string.
            // < 0 if the string is lexicographically less than the other string
            // > 0 if the string is lexicographically greater than the other string (more characters)
            if (cmp < 0) {
                smallestIndex = i;
            }
        }
        return x[smallestIndex];
    }
    public static void main(String[] args) {

    }
}

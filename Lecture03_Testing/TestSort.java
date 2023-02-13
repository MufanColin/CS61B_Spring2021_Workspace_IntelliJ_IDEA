public class TestSort {
    /** Test the Sort.findSmallest method */
    public static void testFindSmallest() {
        String[] input = {"i", "have", "an", "egg"};
        String expected = "an";
        String actual = Sort.findSmallest(input);
        org.junit.Assert.assertEquals(expected, actual);

        String[] input2 = {"there", "are", "many", "pigs"};
        String expected2 = "are";
        String actual2 = Sort.findSmallest(input2);
        org.junit.Assert.assertEquals(expected2, actual2);
    }

    public static void main(String[] args) {
        testFindSmallest();
    }
}

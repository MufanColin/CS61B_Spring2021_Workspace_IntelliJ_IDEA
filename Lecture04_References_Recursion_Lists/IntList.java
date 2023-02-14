public class IntList {
    public int first;
    public IntList rest;
    public static void main(String[] args) {
        IntList L = new IntList();
        L.first = 5;
        L.rest = new IntList();
        L.rest.first = 10;
        L.rest.rest = new IntList();
        L.rest.rest.first = 15;
        System.out.println(L.first);
        System.out.println(L.rest.first);
        System.out.println(L.rest.rest.first);
    }
}

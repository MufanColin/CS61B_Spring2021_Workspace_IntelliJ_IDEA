public class IntList {
    public int first;
    public IntList rest;
    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }
    public int getSizeUsingRecursion() {
        if (this.rest == null) {
            return 1;
        }
        return 1 + this.rest.getSizeUsingRecursion();
    }

    public int getSizeUsingIteration() {
        IntList p = this;
        int size = 0;
        while (p != null) {
            size += 1;
            p = p.rest;
        }
        return size;
    }

    public int getUsingRecursion(int index) {
        if (this.getSizeUsingIteration() <= index) {
            System.out.println("Error: out of range!!!");
            return -1;
        }
        if (index == 0) {
            return this.first;
        }
        return this.rest.getUsingRecursion(index - 1);
    }
    public int getUsingIteration(int index) {
        if (this.getSizeUsingIteration() <= index) {
            System.out.println("Error: out of range!!!");
            return -1;
        }
        IntList p = this;
        int currentIndex = 0;
        while (currentIndex < index) {
            p = p.rest;
            currentIndex += 1;
        }
        return p.first;
    }

    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);
        System.out.println(L.first);
        System.out.println(L.rest.first);
        System.out.println(L.rest.rest.first);
        System.out.println(L.getSizeUsingRecursion());
        System.out.println(L.getSizeUsingIteration());
        System.out.println(L.getUsingIteration(0));
        System.out.println(L.getUsingIteration(1));
        System.out.println(L.getUsingIteration(2));
        System.out.println(L.getUsingIteration(100));
        System.out.println(L.getUsingRecursion(0));
        System.out.println(L.getUsingRecursion(1));
        System.out.println(L.getUsingRecursion(2));
        System.out.println(L.getUsingRecursion(100));
    }
}

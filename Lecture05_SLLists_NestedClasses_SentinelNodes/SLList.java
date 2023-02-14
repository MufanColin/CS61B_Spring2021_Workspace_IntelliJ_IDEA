/** SLList: singly-linked list */
public class SLList {
    public IntNode first;
    public SLList(int x) {
        first = new IntNode(x, null);
    }
    public static void main(String[] args) {
        /* Creates a list of one integer, namely 10 */
        SLList L = new SLList(10);
    }
}

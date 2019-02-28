/**
 * @author Anna Bondarenko
 * @version 28.02.19
 */
package deque;

public class Link {
    public int dData;
    public Link next;
    public Link previous;

    public Link(int d) {
        dData = d;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}

/**
 * @author Anna Bondarenko
 * @version 28.02.19
 */
package deque;

public class DequeApp {
    public static void main(String[] args) {
        // make a new list
        Deque deque = new Deque();

        deque.addFirst(22);
        deque.addFirst(44);
        deque.addFirst(66);

        deque.addLast(11);
        deque.addLast(33);
        deque.addLast(55);

        deque.displayForward();
        deque.displayBackward();

        deque.removeFirst();
        deque.removeLast();
        deque.removeKey(11);

        deque.displayForward();

        deque.insertAfter(22, 77);
        deque.insertAfter(33, 88);

        deque.displayForward();
    }
}

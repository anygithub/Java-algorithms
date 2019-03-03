/**
 * @author Anna Bondarenko
 * @version 28.02.19
 */
package deque;

public class Deque {
    private Link first;
    private Link last;

    public Deque() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first==null;
    }


    public void addFirst(int dd) {
        Link newLink = new Link(dd);

        if (isEmpty())
            last = newLink;
        else
            first.previous = newLink;
        newLink.next = first;
        first = newLink;
    }

    public void addLast(int dd) {
        Link newLink = new Link(dd);
        if (isEmpty())
            first = newLink;
        else {
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
    }

    public boolean insertAfter(int key, int dd) {
        // (assumes non-empty list)
        Link current = first;
        while (current.dData != key) {
            current = current.next;
            if (current == null)
                return false;
        }
        Link newLink = new Link(dd);

        if (current==last) {
            newLink.next = null;
            last = newLink;
        } else {
            newLink.next = current.next;
            current.next.previous = newLink;
        }
        newLink.previous = current;
        current.next = newLink;
        return true;
    }


    public Link removeFirst() {
        Link temp = first;
        if (first.next == null)
            last = null;
        else
            first.next.previous = null;
        first = first.next;
        return temp;
    }


    public Link removeLast() {
        Link temp = last;
        if (first.next == null)
            first = null;
        else
            last.previous.next = null;
        last = last.previous;
        return temp;
    }

    public Link removeKey(int key) {
        Link current = first;
        while (current.dData != key) {
            current = current.next;
            if (current == null)
                return null;
        }
        if (current==first)
            first = current.next;
        else
            current.previous.next = current.next;

        if (current==last)
            last = current.previous;
        else
            current.next.previous = current.previous;
        return current;
    }

    public Object getFirst() {
        return this.first;
    }

    public Object getLast() {
        return this.last;
    }


    public void displayForward() {
        System.out.print("List (first-->last): ");
        Link current = first;           // start at beginning
        while (current != null) {       // until end of list,
            current.displayLink();      // display data
            current = current.next;     // move to next link
        }
        System.out.println("");
    }


    public void displayBackward() {
        System.out.print("List (last-->first): ");
        Link current = last;            // start at end
        while (current != null) {       // until start of list,
            current.displayLink();      // display data
            current = current.previous; // move to previous link
        }
        System.out.println("");
    }
}

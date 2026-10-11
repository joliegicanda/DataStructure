public class MyLinkedList<T> {

    private class Node {
        T value;
        Node next;

        Node(T value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size = 0;

    public void addFirst(T value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) tail = node; // list was empty
        size++;
    }

    public void addLast(T value) {
        Node node = new Node(value);
        if (tail == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    public T removeFirst() {
        if (head == null) throw new RuntimeException("List is empty");
        T value = head.value;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return value;
    }

    public T get(int index) {
        if (index < 0 || index >= size) throw new RuntimeException("Bad index: " + index);
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    public int size() {
        return size;
    }

    public void reverse() {
        Node previous = null;
        Node current = head;
        tail = head;
        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public T findMiddle() {
        if (head == null) throw new RuntimeException("List is empty");
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.value;
    }
}

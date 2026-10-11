public class MyStack<T> {

    private MyLinkedList<T> list = new MyLinkedList<>();

    public void push(T value) {
        list.addFirst(value);
    }

    public T pop() {
        return list.removeFirst();
    }
    public T peek() {
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
}

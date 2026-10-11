
public class MyQueue<T> {

    private MyStack<T> in = new MyStack<>();
    private MyStack<T> out = new MyStack<>();

    public void enqueue(T value) {
        in.push(value);
    }

    public T dequeue() {
        moveIfNeeded();
        return out.pop();
    }

    public T peek() {
        moveIfNeeded();
        return out.peek();
    }

    private void moveIfNeeded() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
    }
}

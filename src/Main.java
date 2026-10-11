import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Linked List");
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addLast(2);
        list.addLast(3);
        list.addFirst(1);
        list.addLast(4);
        list.addLast(5);
        System.out.println("get(2) = " + list.get(2));
        System.out.println("middle = " + list.findMiddle());
        list.reverse();
        System.out.println("after reverse, first = " + list.get(0));
        System.out.println("removeFirst = " + list.removeFirst());
        System.out.println("size = " + list.size());

        System.out.println(" Stack & Queue ");
        MyStack<String> stack = new MyStack<>();
        stack.push("a");
        stack.push("b");
        System.out.println("peek = " + stack.peek() + ", pop = " + stack.pop());

        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("first");
        queue.enqueue("second");
        System.out.println("peek = " + queue.peek() + ", dequeue = " + queue.dequeue());

        System.out.println("{[()]} balanced? " + Helpers.isBalanced("{[()]}"));
        System.out.println("([)] balanced? " + Helpers.isBalanced("([)]"));

        System.out.println(" Arrays & Strings ");
        int[] nums = {1, 2, 3, 4, 5};
        Helpers.rotateRight(nums, 2);
        System.out.println("rotated: " + Arrays.toString(nums));
        System.out.println("listen/silent anagram? " + Helpers.isAnagram("listen", "silent"));
        System.out.println("abc/abd anagram? " + Helpers.isAnagram("abc", "abd"));
        int[] pair = Helpers.twoSumSorted(new int[]{1, 3, 4, 6, 9}, 10);
        System.out.println("twoSum indices: " + Arrays.toString(pair));

        System.out.println(" LRU Cache (capacity 2) ");
        LRUCache cache = new LRUCache(2);
        cache.put(1, 100);
        cache.put(2, 200);
        System.out.println("get(1) = " + cache.get(1));
        cache.put(3, 300);
        System.out.println("get(2) = " + cache.get(2));
        System.out.println("get(3) = " + cache.get(3));
    }
}

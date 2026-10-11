public class Helpers {

    public static boolean isBalanced(String expr) {
        MyStack<Character> stack = new MyStack<>();
        for (char c : expr.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) return false;
                char open = stack.pop();
                if (c == ')' && open != '(') return false;
                if (c == ']' && open != '[') return false;
                if (c == '}' && open != '{') return false;
            }
        }
        return stack.isEmpty();
    }

    public static void rotateRight(int[] a, int k) {
        if (a.length == 0) return;
        k = k % a.length;
        reverse(a, 0, a.length - 1);
        reverse(a, 0, k - 1);
        reverse(a, k, a.length - 1);
    }

    private static void reverse(int[] a, int left, int right) {
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        int[] counts = new int[256];
        for (int i = 0; i < a.length(); i++) {
            counts[a.charAt(i)]++;
            counts[b.charAt(i)]--;
        }
        for (int count : counts) {
            if (count != 0) return false;
        }
        return true;
    }

    public static int[] twoSumSorted(int[] a, int target) {
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            int sum = a[left] + a[right];
            if (sum == target) return new int[]{left, right};
            if (sum < target) left++;
            else right--;
        }
        return new int[]{-1, -1};
    }
}

import java.util.*;
 
public class StackDemo {
 
    static void showpush(final Stack<Integer> st, final int a) {
        st.push(Integer.valueOf(a));
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
    }
 
    static void showpop(final Stack<Integer> st) {
        System.out.print("pop -> ");
        final Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }
 
    public static void main(final String args[]) {
        final Stack<Integer> st = new Stack<Integer>();
        System.out.println("stack: " + st);
        showpush(st, 42);
        showpush(st, 66);
        showpush(st, 99);
        showpop(st);
        showpop(st);
        showpop(st);
        try {
            showpop(st);
        } catch (final EmptyStackException e) {
            System.out.println("empty stack");
        }
    }
}
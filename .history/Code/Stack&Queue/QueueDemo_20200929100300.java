import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(final String[] args) {
        // add()和remove()方法在失败的时候会抛出异常(不推荐)
        final Queue<String> queue = new LinkedList<String>();
        // 添加元素
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        for (final String q : queue) {
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("poll=" + queue.poll()); // 返回第一个元素，并在队列中删除
        for (final String q : queue) {
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("element=" + queue.element()); // 返回第一个元素
        for (final String q : queue) {
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("peek=" + queue.peek()); // 返回第一个元素
        for (final String q : queue) {
            System.out.println(q);
        }
    }
}
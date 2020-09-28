// 引入 LinkedList 类
import java.util.LinkedList;

public class RunoobTest2 {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        // 使用 removeFirst() 移除头部元素 同理使用 removeLast() 移除尾部元素
        sites.removeFirst();
        //sites.removeLast();
        System.out.println(sites);
    }
}
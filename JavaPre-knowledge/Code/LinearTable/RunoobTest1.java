// 引入 LinkedList 类
import java.util.LinkedList;

public class RunoobTest1 {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        // 使用 addFirst() 在头部添加元素 同理使用 addLast() 在尾部添加元素
        sites.addFirst("Wiki");
        //sites.addLast("Wiki");
        System.out.println(sites);
    }
}
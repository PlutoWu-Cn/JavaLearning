// 引入 LinkedList 类
import java.util.LinkedList;

public class RunoobTest3 {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        // 使用 getFirst() 获取头部元素 同理 getLast()
        System.out.println(sites.getFirst());
        //System.out.println(sites.getLast());
    }
}
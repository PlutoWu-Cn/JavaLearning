// 引入 LinkedList 类
import java.util.LinkedList;

public class RunoobTest4 {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
       
        for (int size = sites.size(), i = 0; i < size; i++) {
            System.out.println(sites.get(i));
        
        /*
        for (String i : sites) {
           System.out.println(i);
        */ 
        }
    }
}
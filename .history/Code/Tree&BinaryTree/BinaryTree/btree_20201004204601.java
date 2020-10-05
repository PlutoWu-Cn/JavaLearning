package BinaryTree;

import java.util.Scanner;
 
public class btree {
    private btree left,right;
    private char data;
    public btree creat(String des){
        Scanner scanner=new Scanner(System.in);
        System.out.println("des:"+des);
        String str=scanner.next();
        if(str.charAt(0)<'a')return null;
        btree root=new btree();
        root.data=str.charAt(0);
        root.left=creat(str.charAt(0)+"左子树");
        root.right=creat(str.charAt(0)+"右子树");
        return root;
    }
    public void midprint(btree btree){
//        中序遍历
        if(btree!=null){
            midprint(btree.left);
            System.out.print(btree.data+"  ");
            midprint(btree.right);
        }
    }
    public void firprint(btree btree){
//        先序遍历
        if(btree!=null){
            System.out.print(btree.data+" ");
            firprint(btree.left);
            firprint(btree.right);
        }
    }
    public void lastprint(btree btree){
//        后序遍历
        if(btree!=null){
            lastprint(btree.left);
            lastprint(btree.right);
            System.out.print(btree.data+"  ");
        }
    }
    public static void main(String[] args) {
        btree tree = new btree();
        btree newtree=tree.creat("根节点");
        tree.firprint(newtree);
        System.out.println();
        tree.midprint(newtree);
        System.out.println();
        tree.lastprint(newtree);
    }
}

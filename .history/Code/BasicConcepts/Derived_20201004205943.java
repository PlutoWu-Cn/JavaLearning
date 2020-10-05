class Base {
    // 1.���ྲ̬�����
    static {
        System.out.println("Base static block!");
    }
    // 3.����Ǿ�̬�����
    {
        System.out.println("Base block");
    }
    // 4.���๹����
    public Base() {
        System.out.println("Base constructor!");
    }
}

public class Derived extends Base {
    // 2.���ྲ̬�����
    static{
        System.out.println("Derived static block!");
    }
    // 5.����Ǿ�̬�����
    {
        System.out.println("Derived block!");
    }
    // 6.���๹����
    public Derived() {
        System.out.println("Derived constructor!");
    }
    public static void main(String[] args) {
        new Derived();
    }
}
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //序列化
        FileOutputStream fos = new FileOutputStream("object.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        User user1 = new User("xuliugen", "123456", "male");
        oos.writeObject(user1);
        oos.flush();
        oos.close();
        
        //反序列化
        FileInputStream fis = new FileInputStream("object.out");
        ObjectInputStream ois = new ObjectInputStream(fis);
        User user2 = (User) ois.readObject();
        System.out.println(user2.getUserName()+ " " + 
            user2.getPassword() + " " + user2.getSex());
        //反序列化的输出结果为：xuliugen 123456 male
    }
}

public class User implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String userName;
    private String password;
    private String sex;
    
    public User(String string, String string2, String string3) {
    }

    // 全参构造方法、get和set方法省略
    public String getUserName() {
        return null;
    }

    public String getSex() {
        return null;
    }

    public String getPassword() {
        return null;
    }
}
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LoadStudent {
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("student.ser");
        ObjectInputStream in = new ObjectInputStream(fin);

        Student s = (Student) in.readObject();
        s.display();

        in.close();
    }
}

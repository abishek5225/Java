import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SaveStudent {
    public static void main(String[] args) throws Exception {
        Student s = new Student("Abishek", 21);

        FileOutputStream fout = new FileOutputStream("student.ser");
        ObjectOutputStream out = new ObjectOutputStream(fout);

        out.writeObject(s);
        out.close();

        System.out.println("Student object saved (persisted).");
    }
}

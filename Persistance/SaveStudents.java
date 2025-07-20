package Persistance;

import java.io.*;

public class SaveStudents{
    public static void main(String[] args) throws Exception{
        Student s=new Student("Abishek",21);

        FileOutputStream fout=new FileOutputSteam("student.ser");
        ObjectOutputStream out=new ObjectOutputStream(fout);

        out.writeObject(s);
        out.close();

        System.out.println("Student object saved");
    }
}
package Persistance;
import java.io.*;

public class Student implements Serializable{
    public static void main(String[] args){
    private String name;
    private int age;

    public Students(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("Name:"+name+ "age:"+age);
    }
}
}
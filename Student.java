package javaapplication38;
public class Student implements Person{
     int id;
    Student(){
        id =0;
    }
    Student(int id){
        this.id =id;
    }
    void display(){
        System.out.println("Student id "+ id);
    }

    @Override
    public void speed() {
        System.out.println("i am a student");
    }
}

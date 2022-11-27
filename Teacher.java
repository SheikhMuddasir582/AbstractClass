package javaapplication38;
public class Teacher implements Person{
    int id;
    Teacher(){
        id =0;
    }
    Teacher(int id){
        this.id =id;
    }
    void display(){
        System.out.println("Teacher id "+ id);
    }

    @Override
    public void speed() {
        System.out.println("i am a teacher");
    }
}

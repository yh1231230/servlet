package test01;

public class Interface extends Object{


    public static void main(String[] args) {
        Student stu=new Student();
        System.out.println(stu.A);
        System.out.println(stu.B);
        stu.play();
        stu.study();

    }

}

interface Happy{
    public static final int A=10;
    void play();
}

interface Study{
    public static final  int B=20;
    public abstract void study();
}

class Student implements Happy,Study{
    public void play(){
        System.out.println("打游戏");
    }
    public void study(){
        System.out.println("敲代码");
    }
}
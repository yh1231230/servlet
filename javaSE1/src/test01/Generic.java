package test01;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Generic {
    public static void main(String[] args) {
        test1();
        test2();


    }

    static void test1() {
        MyCollection<String> mc = new MyCollection<>();
        int v = Integer.parseInt("33");
        mc.set(Integer.toString(v), 0);
        mc.set("aa", 1);
        int a = Integer.parseInt((String) mc.get(0));
        String str = (String) mc.get(1);
        System.out.println(str + "--" + a);
    }

    static void test2() {

        Vector<String> vector=new Vector<>();

        List<String> list1 = new ArrayList<>();
        list1.add("aa");
        list1.add("bb");
        list1.add("cc");

        List<String> list2 = new ArrayList<>();
        list2.add("aa");
        list2.add("dd");
        list2.add("ee");
        System.out.println(list1);

        list1.removeAll(list2);
        System.out.println(list1);


    }

}


class MyCollection<E> {
    Object[] obj = new Object[5];

    public void set(E e, int index) {
        this.obj[index] = e;
    }

    public E get(int index) {
        return (E) obj[index];
    }
}

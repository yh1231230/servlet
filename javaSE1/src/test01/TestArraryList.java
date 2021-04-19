package test01;

public class TestArraryList<E> {
    private Object[] elementDate;
    private int size;
    private static final int DEFAILT_INT = 10;

    public TestArraryList() {
        elementDate = new Object[DEFAILT_INT];
    }

    public TestArraryList(int capacity) {
        if (capacity < 0)
            throw new RuntimeException("容量不能小于0");
        else if (capacity == 0)
            elementDate = new Object[DEFAILT_INT];
        else
            elementDate = new Object[capacity];
    }


    public void add(E e) {
        //扩容
        if (size == elementDate.length) {
            Object[] array = new Object[elementDate.length + (elementDate.length >> 1)];
            System.arraycopy(elementDate, 0, array, 0, elementDate.length);
            elementDate = array;
        }

        elementDate[size++] = e;
    }

    public void add(int index, E e) {
        if (size == elementDate.length) {
            Object[] array = new Object[elementDate.length + (elementDate.length >> 1)];
            System.arraycopy(elementDate, 0, array, 0, elementDate.length);
            elementDate = array;
        }

        int num=this.size-index;
        if(num>=0){
            size=size+1;
            System.arraycopy(elementDate,index , elementDate, index+1, num);
            elementDate[index]=e;
        }else{
            System.out.println("error");
        }


    }

    public void remove(E e) {
        int temp;
        for (int i = 0; i < size; i++) {
            if (e.equals(get(i))) {
                remove(i);
                break;
            }
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0?true:false;
    }

    public void remove(int index) {
        int num = elementDate.length - index - 1;
        if (num > 0) {
            System.arraycopy(elementDate, index + 1, elementDate, index, num);
        }
            size--;

    }
    public static void main(String[] args) {
        TestArraryList t1 = new TestArraryList(20);
        t1.add("aa");
        t1.add("bb");
        for (int i = 0; i < 30; i++) {
            t1.add("a"+i);
        }
        System.out.println(t1);
 //       System.out.println(t1.get(10));
  //      t1.set("20", 20);
  //      System.out.println(t1.get(20));
  //      t1.remove(6);
  //      t1.remove("aa");
        t1.add(5,1);
        System.out.println(t1);
    }


    public void check(int index) {
        if (index < 0 || index > size - 1) {
            throw new RuntimeException("索引值不合法");
        }

    }

    public E get(int index) {
        check(index);
        return (E) this.elementDate[index];
    }


    public void set(E e, int index) {
        check(index);
        elementDate[index] = e;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(elementDate[i] + ",");
        }
        sb.setCharAt(sb.length() - 1, ']');


        return sb + " " + size;
    }
}

package test01;

import java.io.IOException;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
       /*
        FileOutputStream fos = new FileOutputStream("新建文件夹\\a.txt");
        fos.write(97);
        fos.close();
*/
            List<Integer> l=new ArrayList<>();
            long n=(long)(Math.PI*1000000000*1000000000);
            while (n!=0){
                    l.add((int)(n%10));
                  n=n/10;
            }
            Collections.reverse(l);
            Set<Integer> s = new LinkedHashSet<>(l);
            System.out.println(s);

            short s1=1;

    }
}

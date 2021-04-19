package test01;

import java.io.File;

//1 2 3 5 8 13
public class DiGui {
    public static void main(String[] args) {
        //  diGui(7);
        for (int i=1;i<=7;i++)
        System.out.print(diGui(i)+"\t");
        File f=new File("C:\\Users\\Administrator\\Documents\\MGR");
        System.out.println();
        printFile(f,0);
        String s1 = "Programming";

        String s2 = new String("Programming");

        String s3 = "Program" + "ming";

        System.out.println(s1 == s2);

        System.out.println(s1 == s3);

        System.out.println(s1 == s1.intern());
    }

    public static int diGui(int a) {
 /*     int i = 1;
        int j = 1;
        int r = 0;
        while (a > 0) {
            System.out.print(i+"\t");
            r = j + i;
            i = j;
            j = r;
            a--;
        }
  */
        if (a == 1 || a == 2)
            return 1;
        else
            return diGui(a - 1) + diGui(a - 2);


    }

    //递归输出文件夹下所有文件
    static void printFile(File file,int index){
        for(int i=0;i<index;i++)
            System.out.print("\t");
        System.out.println(file.getName());
        if(file.isDirectory()){
            File[] files=file.listFiles();
            for(File temp:files){
                printFile(temp,index+1);
            }
        }
    }
}



package test01;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的月薪：");
            double a = sc.nextDouble();

            sc.nextLine();
            System.out.println("请输入命令：（回车进行计算；next计算下一位；exit退出系统）");
            String d = sc.nextLine();
            if (d.equals("next"))
                continue;
            {
                double shui = 0;
                double jiao = a-5000;
                if (jiao < 0) {
                    shui = 0;
                    System.out.println("实际月薪为" + (a - shui)+",扣除的税为："+shui);
                } else if (jiao < 3000) {
                    shui = jiao * 0.03;
                    System.out.println("实际月薪为" + (a - shui)+",扣除的税为："+shui);
                } else if (jiao < 12000){
                    shui = jiao * 0.1-210;
                    System.out.println("实际月薪为" + (a - shui)+",扣除的税为："+shui);
                } else if (jiao < 25000){
                    shui = jiao * 0.2-1410;
                    System.out.println("实际月薪为" + (a - shui)+",扣除的税为："+shui);
                }
            }
            if (d.equals("exit"))
                break;
            sc.nextLine();
        }
    }
}

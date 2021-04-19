package test01;

import java.util.Arrays;

public class PaiXu {

    public static void main(String[] args) {
        int[] a = {0, 5, 1, 4, 3, 8, 6, 9};
        int[] b = {0, 5, 1, 4, 3, 8, 6, 9};
        int[] c = {0, 5, 1, 4, 3, 8, 6, 9};
        maoPao(a);
        System.out.println("-----------------");
        xuanZeWei(b);
        System.out.println("-----------------");
        xuanZeZhen(c);
        System.out.println(erFen(c,5));
    }


    //冒泡排序
    static void maoPao(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            boolean flag = true;
            int temp;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag)
                break;
            System.out.println(Arrays.toString(a));
        }
    }

    //选择排序伪
    static void xuanZeWei(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int temp;
            for (int j = i + 1; j < a.length - 1; j++) {
                if (a[i] > a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
            System.out.println(Arrays.toString(a));
        }
    }

    //选择排序真，选出数组中最小数的下标，与首部互换
    static void xuanZeZhen(int[] a) {
        int temp;
        int minIndex;
        for (int i = 0; i < a.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < a.length - 1; j++) {
                if (a[minIndex] > a[j])
                    minIndex = j;
            }
            if (a[minIndex] != a[i]) {
                temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
                System.out.println(Arrays.toString(a));
            }
        }
    }

    static int erFen(int[] a, int b) {
        int min = 0;
        int max = a.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (a[mid] > b)
                max = mid - 1;
            if (a[mid] < b)
                min = mid + 1;
            if (a[mid] == b)
                return mid;
        }
        return  -1;
    }
}

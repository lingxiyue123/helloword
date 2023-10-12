package com;


import java.util.Arrays;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        int []arr ={1,3,2,6,5,4};
        /*int result=3;
        int efcz = efcz(arr, result);
        System.out.println(efcz);*/
        xz(arr);
    }

    //1.二分查找
    public static int efcz(int[] a, int t) {
        int l = 0;
        int r = a.length - 1;
        int m;
        while (l <= r) {
            m = (l + r) / 2;
            if (a[m] == t) {
                return m;
            } else if (a[m] > t) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    //2.冒泡排序
    public static void bubble_v2(int[] a) {
        int n = a.length - 1;
        while (true) {
            int last = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                    last = i;
                }
            }
            n=last;
            System.out.println(Arrays.toString(a));
            if (n==0){
                break;
            }
        }
    }

    public static void swap(int a[],int b,int c){
        int tem=0;
        tem=a[b];
        a[b]=a[c];
        a[c]=tem;
    }

    //3.选择排序
    public static void xz(int a[]){
        for (int i = 0; i <a.length-1 ; i++) {
            int s =i;
            for (int j = s+1; j <a.length; j++) {
                if (a[s]>a[j]){
                    s=j;
                }
            }
            if (s!=i){
                swap(a,s,i);
            }
            System.out.println(Arrays.toString(a));

        }
    }

}



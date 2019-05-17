package com.company.datatype;

/**
 * @author Administrator
 */
public class ArrayDemo_2 {
    public static void main(String[] args) {
//        int ret = factorial(4);
//        System.out.println(ret);
//        double dou = 4555.12;
//        System.out.println(dou);
//        long a = 1;
//        int[] arr = {1,2,3};
//        int[] arrb = {4,5,6,7,8};
//        arr = arrb;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        System.out.println(arr);
//        int a = 2147483647*2;
//        System.out.println(a);
//        int[] aa = new int[]{1,2,3};
        int[] score = {85,94,96,91,98,97,98,62,45,99};
        int toScore = 99;
        int i = 0;
        for (; i < score.length; i++) {
            if (score[i] == toScore){
                break;
            }
        }
        if (i != score.length ){
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }
    public static int factorial(int n){
        if (n == 0){
            return 1;
        }else{
            return n*factorial(n - 1);
        }
    }
}

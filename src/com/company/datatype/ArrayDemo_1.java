package com.company.datatype;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class ArrayDemo_1 {
    public static void main(String[] args) {
        // 定义一个数组，存储int类型数据，长度为3
        int[] arr = new int[3];
        arr[0] = 3;
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        int[] arr1 = {1,2};
        System.out.println(arr1);

        int a = 2147483647*2;
        System.out.println(a);
        long b = 2147483647*2L;
        System.out.println(b);
        double salary = 10/4;
        System.out.println(salary);
        double d = 10/4.0;
        System.out.println(d);
        double d1 = 10/(double)4;
        System.out.println("d1:" + d1);
        // 小数计算结果不精确
        float f = 0.1f*0.1f;
        System.out.println(f);
        // double类型计算
        //double num = 0.1*0.1;
        //System.out.println(num);

        double num1 = 0.1;
        double num2 = 0.1;
        BigDecimal decimal = new BigDecimal(Double.toString(num1));
        BigDecimal decimal2 = new BigDecimal(Double.toString(num2));
        System.out.println("相乘：" + decimal.multiply(decimal2));

        int[] aa = new int[]{1,2,3};
        int[] bb = new int[]{1,2,3};
        System.out.println(aa == bb);

        boolean boo = true;
        int num = 0;
        boolean flag = boo||num++ > 0;
        System.out.println(flag);
        System.out.println(num);

        System.out.println(0.1f*0.1f);
        System.out.println(0.1f + 0.1f);

        int abc = 10;
        if (abc%2 == 0){
            System.out.println("偶数");
        }
        if (abc%2 == 0) System.out.println("偶数");

        int a1 = 10;
        String falg = a1%2==0?"even":"odd";
        System.out.println(falg);
        int a2 = 1;
        switch (a2){
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            default:
                System.out.println("3");
        }
        switch (a2){
            case 1:
            case 2:
            case 3:
                System.out.println("aaaa");
            default:
                break;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input password");
        int number = scanner.nextInt();
        int pwd = 456789;
        while (number != pwd){
            System.out.println("please input password");
            number = scanner.nextInt();
        }
        System.out.println("correct");
        scanner.close();

        int[] sal = {1000,2000,3000,4000};
        for (int i= 0;i< sal.length; i++) {
            System.out.println(sal[i]);
        }

        int[] sal1 = {5000,6000,7000};
        int i = 0;
        for (; i < sal1.length; i++) {
            System.out.println(sal1[i]);
        }

        int[] arrNum = {1,2,3,4};
        for (int element:arrNum) {
            System.out.println(element);
        }
        int[] score = {85,94,96,91,99,97,98,62,45};
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
        int[] score1 = {62,84,63,94,99,74,101,63,100};
        int toScore1 = 63;
        int count = 0;
        for (int i = 0; i < score1.length ; i++) {
            if (score1[i] != toScore1){
                continue;
            }
            count++;
        }
        System.out.println("分数为63的个数：" + count);
        // 99乘法表
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+ "*" + i + "=" + (i*j) + " ");
            }
            System.out.println();
        }
        int a = 3;
        int b = 4;
        System.out.println(sum(a,b));
        printLine();
        int[] arr13 = {10,12,15,16,84,96,31,84,21,9};
        reset(arr13);
        for (int i = 0; i < arr13.length; i++) {
            System.out.println(arr13[i]);
        }
        System.out.println(max(0));
        System.out.println(max(0,2));
        System.out.println(max(0,2,4));
        System.out.println(max(0,2,3,4,5,1));
        System.out.println(factorial(10));
    }
    public static void reset(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }
    public static int sum(int a,int b){
        int sum = a + b;
        return sum;
    }
    public static void printLine(){
        for (int i = 0; i < 3 ; i++) {
            System.out.println();
        }
    }
    public static int max(int min, int ...a){
        int maxs = min;
        for (int i = 0; i < a.length ; i++) {
            if (maxs < a[i]){
                maxs = a[i];
            }
        }
        return maxs;
    }
    public static long factorial(long n){
        if (n == 0){
            return 1;
        }
        return n*factorial(n - 1);
    }

}

package com.company.datatype;


public class Case {

    int a = 5;

    public static void Person(){

        String name = "小明";
        int age = 14;
        double height = 165;
        double weight = 90;
        boolean b = true;
        b = false;
        System.out.println(b);
    }

    public static void main(String[] args) {
        Person();
        // 第一种
        int[] arr = {1,2,3};
        // 第二种
        int[] arr1 = new int[]{1,2,3};
        // 第三种
        int[] arr2 = new int[3];
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;

        int length = 10;
        double[] doubles = new double[length];

        // 错误方式
        //int[] ints = new int[3]{1,2,3};
        int[] arrA = {1,2,3};
        int[] arrB = {4,5,6,7};
        arrA = arrB;
    }
}

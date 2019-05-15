package com.company.datatype;

/**
 * 算术运算符
 */
public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
        System.out.println("a--   = " +  (a--) );
        System.out.println("a++   = " +  (a++) );
        // 查看  d++ 与 ++d 的不同
        System.out.println("d++   = " +  (d++) );
        System.out.println("++d   = " +  (++d) );
        int e = 3;//定义一个变量；
        int f = ++e;//自增运算
        int g = 3;
        int h = --g;//自减运算
        System.out.println("进行自增运算后的值等于"+f);
        System.out.println("进行自减运算后的值等于"+h);
    }
}

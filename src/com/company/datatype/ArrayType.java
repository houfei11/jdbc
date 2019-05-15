package com.company.datatype;

/**
 * 数组
 * @author Administrator
 */
public class ArrayType {
    public static void main(String[] args) {
        // 声明数组变量
        double[] dataTypes;
        // 创建数组
        double[] doubles = new double[2];
        // size 表示数组长度
        int size = 3;
        int[] ints = new int[size];
        ints[0] = 11;
        ints[1] = 22;
        ints[2] = 33;
        // 计算所有元素的总和
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += ints[i];
        }
        System.out.println("总和为：" + sum);
        // 处理数组
        double[] doubles1 = {1.3,1.4,1.5};
        // 打印所有数组元素
        for (int i = 0; i < doubles1.length ; i++) {
            System.out.println(doubles1[i]);
        }
        // 计算所有元素的总和
        double myList = 0;
        for (int i = 0; i < doubles1.length ; i++) {
            myList += doubles1[i];
        }
        System.out.println("数组总和为：" + myList);
        // 查找最大元素
        double max = doubles1[0];
        for (int i = 0; i < doubles1.length ; i++) {
            if (doubles1[i] > max){
                max = doubles1[i];
            }
        }
        System.out.println("数组的最大元素为：" + max);
        // for - Each 循环 打印数组所有元素
        for (double doubleEach: doubles1) {
            System.out.println(doubleEach);
        }
        // 多维数组
        String[][] s = new String[2][3];
        s[0] = new String[2];
        s[1] = new String[3];
        s[0][0] = new String("Good");
        s[0][1] = new String("Luck");
        s[1][0] = new String("to");
        s[1][1] = new String("you");
        s[1][2] = new String("!");
        // 遍历
        String string = "";
        for (int i = 0; i <s.length ; i++) {
            for (int j = 0; j < s[i].length ; j++) {
                string = s[i][j];
                System.out.println(string);
            }
        }

    }
}

package com.company.datatype;

/**
 * 变量
 */
public class Variable {
    /**
     *  类变量
     */
    static int startNumber = 0;
    /**
     *  成员变量
     */
    String str = "Hello World";
    public void show(){
        // 局部变量
        int i = 0;
    }
    public void pigAge(){
        int age = 1;
        age = age + 7;
        System.out.println("猪的年龄是：" + age);
    }

    public static void main(String[] args) {
        Variable variable = new Variable();
        variable.pigAge();
    }
}

/**
 *  实例变量
 */
class Employee{
    public String name;
    private double salary;
    //在构造器中对name赋值
    public Employee (String empName){
        name = empName;
    }
    //设定salary的值
    public void setSalary(double empSal){
        salary = empSal;
    }
    // 打印信息
    public void printEmp(){
        System.out.println("名字 : " + name );
        System.out.println("薪水 : " + salary);
    }
    public static void main(String[] args){
        Employee empOne = new Employee("XiaoMing");
        empOne.setSalary(1000);
        empOne.printEmp();
    }
}

/**
 * 类变量
 */
class Developer{
    // salary是私有的静态变量
    private static double salary;
    // 一个静态常量
    public static final String DEPARTMENT = "开发人员";

    public static void main(String[] args) {
        salary = 1000.00;
        System.out.println(DEPARTMENT + "平均工资：" + salary);
    }
}

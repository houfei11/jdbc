package com.company;

import java.sql.*;

public class JdbcDome {
    String jdbcUrl = "jdbc:mysql://localhost:3306/student?useUnicode=true&characterEncoding=UTF-8";
    String className = "com.mysql.jdbc.Driver";
    String user = "root";
    String password = "root";

    public Connection getConnection() {
        Connection connection = null;
        try {
            // 加载数据库驱动
            Class.forName(className);
            // 获取数据库连接
            connection = DriverManager.getConnection(jdbcUrl, user, password);
        } catch (Exception e) {
            System.out.println("连接失败");
        }
        return connection;
    }

    public void closeConnection(Connection connection) {
        try {
            connection.close();
            System.out.println("关闭成功");
        } catch (SQLException e) {
            System.out.println("关闭失败");
        }
    }

    public void insert() {
        String sql = "insert into user (UserName,PassWord,UserAge,UserSex) values('丙','123456', 20, 0)";
        Connection connection = getConnection();
        try {
            //获取数据库操作类
            Statement statement = connection.createStatement();
            //执行 SQL 语句并返回结果
            int result = statement.executeUpdate(sql);
            if (result != 0) {
                System.out.println("操作成功,受影响" + result + "行");
            }
            statement.close();
        } catch (SQLException e) {
            System.out.println("操作失败");
        } finally {
            closeConnection(connection);
        }
    }

    public void delete() {
        String sql = "delete from user where UserId in (2,3,4)";
        Connection connection = getConnection();
        try {
            Statement statement = connection.createStatement();
            int result = statement.executeUpdate(sql);
            if (result != 0) {
                System.out.println("操作成功,受影响" + result + "行");
            }
            statement.close();
        } catch (SQLException e) {
            System.out.println("操作失败");
        } finally {
            closeConnection(connection);
        }
    }

    public void update() {
        String sql = "update user set UserName = '乙' where UserId = 5";
        Connection connection = getConnection();
        try {
            Statement statement = connection.createStatement();
            int result = statement.executeUpdate(sql);
            if (result != 0) {
                System.out.println("操作成功,受影响" + result + "行");
            }
            statement.close();
        } catch (SQLException e) {
            System.out.println("操作失败");
        } finally {
            closeConnection(connection);
        }
    }

    public void select() {
        //带参数的  SQL 语句, 要设置的值用 ? 占位
        String sql = "select * from user where UserId = ?";
        Connection connection = getConnection();
        try {
            //传递 SQL 语句
            PreparedStatement statement = connection.prepareStatement(sql);
            //设置 SQL 语句中占位符的值
            statement.setInt(1, 1);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.println("UserName = " + resultSet.getString("UserName"));
                System.out.println("PassWord = " + resultSet.getString("PassWord"));
                System.out.println("UserAge = " + resultSet.getInt("UserAge"));
                String userSex = resultSet.getInt("UserSex") == 1 ? "男" : "女";
                System.out.println("UserSex = " + userSex);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println("操作失败");
        } finally {
            closeConnection(connection);
        }
    }
}
class text{
    public static void main(String[] args) {
        JdbcDome dome = new JdbcDome();
        dome.select();
        System.out.println();
    }
}
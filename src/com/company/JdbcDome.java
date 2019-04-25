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
        String sql = "insert into personal (stuId,stuName,stuAge,school,stuTime) values('1','houfei', 20, '交通大学','2019-03-04')";
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
        String sql = "delete from personal where stuId in (1)";
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
        String sql = "update personal set stuName = '乙' where stuId = 4";
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
//        String sql = "select * from personal where stuId = ?";
        String sql = "select * from personal";
        Connection connection = getConnection();
        try {
            //传递 SQL 语句
            PreparedStatement statement = connection.prepareStatement(sql);
            //设置 SQL 语句中占位符的值
//            statement.setInt(1, );
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.println("stuId = " + resultSet.getString("stuId"));
                System.out.println("stuName = " + resultSet.getString("stuName"));
                System.out.println("stuAge = " + resultSet.getInt("stuAge"));
                System.out.println("school = " + resultSet.getString("school"));
                System.out.println("stuTime = " + resultSet.getString("stuTime"));
                String userSex = resultSet.getInt("stuAge") == 1 ? "男" : "女";
                System.out.println("stuAge = " + userSex);
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
        dome.update();
        dome.insert();
        dome.delete();
        System.out.println("123");
    }
}
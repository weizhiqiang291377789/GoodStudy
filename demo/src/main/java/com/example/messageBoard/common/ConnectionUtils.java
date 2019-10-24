package com.example.messageBoard.common;

import java.sql.*;

public class ConnectionUtils {
    public static Connection getConnection(){
        Connection con=null;
        try {
//加载驱动
            Class.forName("com.mysql.jdbc.Driver");
//建立连接
            try {
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC", "root", "root");
                if(con!=null){
                    System.out.println("connection success!!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return con;
    }
    //查询，释放资源
    public static void close(ResultSet rs, Statement st, Connection con){
        try {
            if(rs!=null){
                rs.close();
            }
            if(st!=null){
                st.close();
            }
            if(con!=null){
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //添加、修改，删除时使用
    public static void close(Statement st,Connection con){
        try {
            if(st!=null){
                st.close();
            }
            if(con!=null){
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


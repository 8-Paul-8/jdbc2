/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author <8-Paul-8>
 */
public class MySQLConnection {
    
    public static Connection connect() throws SQLException{
    String url="jdbc:mysql://localhost:3306/sakila?characterEncoding=utf-8&autoReconnect=true&serverTimezone=UTC";
        String user="eshopAdmin";
        String password="eshopAdmin123";
        
        Connection conn;
        conn = DriverManager.getConnection(
                url,
                user,
                password
        );
        return conn;
    }
}

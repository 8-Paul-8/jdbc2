/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author <8-Paul-8>
 */
public class Create {

    public Create() {
    }
    
    public void newtable() throws SQLException{
        
        String sqlCreateTable= "create table test(t_id integer not null, \n"+
                "t_name varchar(50) not null, \n"+ "primary key (t_id))";
        
        String sqlInsertTable1= "insert into test (t_id, t_name) values (1,'kostas')";
        String sqlInsertTable2= "insert into test (t_id, t_name) values (2,'maria')";
        String sqlInsertTable3= "insert into test (t_id, t_name) values (3,'giorgos')";
    
    String sqlUpdateTable =" update test set t_name= 'andreas' where t_id=1";
    
    String sqlDeleteTable= "delete from test where t_id= "+ 3;
    
    String sqlCreateTableAsSelect= "create table test1 as select * from test";
    
    String sqlDropTable = "drop table test1";
    
    String url="jdbc:mysql://localhost:3306/sakila?characterEncoding=utf-8&autoReconnect=true&serverTimezone=UTC";
        String user="eshopAdmin";
        String password="eshopAdmin123";
        
        Connection conn;
        conn = DriverManager.getConnection(
                url,
                user,
                password
        );
    
        Statement stmt=conn.createStatement();
        stmt.executeUpdate(sqlCreateTable);
        stmt.executeUpdate(sqlInsertTable1);
        stmt.executeUpdate(sqlInsertTable2);
        stmt.executeUpdate(sqlInsertTable3);
        stmt.executeUpdate(sqlUpdateTable);
        stmt.executeUpdate(sqlDeleteTable);
        
        
        
        
        
        
        
    
    }
    
    
    
    
}

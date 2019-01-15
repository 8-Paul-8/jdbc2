/**
 * In this class we give input to an existing stored procedure in our database.
 * the input is any part of the name we like to find. 
 *
 */
package jdbc2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author <8-Paul-8>
 */
public class stored {

    public stored() {
    }
    public void connection() throws SQLException{
     String url="jdbc:mysql://localhost:3306/sakila?characterEncoding=utf-8&autoReconnect=true&serverTimezone=UTC";
        String user="eshopAdmin";
        String password="eshopAdmin123";
        
        
//        Connection conn=null;
        Connection conn;
        conn = DriverManager.getConnection(
                url,
                user,
                password
        );
    
    String sqlQuery= "call sakila.actor_name_like(?)";
    CallableStatement cs=conn.prepareCall(sqlQuery);
    System.out.println("Provide actor name: \n");
    Scanner sc = new Scanner (System.in);
        String actornamelike= sc.nextLine();
        cs.setString(1, actornamelike);
        ResultSet cnt=cs.executeQuery();
        
        while(cnt.next()){
                System.out.println(cnt.getString("first_name"));
                System.out.println(cnt.getString("last_name"));
                System.out.println(cnt.getString("title"));
                System.out.println(cnt.getInt("release_year"));
        
                
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author <8-Paul-8>
 */
public class JDBC2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
//        stored s1= new stored();
//        s1.connection();
//        
//        Create c1= new Create();
//        c1.newtable();
  
        Actor act=new Actor();
        List <Actor> lst= act.fetchAllActors();
        for(Actor actor:lst){
            System.out.println(actor.toString());
       
        }
        
        System.out.println(lst.get(5));
        System.out.println(lst.get(5).getLastName());
}}

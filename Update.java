
package javaapplication3;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;
import java.util.Scanner;

public class Update {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       Scanner sc=new Scanner(System.in);
       student s1=new student();
       System.out.println("Enter Updated RollNo");
       int s2=sc.nextInt();
       System.out.println("Enter name");
       s1.setName(sc.next());
       Class.forName("com.mysql.jdbc.Driver");
       Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
       Statement stmt=con.createStatement();
       stmt.executeUpdate("update info set rollNo='"+s2+"' where name='"+s1.getName()+"'");
       con.close();
    }
}

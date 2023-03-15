
package javaapplication3;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.Scanner;

public class read {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       Scanner sc=new Scanner(System.in);
       student s1=new student();
       System.out.println("Enter RollNo");
       s1.setRollNo(sc.nextInt());
       Class.forName("com.mysql.jdbc.Driver");
       Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
       Statement stmt=con.createStatement();
       ResultSet rs=stmt.executeQuery("select * from info where rollNo='"+s1.getRollNo()+"'");
       while(rs.next())
       {
           System.out.print(rs.getString("rollNo"));
           System.out.print(" ");
           System.out.print(rs.getString("name"));
           System.out.print(" ");
           System.out.print(rs.getString("email"));
           System.out.println("");
       }
       con.close();
    }
}


package javaapplication3;

import com.mysql.jdbc.Connection;
import java.util.Scanner;
import java.sql.*;

public class Create {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       Scanner sc=new Scanner(System.in);
       student s1=new student();
       System.out.println("Enter RollNo");
       s1.setRollNo(sc.nextInt());
       System.out.println("Enter Name");
       s1.setName(sc.next());
       System.out.println("Enter Email");
       s1.setEamil(sc.next());
       Class.forName("com.mysql.jdbc.Driver");
       Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
       Statement stmt=con.createStatement();
       stmt.executeUpdate("insert into info values('"+s1.getRollNo()+"','"+s1.getName()+"','"+s1.getEmail()+"')");
       con.close();
    }
}


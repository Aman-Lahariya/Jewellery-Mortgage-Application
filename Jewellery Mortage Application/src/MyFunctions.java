
import java.sql.*;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Charlie
 */
public class MyFunctions {
    
   Connection myConnection()
   {
       Connection cn=null;
       try
       {
           Class.forName("java.sql.Driver");
           //cn = DriverManager.getConnection("jdbc:postgresql://localhost/jewellery_mortgage","postgres","root");
           cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jewellery_mortgage","root","root");
           
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
       }
       
       if(cn == null)
       {
           JOptionPane.showMessageDialog(null, "Error connecting to database...");
       }
          return cn;
   } 
    
     int userid()
    { 
        int id = 101;
        try
       {
           MyFunctions mf = new MyFunctions();
           Connection cn = mf.myConnection();
           Statement stmt = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
           String query = "Select * from users order by uid";
           ResultSet rs = stmt.executeQuery(query);
           rs.last();
           id = rs.getInt("uid") + 1;
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,"Error in retreving user id !\n Please contact Mr.Aman !");
           JOptionPane.showMessageDialog(null, e);
       }
        return  id;
    }
     
     //GENERATING MORTGAGE_ENTRY ID
     int mid()
     {
         int mid=0;
        try
       {
           MyFunctions mf = new MyFunctions();
           Connection cn = mf.myConnection();
           Statement stmt = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
           String query = "Select * from mortgage_entry order by mid";
           ResultSet rs = stmt.executeQuery(query);
           rs.last();
           mid = rs.getInt("mid") + 1;
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,"Error in retreving mortgage id !\nPlease contact Mr.Aman !");
           JOptionPane.showMessageDialog(null, e);
       }
        return  mid;
     }
     
     //GENERATING CID
     int cid()
     {
        int cid = 1;
        try
       {
           MyFunctions mf = new MyFunctions();
           Connection cn = mf.myConnection();
           Statement stmt = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
           String query = "Select * from customer order by cid";
           ResultSet rs = stmt.executeQuery(query);
           rs.last();
           cid = rs.getInt("cid") + 1;
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,"Error in retreving customer id !\nPlease contact Mr.Aman !");
           JOptionPane.showMessageDialog(null, e);
       }
        return  cid;
     }
     
     //RETREIVING CID
     int retreive_cid(String cname)
     {
         int retrived_cid = 0;
         try
            {
                //String name = cname;
                //String fname = "",lname = "";
                //int cid = 0,mid = 0,i;
                MyFunctions mf = new MyFunctions();
                Connection cn = mf.myConnection();
                Statement stmt = cn.createStatement();

               /* for(i=0;name.charAt(i)!=' ';i++)
                {
                        fname = fname+name.charAt(i);     
                }
                
                for(i++;i<name.length();i++)
                {
                    lname = lname+name.charAt(i);
                }
                
                String query1 = "Select cid from customer where fname = '"+ fname +"' AND lname = '"+lname+"' ";
                */
                String query1 = "Select cid from customer where fullname = '"+cname+"'";
                ResultSet rs1 = stmt.executeQuery(query1);
                rs1.next();
                retrived_cid = rs1.getInt("cid");
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Error in retreving customer id !\nPlease contact Mr.Aman !");
                JOptionPane.showMessageDialog(null, e);
            }
            
         return retrived_cid;
     }
     
     //GENERATING MORTGAGE_ENTRY ID
     int debit_mid()
     {
        int debit_id=0;
        try
       {
           MyFunctions mf = new MyFunctions();
           Connection cn = mf.myConnection();
           Statement stmt = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
           String query = "Select * from mortgage_exit order by debit_id";
           ResultSet rs = stmt.executeQuery(query);
           rs.last();
           debit_id = rs.getInt("debit_id") + 1;
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,"Error in retreving mortgage exit id !\nPlease contact Mr.Aman !");
           JOptionPane.showMessageDialog(null, e);
       }
        return  debit_id;
     }
}

import java.sql.*;
class Test
{
  public static void main(String[] args)
  {
    try{
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      Connection con = DriverManager.getConnection("jdbc:odbc:Test", "", "");
      Statement s=con.createStatement();        //creating statement

      ResultSet rs=s.executeQuery("select * from student");     //executing statement

      while(rs.next()){
         System.out.println(rs.getInt(1)+" "+rs.getString(2));
      }

      con.close();      //closing connection

    }
    catch(Exception e)
    {
       e.printStackTrace();
    }
  }
}

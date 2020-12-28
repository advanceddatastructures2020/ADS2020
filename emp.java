import java.io.*;
import java.sql.*;
import java.lang.*;
class emp
{
public static void main(String arg[])throws Exception
{
Statement st;
Connection con;
ResultSet rs;
int i=0;
String n="";
int ch=0;
try
{
Class.forName("sun.jdbc.odbc.jdbcOdbcDriver");
}
catch(ClassNotFoundException e)
{
System.out.println("Error"+e);
}
try
{
con=DriverManager.getConnection("jdbc:odbc:emp","","");
System.out.println("Connection established");
st=con.createStatement();
DataInputStream d=new DataInputStream(System.in);
do
{
System.out.println("\nMenu");
System.out.println("\n\t [1].Insert.");
System.out.println("\n\t [2].Delete.");
System.out.println("\n\t [3].Update.");
System.out.println("\n\t [4].Display.");
System.out.println("\n\t [5].Exit.");
System.out.println("\nEnter your choice:");
ch=Integer.parseInt(d.readLine());

switch(ch)
{
case 1:System.out.println("Enter empno.");
      i=Integer.parseInt(d.readLine());
      System.out.println("Enter emp name.");
      n=d.readLine();
      st.executeUpdate("Insert into emp values("+i+","+n+")");
      System.out.println("Successfully inserted row");
      break;
case 2:System.out.println("Enter empno.");
      i=Integer.parseInt(d.readLine());
      st.executeUpdate("Delete from emp where empno="+i+";");
      System.out.println("one row deleted");
      break;
case 3:System.out.println("Enter empno.");
      i=Integer.parseInt(d.readLine());
      System.out.println("Enter emp name.");
      n=d.readLine();
      st.executeUpdate("Update emp set empname="+n+"where empno="+i);
      System.out.println("Record updated");
      rs=st.executeQuery("Select * from emp");
      while(rs.next())
      {
       System.out.println(rs.getInt ("empno")+"\t"+rs.getString("empname"));
      }
      break;
case 4:System.out.println("Enter empno.");
       rs=st.executeQuery("Select * from emp");
       while(rs.next())
      {
       System.out.println("id"+rs.getInt ("empno")+"\nName:"+rs.getString("empname"));
      }
      break;
case 5:System.out.println("Exiting");   
       System.exit(0);
}
}
while(ch!=5);
st.close();
con.close();
}
catch(Exception e)
{
System.out.println("Error"+e);
}
}
}
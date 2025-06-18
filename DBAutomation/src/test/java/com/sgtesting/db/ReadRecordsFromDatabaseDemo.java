package com.sgtesting.db;

import java.sql.*;

public class ReadRecordsFromDatabaseDemo {
    public static void main(String[] args) {
    //    readRecords();
        insertRecords();
    }

    private static void readRecords()
    {
        Connection conn=null;
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","tiger");
            Statement stmt=conn.createStatement();
            String query="select * from dept";
            ResultSet rs=stmt.executeQuery(query);
            ResultSetMetaData rsdata = rs.getMetaData();
            String col1=rsdata.getColumnName(1);
            String col2=rsdata.getColumnName(2);
            String col3=rsdata.getColumnName(3);
            System.out.printf("%-12s",col1);
            System.out.printf("%-12s",col2);
            System.out.printf("%-12s",col3);
            System.out.printf("\n");
            while(rs.next())
            {
                String deptno=rs.getString("DEPTNO");
                String deptname=rs.getString("DNAME");
                String location=rs.getString("LOC");
                System.out.printf("%-12s",deptno);
                System.out.printf("%-12s",deptname);
                System.out.printf("%-12s",location);
                System.out.printf("\n");

            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                conn.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    private static void insertRecords()
    {
        Connection conn=null;
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","tiger");
            Statement stmt=conn.createStatement();
            String query="insert into dept values(50,'HEALTH','BANGALORE')";
            stmt.executeUpdate(query);


        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                conn.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}

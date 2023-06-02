package org.example;
import java.sql.*;
public class Create {
    public void create()
    {
        Config config = new Config();
        Connection con = null;
        Statement stmt = null;

        try
        {
            //Step 1 : Connecting to server and database
            con = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());
            //Step 2 : Initialize Statement
            stmt=con.createStatement();
            //Step 3 : SQL Query
            String query="CREATE TABLE ITEM(" +
                    "ID int NOT NULL AUTO_INCREMENT PRIMARY KEY," +
                    "PRODUCT varchar(50)," +
                    "PRICE varchar(10))";

            //Step 4 : Run Query
            stmt.executeUpdate(query);
            System.out.println("TABle ITEM Created Successfully");
        }

        catch (SQLException e)
        {
            System.err.println("Cannot connect ! ");
            e.printStackTrace();
        }

        finally {
            System.out.println("Closing the connection.");
            if (con != null) try { con.close(); } catch (SQLException ignore) {}
        }

    }
}

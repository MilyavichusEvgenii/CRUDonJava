package org.example;

import java.sql.*;
public class Delete {
    public void delete()
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
            String query="DROP TABLE COSMETIC";

            //Step 4 : Run Query
            stmt.executeUpdate(query);

            System.out.println("TABLE COSMETIC Deleted Successfully");
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

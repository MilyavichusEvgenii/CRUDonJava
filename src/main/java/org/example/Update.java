package org.example;

import java.sql.*;
public class Update {
    public void update()
    {
        Config config = new Config();
        Connection con = null;
        Statement stmt = null;

        try
        {
            //Step 1 : Connecting to Server
            con = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());
            //Step 2 : Initialize Statement
            stmt=con.createStatement();
            //Step 3 : SQL Query
            //Add New Column Quantity
            String query="INSERT INTO item(product, price)" +
                    "VALUES" +
                    "('bananas', '5000')," +
                    "('apple', 10000)";

            stmt.executeUpdate(query);
            System.out.println("Column Quantity Added Successfully");
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

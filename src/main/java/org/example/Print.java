package org.example;

import com.mysql.cj.jdbc.CallableStatement;

import java.sql.*;

public class Print {
    public void print()
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
            String query="SELECT * FROM item";

            //Step 4 : Run Query
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int price = rs.getInt(3);
                System.out.printf("%d. %s - %d \n", id, name, price);
                //Person table has name and gender column

            }

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

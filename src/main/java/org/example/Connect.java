package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect{

    public void connect() {
        Config config = new Config();
        try{
            String url = config.getUrl();
            String username = config.getUser();
            String password = config.getPassword();
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){

                System.out.println("Connection to Store DB succesfull!");
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");

            System.out.println(ex);
        }
    }
}

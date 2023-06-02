package org.example;

public class Config {
    private String url = "jdbc:mysql://localhost:3306/test?serverTimezone=Europe/Moscow&useSSL=false";
    private String user = "root";
    private String password = "1234567";

    public Config() {
    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}

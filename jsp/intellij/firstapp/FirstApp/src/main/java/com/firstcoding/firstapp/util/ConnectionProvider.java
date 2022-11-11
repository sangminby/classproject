package com.firstcoding.firstapp.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

    private Connection conn;

    private static ConnectionProvider instance = new ConnectionProvider();
    private ConnectionProvider() {}

    public ConnectionProvider getInstance() {

        return instance;
    }

    public Connection getConnecttion() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/project",
                "SCOTT",
                "tiger");

        return conn;
    }

}

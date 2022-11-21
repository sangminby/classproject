package com.firstcoding.todo.util;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;

public class ConnectionUtil {

    private HikariDataSource hikariDataSource;

    private static ConnectionUtil instance = new ConnectionUtil();

    private ConnectionUtil() {

        HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setJdbcUrl("jdbc:mysql://localhost:3306/project");
        config.setUsername("SCOTT");
        config.setPassword("tiger");

        config.setConnectionTimeout(30000);  // client app에서 connection 을 받기까지 기다리는 최대 시간 설정
        config.setMaximumPoolSize(20);       // pool 이 가지는 최대 connection 수 설정 : 기본값은 10
        config.setMaxLifetime(1800000);      // connection 최대 유지 시간 설정

        config.addDataSourceProperty("cachePrepStmts", true);
        config.addDataSourceProperty("prepStmtCacheSize", 250);
        config.addDataSourceProperty("prepStmtCacheSqlLimit", 2048);

        hikariDataSource = new HikariDataSource(config);

    }

    public static ConnectionUtil getInstance() {return instance;}

    public Connection getConnection() throws Exception {
        return hikariDataSource.getConnection();
    }

}

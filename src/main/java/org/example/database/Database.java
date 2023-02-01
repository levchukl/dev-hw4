package org.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private static final Database INSTANCE = new Database();
    private Connection connection;


    private Database() {
        try {
            String dbUrl = "jdbc:h2:./MegaSoft";
            connection = DriverManager.getConnection(dbUrl);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static Database getInstance(){
        return INSTANCE;
    }
    public int executeUpdate(String sql){
        try (Statement statement = connection.createStatement()){
            return statement.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
    public Connection getConnection(){
        return connection;
    }
    public void close(){
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

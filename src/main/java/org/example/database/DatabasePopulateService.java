package org.example.database;

import java.io.IOException;

import static org.example.database.DatabaseInitService.readFile;

public class DatabasePopulateService {
    public static void main(String[] args) {
        String fileRead = "src/main/resources/sql/populate_db.sql";
        String content = null;
        try {
            content = readFile(fileRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Database database = Database.getInstance();
        database.executeUpdate(content);
        database.close();
    }
}

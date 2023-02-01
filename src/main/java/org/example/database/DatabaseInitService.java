package org.example.database;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class DatabaseInitService {
    public static void main(String[] args) {
        String fileRead = "src/main/resources/sql/init_db.sql";
        String content = null;
        try{
            content = readFile(fileRead);
        } catch (IOException e){
            e.printStackTrace();
        }
        Database database = Database.getInstance();
        database.executeUpdate(content);
        database.close();
    }
    public static String readFile(String file) throws IOException {
        String content = Files.lines(Paths.get(file))
                .collect(Collectors.joining(System.lineSeparator()));
        return content;
    }
}

package org.example.database;

import org.example.model.*;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.example.database.DatabaseInitService.readFile;

public class DatabaseQueryService {
    public List<MaxProjectsClient> findMaxProjectsClient() throws SQLException {
        String fileRead = "src/main/resources/sql/find_max_projects_client.sql";
        String content = null;
        try {
            content = readFile(fileRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Database database = Database.getInstance();
        Statement statement = database.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(content);
        List<MaxProjectsClient> maxProjectsClients = new ArrayList<>();
        while (resultSet.next()){
            String name = resultSet.getString("name");
            int project_count = resultSet.getInt("project_count");
            maxProjectsClients.add(new MaxProjectsClient(resultSet.getString("name"),
                    resultSet.getInt("project_count")));
        }
        return maxProjectsClients;
    }

    public List<MaxSalaryWorker> findMaxSalaryWorkers() throws SQLException {
        String fileRead = "src/main/resources/sql/find_max_salary_worker.sql";
        String content = null;
        try {
            content = readFile(fileRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Database database = Database.getInstance();
        Statement statement = database.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(content);
        List<MaxSalaryWorker> maxSalaryWorker = new ArrayList<>();
        while (resultSet.next()){
            String name = resultSet.getString("name");
            int salary = resultSet.getInt("salary");
            maxSalaryWorker.add(new MaxSalaryWorker(resultSet.getString("name"),
                    resultSet.getInt("salary")));
        }
        return maxSalaryWorker;
    }

    public List<YoungestEldestWorkers> findYoungestEldestWorkers() throws SQLException {
        String fileRead = "src/main/resources/sql/find_youngest_eldest_workers.sql";
        String content = null;
        try {
            content = readFile(fileRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Database database = Database.getInstance();
        Statement statement = database.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(content);
        List<YoungestEldestWorkers> youngestEldestWorkers= new ArrayList<>();
        while (resultSet.next()){
            String type = resultSet.getString("type");
            String name = resultSet.getString("name");
            Date birthday = resultSet.getDate("birthday");
            youngestEldestWorkers.add(new YoungestEldestWorkers(resultSet.getString("type"),
                    resultSet.getString("name"), resultSet.getDate("birthday")));
        }
        return youngestEldestWorkers;
    }

    public List<ProjectPrices> printProjectPrices() throws SQLException {
        String fileRead = "src/main/resources/sql/print_project_prices.sql";
        String content = null;
        try {
            content = readFile(fileRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Database database = Database.getInstance();
        Statement statement = database.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(content);
        List<ProjectPrices> projectPrices= new ArrayList<>();
        while (resultSet.next()){
            String name = resultSet.getString("name");
            int price = resultSet.getInt("price");
            projectPrices.add(new ProjectPrices(resultSet.getString("name"),
                    resultSet.getInt("price")));
        }
        return projectPrices;
    }

    public List<LongestProject> findLongestProject() throws SQLException {
        String fileRead = "src/main/resources/sql/find_longest_project.sql";
        String content = null;
        try {
            content = readFile(fileRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Database database = Database.getInstance();
        Statement statement = database.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(content);
        List<LongestProject> longestProject= new ArrayList<>();
        while (resultSet.next()){
            String name = resultSet.getString("name");
            int month_count = resultSet.getInt("month_count");
            longestProject.add(new LongestProject(resultSet.getString("name"),
                    resultSet.getInt("month_count")));
        }
        return longestProject;
    }

}

package org.example;

import org.example.database.Database;
import org.example.database.DatabaseQueryService;
import org.example.model.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        DatabaseQueryService databaseQueryService = new DatabaseQueryService();

        List<MaxProjectCountClient> maxProjectCountClients = databaseQueryService.findMaxProjectsClient();
        maxProjectCountClients.forEach(System.out::println);

        List<LongestProject> longestProjects = databaseQueryService.findLongestProject();
        longestProjects.forEach(System.out::println);

        List<MaxSalaryWorker> maxSalaryWorkers = databaseQueryService.findMaxSalaryWorkers();
        maxSalaryWorkers.forEach(System.out::println);

        List<YoungestEldestWorkers> youngestEldestWorkers = databaseQueryService.findYoungestEldestWorkers();
        youngestEldestWorkers.forEach(System.out::println);

        List<ProjectPrices> projectPrices = databaseQueryService.printProjectPrices();
        projectPrices.forEach(System.out::println);

    }
}

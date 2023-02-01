package org.example;

import org.example.database.DatabaseQueryService;
import org.example.model.*;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        List<MaxProjectsClient> maxProjectsClients = new DatabaseQueryService().findMaxProjectsClient();
        List<MaxSalaryWorker> maxSalaryWorkers = new DatabaseQueryService().findMaxSalaryWorkers();
        List<YoungestEldestWorkers> youngestEldestWorkers = new DatabaseQueryService().findYoungestEldestWorkers();
        List<ProjectPrices> projectPrices = new DatabaseQueryService().printProjectPrices();
        List<LongestProject> longestProjects = new DatabaseQueryService().findLongestProject();

        System.out.println("maxSalaryWorkers = " + maxSalaryWorkers);
        System.out.println("maxProjectsClients = " + maxProjectsClients);
        System.out.println("youngestEldestWorkers = " + youngestEldestWorkers);
        System.out.println("projectPrices = " + projectPrices);
        System.out.println("longestProjects = " + longestProjects);
    }
}
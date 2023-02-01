package org.example.model;

public class MaxProjectsClient {
    private String name;
    private int project_count;

    public MaxProjectsClient(String name, int project_count) {
        this.name = name;
        this.project_count = project_count;
    }

    @Override
    public String toString() {
        return "MaxProjectsClient{" +
                "name='" + name + '\'' +
                ", project_count=" + project_count +
                '}';
    }
}

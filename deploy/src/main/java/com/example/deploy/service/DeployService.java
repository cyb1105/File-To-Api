package com.example.deploy.service;

public interface DeployService {
    void execute(String user, String userport);
    void delete(String user);
}

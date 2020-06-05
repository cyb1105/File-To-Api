package com.example.deploy.controller;

import com.example.deploy.service.DeployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin("http://localhost:3000")
public class DeployController {

    @Autowired
    DeployService deployService;


    @PostMapping("/run")
    public String runner() {
        deployService.execute("java -jar C:/Users/HPE/FileToApi/File-To-Api/ApiServer/target/csvtosql-0.1.jar");
        //deployService.execute("ipconfig");
        return "server down";
    }

    @PostMapping("/pid")
    public String pid(){
        deployService.execute("netstat -nao | findstr 10004");
        return "GET Pid";
    }

    @PostMapping("/down")
    public String down(){
        deployService.execute("netstat -nao | findstr 10004");
        return "GET Pid";
    }


}

package com.example.deploy.controller;

import com.example.deploy.service.DeployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class DeployController {

    @Autowired
    DeployService deployService;


    @PostMapping("/run")
    public String runner() {
        deployService.execute("java -jar C:/Users/HPE/Work/git-1/File-To-Api/Upload/target/Upload-0.0.1-SNAPSHOT.jar");
        //deployService.execute("ipconfig");
        return "server down";
    }

    @PostMapping("/pid")
    public String pid(){
        deployService.execute("netstat -nao | findstr 10003");
        return "GET Pid";
    }

    @PostMapping("/down")
    public String down(){
        deployService.execute("netstat -nao | findstr 10003");
        return "GET Pid";
    }


}

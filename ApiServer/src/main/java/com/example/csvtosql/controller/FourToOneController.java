package com.example.csvtosql.controller;

import com.example.csvtosql.service.OneToFourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FourToOneController {

    @Autowired
    private OneToFourService otfs;

    @GetMapping(value = "/request/{filename}")
    public void response(@PathVariable String filename) {

        otfs.postURL(); //kafuka data upload request
        otfs.getURL(filename);

    }


}



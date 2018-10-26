package com.istone.codetest.controller;

import com.istone.codetest.BootStrap;
import com.istone.codetest.channel.DatabaseChannel;
import com.istone.codetest.data.AlertData;
import com.istone.codetest.data.StringData;
import com.istone.codetest.service.AlertService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class AlertController {

    @Resource
    AlertService alertService;

    @ResponseBody
    @PostMapping(value = "/alert", consumes = "application/json", produces = "application/json")
    public ResponseEntity alert(@RequestBody AlertData alertData) {
        alertService.sendAlert(alertData);
        return ResponseEntity.ok(new StringData("sent"));
    }

    @ResponseBody
    @PostMapping(value = "/status", produces = "application/json")
    public ResponseEntity getStatus() {
        String status = alertService.getStatus();
        return ResponseEntity.ok(new StringData(status));
    }
}

package com.vekkerora.sever.controller;

import com.vekkerora.sever.service.AlarmService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping ("/api/v1/alarms")
public class AlarmController {

    private final AlarmService alarmService;

    //get
    //  alarm ids
    //  alarm by id
    //post
    //  new alarm
    //patch
    //  edit alarm by id
    //delete
    //  remove alarm by id

}

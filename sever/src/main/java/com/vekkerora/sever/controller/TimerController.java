package com.vekkerora.sever.controller;

import com.vekkerora.sever.service.TimerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/timers")
public class TimerController {
    private final TimerService timerService;

}

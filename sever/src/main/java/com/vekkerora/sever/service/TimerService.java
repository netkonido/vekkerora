package com.vekkerora.sever.service;

import com.vekkerora.sever.repository.TimerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimerService {

    final TimerRepository timerRepository;

    @Autowired
    public TimerService (TimerRepository tr){
        timerRepository = tr;
    }

    //add timer (name, hour, minute, second,
    //remove timer
    //edit timer
    //query timers

}

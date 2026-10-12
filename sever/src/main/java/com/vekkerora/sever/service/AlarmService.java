package com.vekkerora.sever.service;

import com.vekkerora.sever.repository.AlarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlarmService {
    final AlarmRepository alarmRepository;

    @Autowired
    public AlarmService(AlarmRepository ar){
        alarmRepository = ar;
    }

    //add alarm (name, hour, minute, second = 0, repeatOptions, snoozeTimes, snoozeMinutes)
    //remove alarm (id)
    //edit alarm (id, name, hour, minute, second = 0, repeatOptions, snoozeTimes, snoozeMinutes)
    //query alarms
}

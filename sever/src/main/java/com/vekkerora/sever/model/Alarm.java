package com.vekkerora.sever.model;

import com.vekkerora.sever.RepeatOptions;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Builder
public class Alarm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int hour;
    private int minute;
    private int second;

    private Set<RepeatOptions> repeat;
    private int snoozeMinutes;
    private int snoozeTimes;
    //tone id (custom tone pattern maybe)
}
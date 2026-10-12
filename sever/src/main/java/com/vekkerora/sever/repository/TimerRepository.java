package com.vekkerora.sever.repository;

import com.vekkerora.sever.model.Timer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimerRepository extends JpaRepository<Timer, Integer> {
}

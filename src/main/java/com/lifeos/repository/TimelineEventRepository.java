package com.lifeos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lifeos.entity.TimelineEvent;

@Repository
public interface TimelineEventRepository extends JpaRepository<TimelineEvent, Long> {

}

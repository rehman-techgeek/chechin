package com.inetsolv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inetsolv.entity.CheckInRecord;


public interface CheckinRepository extends JpaRepository<CheckInRecord,Long> {

}

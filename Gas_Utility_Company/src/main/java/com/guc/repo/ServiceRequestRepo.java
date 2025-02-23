package com.guc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guc.entity.ServiceRequest;

@Repository
public interface ServiceRequestRepo extends JpaRepository<ServiceRequest, Integer> {

}

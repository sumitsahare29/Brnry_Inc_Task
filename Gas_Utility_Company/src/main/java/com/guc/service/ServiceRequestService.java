package com.guc.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guc.entity.ServiceRequest;
import com.guc.repo.ServiceRequestRepo;

@Service
public class ServiceRequestService {

	@Autowired
	private ServiceRequestRepo repo;

	public ServiceRequest saveRequest(ServiceRequest request) {
		return repo.save(request);
	}

	public List<ServiceRequest> getAllRequests() {
		return repo.findAll();
	}

	public Optional<ServiceRequest> getRequestById(int id) {
		return repo.findById(id);
	}

	public ServiceRequest updateRequest(int id, ServiceRequest updateRequest) {
		return repo.findById(id).map(request -> {
			request.setStatus(updateRequest.getStatus());
			request.setUpdateAt(LocalDateTime.now());
			return repo.save(request);
		}).orElse(null);
	}
}

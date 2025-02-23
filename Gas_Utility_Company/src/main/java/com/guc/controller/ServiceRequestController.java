package com.guc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.guc.entity.ServiceRequest;
import com.guc.service.ServiceRequestService;

@RestController
public class ServiceRequestController {

	@Autowired
	private ServiceRequestService service;

	@PostMapping("/saveReq")
	public ServiceRequest createRequest(@RequestBody ServiceRequest request) {
		return service.saveRequest(request);
	}

	@GetMapping("/getAllReq")
	public List<ServiceRequest> getAllRequests() {
		return service.getAllRequests();
	}

	@GetMapping("/getReq/{id}")
	public Optional<ServiceRequest> getRequestById(@PathVariable int id) {
		return service.getRequestById(id);
	}

	@PutMapping("/updReq/{id}")
	public ServiceRequest updateRequest(@PathVariable int id, @RequestBody ServiceRequest updateRequest) {
		return service.updateRequest(id, updateRequest);
	}
}

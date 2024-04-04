package com.microservice.addressapp.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.addressapp.entity.Address;
import com.microservice.addressapp.repo.AddressRepo;
import com.microservice.addressapp.response.AddressResponse;

@Service
public class AddressService {
	@Autowired
	private AddressRepo addressRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public AddressResponse findAddressByEmployeeId(int employeeId) {
		Address address = addressRepo.findAddressByEmployeeId(employeeId);
		AddressResponse addressResponse = modelMapper.map(address, AddressResponse.class);
		return addressResponse;
		
	}

}

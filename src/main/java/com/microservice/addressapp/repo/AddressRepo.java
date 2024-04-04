package com.microservice.addressapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.microservice.addressapp.entity.Address;

public interface AddressRepo extends JpaRepository<Address,Integer>{
	// address based on an employee id
	@Query(nativeQuery = true, value = "SELECT  a.id, a.state, a.street,a.city, a.zip FROM seleniumexpressnew.address a JOIN seleniumexpressnew.employee e on e.id=a.employee_id where a.employee_id=:employeeId")
		
	Address findAddressByEmployeeId(@Param("employeeId") int employeeId);
}

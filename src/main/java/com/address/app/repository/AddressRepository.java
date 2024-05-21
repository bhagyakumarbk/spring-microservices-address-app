package com.address.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.address.app.model.AddressDTO;
import com.address.app.model.AddressEntity;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, Integer> {
//	@Query("select s from AddressEntity s where s.employeeId=?1")
	AddressEntity getByEmployeeId(int employeeId);

}

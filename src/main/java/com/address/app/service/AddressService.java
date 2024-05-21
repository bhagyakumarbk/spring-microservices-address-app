package com.address.app.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.address.app.model.AddressDTO;
import com.address.app.model.AddressEntity;
import com.address.app.repository.AddressRepository;

@Service
public class AddressService implements AddressAPI {

	@Autowired
	private ModelMapper mapper;
	@Autowired
	private AddressRepository repo;

	@Override
	public AddressDTO create(AddressDTO addressDTO) {
		// TODO Auto-generated method stub
		AddressEntity address = mapper.map(addressDTO, AddressEntity.class);
		address = repo.save(address);
		return mapper.map(address, AddressDTO.class);
	}

	@Override
	public AddressDTO getByid(int id) {
		// TODO Auto-generated method stub
		AddressEntity a = repo.getByEmployeeId(id);
		System.out.println("a"+a);
		return mapper.map(a, AddressDTO.class);
	}

}

package com.address.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.address.app.model.AddressDTO;
import com.address.app.service.AddressAPI;

@RestController
public class AddressController {

	@Autowired
	private AddressAPI api;

	@PostMapping(path = "/address/create")
	public AddressDTO create(@RequestBody AddressDTO addressDTO) {
		return api.create(addressDTO);
	}

	@GetMapping(path = "/address/{id}")
	public AddressDTO getByEmployeeId(@PathVariable("id") int id) {
		return api.getByid(id);
	}

}

package com.address.app.service;

import com.address.app.model.AddressDTO;

public interface AddressAPI {

	public AddressDTO create(AddressDTO addressDTO);

	public AddressDTO getByid(int id);

}

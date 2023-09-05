package com.bigcorp.project.business.services;

import com.bigcorp.project.data.contract.AddressService;

public class AddressServiceImpl implements AddressService {

	@Override
	public String getPostCode(String address) {
		return "92250";
	}

}

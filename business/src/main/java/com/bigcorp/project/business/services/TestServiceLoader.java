package com.bigcorp.project.business.services;

import java.util.ServiceLoader;

import com.bigcorp.project.data.contract.AddressService;

public class TestServiceLoader {

	public static void main(String[] args) {
		ServiceLoader<AddressService> loadedService = ServiceLoader.load(AddressService.class);
		System.out.println(loadedService);
	}

}

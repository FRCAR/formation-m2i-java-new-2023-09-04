import com.bigcorp.project.business.services.AddressServiceImpl;
import com.bigcorp.project.data.contract.AddressService;

module business{
	requires transitive data.contract;
	requires transitive data.repository;
	
	exports com.bigcorp.project.business.services;
	
	provides AddressService with AddressServiceImpl;
}
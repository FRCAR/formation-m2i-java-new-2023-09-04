import com.bigcorp.project.data.contract.AddressService;

/**
 * Meilleur module du monde.
 * @uses AddressService
 */
module graphics{
	
	//J'ai besoin de ça parce ...
	requires transitive business; 	
	
	uses AddressService;
}
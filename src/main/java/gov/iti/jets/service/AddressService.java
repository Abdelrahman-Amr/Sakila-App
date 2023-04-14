package gov.iti.jets.service;

import gov.iti.jets.dto.AddressDto;
import gov.iti.jets.entity.Address;
import gov.iti.jets.mapper.AddressMapper;

public class AddressService extends BaseServiceImpl<Address, AddressDto, Short> {

    private static volatile AddressService addressService;

    private AddressService() {
        super(Address.class, AddressMapper.class);
    }

    public static AddressService getInstance() {
        if (addressService == null) {
            synchronized (AddressService.class) {
                if (addressService == null) {
                    addressService = new AddressService();
                }
            }
        }
        return addressService;
    }
}

package gov.iti.jets.webService;

import gov.iti.jets.dto.AddressDto;
import gov.iti.jets.dto.CityDto;
import gov.iti.jets.service.AddressService;
import gov.iti.jets.service.CityService;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class AddressWS {
    private AddressService addressService;
    public AddressWS()
    {
        addressService = AddressService.getInstance();
    }
    @WebResult(name="Addresses")
    public List<AddressDto> findAllAddresses()
    {
        List<AddressDto> addressDtos = addressService.findAll();
        return  addressDtos;
    }
    @WebResult(name="Addresses")
    public List<AddressDto> getAddressesPage(@WebParam(name="page") int page, @WebParam(name="limit") int limit)
    {
        List<AddressDto> addressDtos = addressService.getPage(page, limit);
        return  addressDtos;
    }

    @WebResult(name="Address")
    public AddressDto findAddressById(@WebParam(name="id") short id)
    {
        return addressService.findById(id);
    }

    @WebResult(name="Address")
    public AddressDto addAddress(@WebParam(name = "Address") AddressDto dto) {
        AddressDto savedDto = addressService.add(dto);
        return savedDto;
    }

    @WebResult(name="Address")
    public AddressDto updateAddress(@WebParam(name = "id")short id,@WebParam(name = "Address") AddressDto dto) {
        AddressDto updatedDto = addressService.update(id, dto);
        return updatedDto;
    }

    @WebResult(name="Address")
    public AddressDto deleteAddressById(@WebParam(name = "id")short id) {
        AddressDto dto = addressService.deleteById(id);
        return dto;
    }
}

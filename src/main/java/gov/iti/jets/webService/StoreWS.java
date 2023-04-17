package gov.iti.jets.webService;

import gov.iti.jets.dto.StaffDto;
import gov.iti.jets.dto.StoreDto;
import gov.iti.jets.service.StaffService;
import gov.iti.jets.service.StoreService;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class StoreWS {
    private StoreService storeService;
    public StoreWS()
    {
        storeService = StoreService.getInstance();
    }
    @WebResult(name="store")
    public List<StoreDto> findAllStores()
    {
        List<StoreDto> storeDtos = storeService.findAll();
        return  storeDtos;
    }
    @WebResult(name="store")
    public List<StoreDto> getStoresPage(@WebParam(name="page") int page, @WebParam(name="limit") int limit)
    {
        List<StoreDto> storeDtos = storeService.getPage(page, limit);
        return  storeDtos;
    }

    @WebResult(name="store")
    public StoreDto findStoreById(@WebParam(name="id") short id)
    {
        return storeService.findById(id);
    }

    @WebResult(name="store")
    public StoreDto addStore(@WebParam(name = "store") StoreDto dto) {
        StoreDto storeDto = storeService.add(dto);
        return storeDto;
    }

    @WebResult(name="store")
    public StoreDto updateStore(@WebParam(name = "id") short id, @WebParam(name = "store") StoreDto dto) {
        StoreDto updatedDto = storeService.update(id, dto);
        return updatedDto;
    }

    @WebResult(name="store")
    public StoreDto deleteStoreById(@WebParam(name = "id") short id) {
        StoreDto dto = storeService.deleteById(id);
        return dto;
    }
}

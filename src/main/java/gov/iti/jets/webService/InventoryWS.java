package gov.iti.jets.webService;

import gov.iti.jets.dto.CityDto;
import gov.iti.jets.dto.InventoryDto;
import gov.iti.jets.service.CityService;
import gov.iti.jets.service.InventoryService;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class InventoryWS {

    private InventoryService inventoryService;
    public InventoryWS()
    {
        inventoryService = InventoryService.getInstance();
    }
    @WebResult(name="Inventory")
    public List<InventoryDto> findAllInventories()
    {
        List<InventoryDto> inventoryDtos = inventoryService.findAll();
        return  inventoryDtos;
    }
    @WebResult(name="Inventory")
    public List<InventoryDto> getInventoriesPage(@WebParam(name="page") int page, @WebParam(name="limit") int limit)
    {
        List<InventoryDto> inventoryDtos = inventoryService.getPage(page, limit);
        return  inventoryDtos;
    }

    @WebResult(name="Inventory")
    public InventoryDto findInventoryById(@WebParam(name="id") int id)
    {
        return inventoryService.findById(id);
    }

    @WebResult(name="Inventory")
    public InventoryDto addInventory(@WebParam(name = "Inventory") InventoryDto dto) {
        InventoryDto savedDto = inventoryService.add(dto);
        return savedDto;
    }

    @WebResult(name="Inventory")
    public InventoryDto updateInventory(@WebParam(name = "id")int id,@WebParam(name = "Inventory") InventoryDto dto) {
        InventoryDto updatedDto = inventoryService.update(id, dto);
        return updatedDto;
    }

    @WebResult(name="Inventory")
    public InventoryDto deleteInventoryById(@WebParam(name = "id")int id) {
        InventoryDto dto = inventoryService.deleteById(id);
        return dto;
    }
}

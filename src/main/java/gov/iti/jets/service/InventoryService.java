package gov.iti.jets.service;

import gov.iti.jets.dto.InventoryDto;
import gov.iti.jets.entity.Inventory;
import gov.iti.jets.mapper.InventoryMapper;

public class InventoryService extends BaseServiceImpl<Inventory, InventoryDto, Integer>{

    private static  volatile InventoryService inventoryService;

    private InventoryService()
    {
        super(Inventory.class, InventoryMapper.class);
    }
    public static InventoryService getInstance()
    {
        if(inventoryService == null)
        {
            synchronized (InventoryService.class)
            {
                if(inventoryService == null)
                {
                    inventoryService = new InventoryService();
                }
            }
        }
        return inventoryService;
    }
}

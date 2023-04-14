package gov.iti.jets.service;

import gov.iti.jets.dto.StoreDto;
import gov.iti.jets.entity.Store;
import gov.iti.jets.mapper.StoreMapper;

public class StoreService extends BaseServiceImpl<Store, StoreDto, Short> {

    private static volatile StoreService storeService;

    private StoreService() {
        super(Store.class, StoreMapper.class);
    }

    public static StoreService getInstance() {
        if (storeService == null) {
            synchronized (StoreService.class) {
                if (storeService == null) {
                    storeService = new StoreService();
                }
            }
        }
        return storeService;
    }
}

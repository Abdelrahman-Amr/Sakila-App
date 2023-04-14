package gov.iti.jets.service;

import gov.iti.jets.dto.StaffDto;
import gov.iti.jets.entity.Staff;
import gov.iti.jets.mapper.StaffMapper;
import gov.iti.jets.persistence.repository.StoreRepository;

public class StaffService extends BaseServiceImpl<Staff, StaffDto, Short> {

    private static volatile StaffService staffService;
    private StoreRepository storeRepository;

    private StaffService() {
        super(Staff.class, StaffMapper.class);
    }

    public static StaffService getInstance() {
        if (staffService == null) {
            synchronized (StaffService.class) {
                if (staffService == null) {
                    staffService = new StaffService();
                }
            }
        }
        return staffService;
    }

//    @Override
//    public StaffDto findById(Short id) {
//        BaseRepositoryImpl<Staff,Short> baseRepository = new BaseRepositoryImpl<>(Staff.class, MyLocal.getInstance().get());
//        Staff entity =  baseRepository.findById( id);
//        StaffDto dto = baseMapper.toDto(entity);
//        dto.setStoreid(entity.getStoreId().getStoreId());
//        return dto;
//    }
//
//    @Override
//    public List<StaffDto> findAll() {
//        BaseRepositoryImpl<Staff,Short> baseRepository = new BaseRepositoryImpl<>(Staff.class, MyLocal.getInstance().get());
//        List<Staff> entities = baseRepository.findAll();
//        List<StaffDto> dtos =baseMapper.toDTOs(entities);
//        for(int i = 0 ; i<entities.size() ; i++)
//        {
//            if(i<dtos.size())
//            {
//                dtos.get(i).setStoreid(entities.get((i)).getStoreId().getStoreId());
//            }
//        }
//
//        return  dtos;
//    }
//
//    @Override
//    public StaffDto add(StaffDto dto) {
//        storeRepository = new StoreRepositoryImpl();
//
//        BaseRepositoryImpl<Staff, Short> baseRepository = new BaseRepositoryImpl<>(Staff.class, MyLocal.getInstance().get());
//        Staff entity = baseMapper.toEntity(dto);
////        Store store = storeRepository.findById(dto.getStoreid());
////        System.out.println("store = "+store.getStoreId());
////        entity.setStore(storeI);
////        System.out.println(entity);
//        Store store = new Store();
//        store.setStoreId(dto.getStoreid());
//        entity.setStoreId(store);
//        entity = baseRepository.add(entity);
//        StaffDto savedDto = baseMapper.toDto(entity);
//        savedDto.setStoreid(dto.getStoreid());
//        return savedDto;
//    }
////
//    @Override
//    public StaffDto update(Short id, StaffDto dto) {
//        BaseRepositoryImpl<Staff,Short> baseRepository = new BaseRepositoryImpl<>(Staff.class, MyLocal.getInstance().get());
//        Staff entity = baseRepository.findById(id);
//        Staff ent = baseMapper.partialUpdate(dto,entity);
//        ent.getStore().setStoreId(dto.getStoreid());
//        Staff updatedEntity = baseRepository.update(ent);
//        StaffDto savedDto = baseMapper.toDto(updatedEntity);
//        return savedDto;
//    }
//
//    @Override
//    public StaffDto deleteById(Short id)
//    {
//        BaseRepositoryImpl<Staff,Short> baseRepository = new BaseRepositoryImpl<>(Staff.class, MyLocal.getInstance().get());
//        Staff entity = baseRepository.deleteById(id);
//        StaffDto dto = baseMapper.toDto(entity);
//        return dto;
//    }

}

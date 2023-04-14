package gov.iti.jets.service;

import gov.iti.jets.dto.ManagerDto;
import gov.iti.jets.entity.Staff;
import gov.iti.jets.mapper.ManagerMapper;

public class ManagerService extends BaseServiceImpl<Staff, ManagerDto, Short>{

    private static volatile ManagerService managerService;

    private ManagerService() {
        super(Staff.class, ManagerMapper.class);
    }

    public static ManagerService getInstance() {
        if (managerService == null) {
            synchronized (ManagerService.class) {
                if (managerService == null) {
                    managerService = new ManagerService();
                }
            }
        }
        return managerService;
    }

}

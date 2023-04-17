package gov.iti.jets.service;

import gov.iti.jets.dto.StaffDto;
import gov.iti.jets.entity.Staff;
import gov.iti.jets.mapper.StaffMapper;
import gov.iti.jets.persistence.repository.StoreRepository;
import gov.iti.jets.persistence.repositoryImpl.StaffRepositoryImpl;

public class StaffService extends BaseServiceImpl<Staff, StaffDto, Short> {

    private static volatile StaffService staffService;

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

    public byte[] getStaffPicture(short id)
    {
        StaffRepositoryImpl staffRepository = new StaffRepositoryImpl();
        byte[] picture = staffRepository.getStaffPicture(id);
        return  picture;
    }


}

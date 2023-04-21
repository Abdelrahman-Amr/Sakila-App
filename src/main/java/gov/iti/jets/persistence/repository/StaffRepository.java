package gov.iti.jets.persistence.repository;

import gov.iti.jets.entity.Staff;

import java.util.List;

public interface StaffRepository extends BaseRepository<Staff, Short>{
    byte[] getStaffPicture(short id);

     List<Staff> findByName(String name);

     boolean updateStaffPicture(short id, byte[] picture);



}



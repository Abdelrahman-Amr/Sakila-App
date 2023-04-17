package gov.iti.jets.persistence.repository;

import gov.iti.jets.entity.Staff;

public interface StaffRepository extends BaseRepository<Staff, Short>{
    byte[] getStaffPicture(short id);



}



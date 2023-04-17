package gov.iti.jets.webService;

import gov.iti.jets.dto.RentalDto;
import gov.iti.jets.dto.StaffDto;
import gov.iti.jets.service.StaffService;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;

import java.util.List;

@WebService
public class StaffWS {
    private StaffService staffService;
    public StaffWS()
    {
        staffService = StaffService.getInstance();
    }
    @WebResult(name="staff")
    public List<StaffDto> findAllStaff()
    {
        List<StaffDto> staffDtos = staffService.findAll();
        return  staffDtos;
    }
    @WebResult(name="staff")
    public List<StaffDto> getStaffPage(@WebParam(name="page") int page, @WebParam(name="limit") int limit)
    {
        List<StaffDto> staffDtos = staffService.getPage(page, limit);
        return  staffDtos;
    }

    @WebResult(name="picture")
    public byte[] getStaffPicture(@WebParam(name = "id") short id)
    {
        byte[] picture = staffService.getStaffPicture(id);
        return picture;
    }

    @WebResult(name="staff")
    public StaffDto findStaffById(@WebParam(name="id") short id)
    {
        return staffService.findById(id);
    }

    @WebResult(name="staff")
    public StaffDto addStaff(@WebParam(name = "staff") StaffDto dto) {
        StaffDto staffDto = staffService.add(dto);
        return staffDto;
    }

    @WebResult(name="staff")
    public StaffDto updateStaff(@WebParam(name = "id") short id, @WebParam(name = "staff") StaffDto dto) {
        StaffDto updatedDto = staffService.update(id, dto);
        return updatedDto;
    }

    @WebResult(name="staff")
    public StaffDto deleteStaffById(@WebParam(name = "id") short id) {
        StaffDto dto = staffService.deleteById(id);
        return dto;
    }
}

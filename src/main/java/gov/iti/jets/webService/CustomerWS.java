package gov.iti.jets.webService;

import gov.iti.jets.dto.CityDto;
import gov.iti.jets.dto.CustomerDto;
import gov.iti.jets.service.CityService;
import gov.iti.jets.service.CustomerService;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class CustomerWS {
    private CustomerService customerService;
    public CustomerWS()
    {
        customerService = CustomerService.getInstance();
    }
    @WebResult(name="Customer")
    public List<CustomerDto> findAllCustomers()
    {
        List<CustomerDto> customerDtos = customerService.findAll();
        return  customerDtos;
    }
    @WebResult(name="Customer")
    public List<CustomerDto> getCustomersPage(@WebParam(name="page") int page, @WebParam(name="limit") int limit)
    {
        List<CustomerDto> customerDtos = customerService.getPage(page, limit);
        return  customerDtos;
    }

    @WebResult(name="Customer")
    public CustomerDto findCustomerById(@WebParam(name="id") short id)
    {
        return customerService.findById(id);
    }

    @WebResult(name="Customer")
    public CustomerDto addCustomer(@WebParam(name = "Customer") CustomerDto dto) {
        CustomerDto savedDto = customerService.add(dto);
        return savedDto;
    }

    @WebResult(name="Customer")
    public CustomerDto updateCustomer(@WebParam(name = "id")short id,@WebParam(name = "Customer") CustomerDto dto) {
        CustomerDto updatedDto = customerService.update(id, dto);
        return updatedDto;
    }

    @WebResult(name="Customer")
    public CustomerDto deleteCustomerById(@WebParam(name = "id")short id) {
        CustomerDto dto = customerService.deleteById(id);
        return dto;
    }
}


package gov.iti.jets.service;

import gov.iti.jets.dto.CustomerDto;
import gov.iti.jets.entity.Customer;
import gov.iti.jets.mapper.CustomerMapper;
import gov.iti.jets.persistence.repositoryImpl.CustomerRepositoryImpl;

import java.util.List;

public class CustomerService extends BaseServiceImpl<Customer, CustomerDto, Short> {

    private static volatile CustomerService customerService;

    private CustomerService() {
        super(Customer.class, CustomerMapper.class);
    }

    public static CustomerService getInstance() {
        if (customerService == null) {
            synchronized (CustomerService.class) {
                if (customerService == null) {
                    customerService = new CustomerService();
                }
            }
        }
        return customerService;
    }

    public List<CustomerDto> findByName(String name)
    {
        CustomerRepositoryImpl customerRepository = new CustomerRepositoryImpl();
        List<Customer> customers = customerRepository.findByName(name);
        return baseMapper.toDTOs(customers);
    }

}

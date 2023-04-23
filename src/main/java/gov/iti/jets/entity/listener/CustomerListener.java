package gov.iti.jets.entity.listener;

import gov.iti.jets.entity.Customer;
import jakarta.persistence.PrePersist;

import java.time.LocalDateTime;
import java.util.Date;

public class CustomerListener {

    @PrePersist
    public void setCustomerCreateDate(Customer customer)
    {
        customer.setCreateDate(new Date());
    }




}

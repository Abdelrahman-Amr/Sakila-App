package gov.iti.jets.entity.listener;

import gov.iti.jets.entity.Customer;
import gov.iti.jets.entity.Payment;

import javax.persistence.PrePersist;
import java.time.LocalDateTime;
import java.util.Date;

public class EntityListener {

    @PrePersist
    private void setCustomerCreateDate(Customer customer)
    {
        customer.setCreateDate(new Date());
    }

    @PrePersist
    private void setPaymentDate(Payment payment)
    {
        payment.setPaymentDate(new Date());
    }
}

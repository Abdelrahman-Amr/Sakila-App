package gov.iti.jets.entity.listener;

import gov.iti.jets.entity.Payment;
import jakarta.persistence.PrePersist;

import java.time.LocalDateTime;
import java.util.Date;

public class PaymentListener {

    @PrePersist
    public void setPaymentDate(Payment payment)
    {
        payment.setPaymentDate(new Date());
    }
}

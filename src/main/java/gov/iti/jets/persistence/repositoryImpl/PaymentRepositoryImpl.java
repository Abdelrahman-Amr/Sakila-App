package gov.iti.jets.persistence.repositoryImpl;

import gov.iti.jets.entity.Payment;
import gov.iti.jets.persistence.repository.PaymentRepository;
import gov.iti.jets.util.MyLocal;

public class PaymentRepositoryImpl extends BaseRepositoryImpl<Payment, Short> implements PaymentRepository {
    public PaymentRepositoryImpl()
    {
        super(Payment.class, MyLocal.getInstance().get());
    }

}

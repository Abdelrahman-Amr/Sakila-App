package gov.iti.jets.persistence.repositoryImpl;

import gov.iti.jets.entity.Actor;
import gov.iti.jets.entity.Customer;
import gov.iti.jets.persistence.repository.CustomerRepository;
import gov.iti.jets.util.MyLocal;
import jakarta.persistence.Query;

import java.util.List;

public class CustomerRepositoryImpl extends BaseRepositoryImpl<Customer, Short> implements CustomerRepository {
    public CustomerRepositoryImpl()
    {
        super(Customer.class, MyLocal.getInstance().get());
    }

    @Override
    public List<Customer> findByName(String name)
    {
        Query query = entityManager.createQuery("from Customer a where a.firstName ilike '%' || :name || '%' or a.lastName ilike '%' || :name || '%'   ", Actor.class);
        query.setParameter("name", name);
        List<Customer> customers = query.getResultList();
        return customers;
    }

}

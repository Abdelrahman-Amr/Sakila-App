package gov.iti.jets.persistence.repositoryImpl;

import gov.iti.jets.entity.Category;
import gov.iti.jets.persistence.repository.CategoryRepository;
import gov.iti.jets.util.MyLocal;

public class CategoryRepositoryImpl extends BaseRepositoryImpl<Category, Short> implements CategoryRepository {

    public CategoryRepositoryImpl()
    {
        super(Category.class, MyLocal.getInstance().get());
    }

}

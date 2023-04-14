package gov.iti.jets.service;

import gov.iti.jets.dto.CategoryDto;
import gov.iti.jets.entity.Category;
import gov.iti.jets.mapper.CategoryMapper;

public class CategoryService extends BaseServiceImpl<Category, CategoryDto, Short>{
    private static  volatile CategoryService categoryService;

    private CategoryService()
    {
        super(Category.class, CategoryMapper.class);
    }
    public static CategoryService getInstance()
    {
        if(categoryService == null)
        {
            synchronized (CategoryService.class)
            {
                if(categoryService == null)
                {
                    categoryService = new CategoryService();
                }
            }
        }
        return  categoryService;
    }
}

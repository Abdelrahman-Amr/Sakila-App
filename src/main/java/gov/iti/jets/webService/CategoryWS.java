package gov.iti.jets.webService;

import gov.iti.jets.dto.CategoryDto;
import gov.iti.jets.service.CategoryService;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class CategoryWS {
    private CategoryService categoryService;
    public CategoryWS()
    {
        categoryService = CategoryService.getInstance();
    }
    @WebResult(name="Category")
    public List<CategoryDto> findAllCategories()
    {
        List<CategoryDto> categoryDtos = categoryService.findAll();
        return  categoryDtos;
    }
    @WebResult(name="Category")
    public List<CategoryDto> getCategoriesPage(@WebParam(name="page") int page, @WebParam(name="limit") int limit)
    {
        List<CategoryDto> categoryDtos = categoryService.getPage(page, limit);
        return  categoryDtos;
    }

    @WebResult(name="Category")
    public CategoryDto findCategoryById(@WebParam(name="id") short id)
    {
        return categoryService.findById(id);
    }

    @WebResult(name="Category")
    public CategoryDto addCategory(@WebParam(name = "Category") CategoryDto dto) {
        CategoryDto savedDto = categoryService.add(dto);
        return savedDto;
    }

    @WebResult(name="Category")
    public CategoryDto updateCategory(@WebParam(name = "id")short id,@WebParam(name = "Category") CategoryDto dto) {
        CategoryDto updatedDto = categoryService.update(id, dto);
        return updatedDto;
    }

    @WebResult(name="Category")
    public CategoryDto deleteCategoryById(@WebParam(name = "id")short id) {
        CategoryDto dto = categoryService.deleteById(id);
        return dto;
    }
}

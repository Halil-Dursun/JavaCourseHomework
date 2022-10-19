package Business;

import Core.Logging.Logger;
import DataAccess.CategoryDao;
import Entities.Category;

import java.util.List;

public class CategoryManager implements ICategoryManager{

    private CategoryDao categoryDao;

    private List<Logger> loggers;
    private List<Category> categories;


    public CategoryManager(CategoryDao categoryDao,List<Category> categories,List<Logger> loggers){
        this.categoryDao = categoryDao;
        this.categories = categories;
    }


    @Override
    public void add(Category category) throws Exception {

        for (Category categoryValue:categories){
            if (categoryValue.getCategoryName() == category.getCategoryName()){
                throw  new Exception("Kategori ismi tekrar edemez.");
            }
        }
        categoryDao.add(category);

        for (Logger logger: loggers){
            logger.log(category.getCategoryName());
        }
    }
}

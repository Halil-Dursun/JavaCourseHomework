package DataAccess.Jdbc;

import DataAccess.CategoryDao;
import Entities.Category;

public class JdbcCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println(category.getCategoryName() + " Kategorisi Jdbc ile eklendi.");
    }
}

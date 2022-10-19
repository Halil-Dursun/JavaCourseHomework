package DataAccess.Hibarnate;

import DataAccess.CategoryDao;
import Entities.Category;

public class HibernateCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println(category.getCategoryName() + " Kategorisi hibernate ile eklendi.");
    }
}

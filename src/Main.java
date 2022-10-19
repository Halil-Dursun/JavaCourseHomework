import Business.CategoryManager;
import Core.Logging.DatabaseLogger;
import Core.Logging.FileLogger;
import Core.Logging.Logger;
import Core.Logging.MailLogger;
import DataAccess.Hibarnate.HibernateCategoryDao;
import DataAccess.Jdbc.JdbcCategoryDao;
import Entities.Category;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Category> categories = new ArrayList<>();
        Category  category = new Category("1","Programlama");
        Category category1 = new Category("2","UI Design");
        categories.add(category);

        List<Logger> loggers= new ArrayList<>();
        loggers.add(new DatabaseLogger());
        loggers.add(new FileLogger());
        loggers.add(new MailLogger());

        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), categories,loggers);
        categoryManager.add(category1);
    }
}
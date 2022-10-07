package DataAccess.Concrete.Jdbc;

import DataAccess.Abstract.ICategoryDao;
import Entities.Concrete.Category;

public class JdbcCategoryDao implements ICategoryDao {
    public Category[] getAll() {
        return new Category[0];
    }

    public void add(Category category) {
        System.out.println("category added with Jdbc : " + category.getCategoryName());
    }

    public void delete(Category category) {
        System.out.println("category deleted with Jdbc : " + category.getCategoryName());
    }

    public void update(Category category) {
        System.out.println("category updated with Jdbc : " + category.getCategoryName());
    }
}

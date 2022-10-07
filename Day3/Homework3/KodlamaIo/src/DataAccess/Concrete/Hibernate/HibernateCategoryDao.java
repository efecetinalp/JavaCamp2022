package DataAccess.Concrete.Hibernate;

import DataAccess.Abstract.ICategoryDao;
import Entities.Concrete.Category;

public class HibernateCategoryDao implements ICategoryDao {
    public Category[] getAll() {
        return new Category[0];
    }

    public void add(Category category) {
        System.out.println("category added with Hibernate : " + category.getCategoryName());
    }

    public void delete(Category category) {
        System.out.println("category deleted with Hibernate : " + category.getCategoryName());
    }

    public void update(Category category) {
        System.out.println("category updated with Hibernate : " + category.getCategoryName());
    }
}

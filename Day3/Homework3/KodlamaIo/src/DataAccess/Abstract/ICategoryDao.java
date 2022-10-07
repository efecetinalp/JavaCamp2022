package DataAccess.Abstract;

import Entities.Concrete.Category;

public interface ICategoryDao {
    Category[] getAll();
    void add(Category category);
    void delete (Category category);
    void update (Category category);
}

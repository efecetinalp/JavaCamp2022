package Business.Abstract;

import Entities.Concrete.Category;

public interface ICategoryService {
    Category[] getAll();
    void add(Category category);
    void delete (Category category);
    void update (Category category);
}

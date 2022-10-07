package Business.Concrete;

import Business.Abstract.ICategoryService;
import Business.Core.BusinessRules;
import Core.ILogger;
import DataAccess.Abstract.ICategoryDao;
import Entities.Concrete.Category;

public class CategoryManager implements ICategoryService {
    private ICategoryDao _categoryDao;
    private ILogger _logger;

    public CategoryManager(ICategoryDao categoryDao, ILogger logger){
        this._categoryDao = categoryDao;
        this._logger = logger;
    }

    public Category[] getAll() {
        _logger.log("list of categories");
        return _categoryDao.getAll();
    }

    public void add(Category category) {
        if(BusinessRules.checkNameIsExists(category.getCategoryName())){
            _categoryDao.add(category);
            _logger.log(category.getCategoryName());
        }else{
            System.out.println("Category name is already exists!");
        }
    }

    public void delete(Category category) {
        _categoryDao.delete(category);
        _logger.log(category.getCategoryName());
    }

    public void update(Category category) {
        _categoryDao.update(category);
        _logger.log(category.getCategoryName());
    }
}

package Entities.Concrete;

import Entities.Abstract.IEntity;

public class Category implements IEntity {
    private int Id;
    private String CategoryName;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }
}

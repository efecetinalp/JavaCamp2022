package Entities.Concrete;

import Entities.Abstract.IEntity;

public class Course implements IEntity {
    private int Id;
    private String CourseName;
    private String Description;
    private int InstructorId;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getInstructorId() {
        return InstructorId;
    }

    public void setInstructorId(int instructorId) {
        InstructorId = instructorId;
    }
}

package DataAccess.Abstract;

import Entities.Concrete.Course;

public interface ICourseDao {
    Course[] getAll();
    void add(Course course);
    void delete (Course course);
    void update (Course course);
}

package Business.Abstract;

import Entities.Concrete.Course;

public interface ICourseService {
    Course[] getAll();
    void add(Course course);
    void delete (Course course);
    void update (Course course);
}

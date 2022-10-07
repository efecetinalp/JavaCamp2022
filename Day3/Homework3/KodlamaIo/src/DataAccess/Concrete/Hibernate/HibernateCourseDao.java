package DataAccess.Concrete.Hibernate;

import DataAccess.Abstract.ICourseDao;
import Entities.Concrete.Course;

public class HibernateCourseDao implements ICourseDao {
    public Course[] getAll() {
        return new Course[0];
    }

    public void add(Course course) {
        System.out.println("course added with Hibernate : " + course.getCourseName());
    }

    public void delete(Course course) {
        System.out.println("course deleted with Hibernate : " + course.getCourseName());
    }

    public void update(Course course) {
        System.out.println("course updated with Hibernate : " + course.getCourseName());
    }
}

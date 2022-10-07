package DataAccess.Concrete.Jdbc;

import DataAccess.Abstract.ICourseDao;
import Entities.Concrete.Course;

public class JdbcCourseDao implements ICourseDao {
    public Course[] getAll() {
        return new Course[0];
    }

    public void add(Course course) {
        System.out.println("course added with Jdbc : " + course.getCourseName());
    }

    public void delete(Course course) {
        System.out.println("course deleted with Jdbc : " + course.getCourseName());
    }

    public void update(Course course) {
        System.out.println("course updated with Jdbc : " + course.getCourseName());
    }
}

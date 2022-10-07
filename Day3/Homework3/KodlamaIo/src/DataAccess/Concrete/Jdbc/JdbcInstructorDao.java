package DataAccess.Concrete.Jdbc;

import DataAccess.Abstract.IInstructorDao;
import Entities.Concrete.Instructor;

public class JdbcInstructorDao implements IInstructorDao {
    public Instructor[] getAll() {
        return new Instructor[0];
    }

    public void add(Instructor instructor) {
        System.out.println("instructor added with Jdbc : " + instructor.getFirstName() + " " + instructor.getLastName());
    }

    public void delete(Instructor instructor) {
        System.out.println("instructor deleted with Jdbc : " + instructor.getFirstName() + " " + instructor.getLastName());
    }

    public void update(Instructor instructor) {
        System.out.println("instructor updated with Jdbc : " + instructor.getFirstName() + " " + instructor.getLastName());
    }
}

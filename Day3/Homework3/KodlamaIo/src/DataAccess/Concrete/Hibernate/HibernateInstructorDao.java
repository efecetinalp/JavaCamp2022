package DataAccess.Concrete.Hibernate;

import DataAccess.Abstract.IInstructorDao;
import Entities.Concrete.Instructor;

public class HibernateInstructorDao implements IInstructorDao {
    public Instructor[] getAll() {
        return new Instructor[0];
    }

    public void add(Instructor instructor) {
        System.out.println("instructor added with Hibernate : " + instructor.getFirstName() + " " + instructor.getLastName());
    }

    public void delete(Instructor instructor) {
        System.out.println("instructor deleted with Hibernate : " + instructor.getFirstName() + " " + instructor.getLastName());
    }

    public void update(Instructor instructor) {
        System.out.println("instructor updated with Hibernate : " + instructor.getFirstName() + " " + instructor.getLastName());
    }
}

package DataAccess.Abstract;

import Entities.Concrete.Instructor;

public interface IInstructorDao {
    Instructor[] getAll();
    void add(Instructor instructor);
    void delete (Instructor instructor);
    void update (Instructor instructor);
}

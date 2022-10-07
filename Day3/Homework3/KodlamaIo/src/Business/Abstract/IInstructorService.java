package Business.Abstract;

import Entities.Concrete.Instructor;

public interface IInstructorService {
    Instructor[] getAll();
    void add(Instructor instructor);
    void delete (Instructor instructor);
    void update (Instructor instructor);
}

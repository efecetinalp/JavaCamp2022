package Business.Concrete;

import Business.Abstract.IInstructorService;
import Core.ILogger;
import DataAccess.Abstract.IInstructorDao;
import Entities.Concrete.Instructor;

public class InstructorManager implements IInstructorService {
    private IInstructorDao _instructorDao;
    private ILogger _logger;

    public InstructorManager(IInstructorDao instructorDao, ILogger logger){
        this._instructorDao = instructorDao;
        this._logger = logger;
    }

    public Instructor[] getAll() {
        _logger.log("list of instructors");
        return _instructorDao.getAll();
    }

    public void add(Instructor instructor) {
        _instructorDao.add(instructor);
        _logger.log(instructor.getFirstName() + " " + instructor.getLastName());
    }

    public void delete(Instructor instructor) {
        _instructorDao.delete(instructor);
        _logger.log(instructor.getFirstName() + " " + instructor.getLastName());
    }

    public void update(Instructor instructor) {
        _instructorDao.update(instructor);
        _logger.log(instructor.getFirstName() + " " + instructor.getLastName());
    }
}

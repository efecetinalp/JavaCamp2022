package Business.Concrete;

import Business.Abstract.ICourseService;
import Business.Core.BusinessRules;
import Core.ILogger;
import DataAccess.Abstract.ICourseDao;
import Entities.Concrete.Course;

public class CourseManager implements ICourseService {
    private ICourseDao _courseDao;
    private ILogger _logger;

    public CourseManager(ICourseDao courseDao, ILogger logger){
        this._courseDao = courseDao;
        this._logger = logger;
    }

    public Course[] getAll() {
        _logger.log("list of courses");
        return _courseDao.getAll();
    }

    public void add(Course course) {
        if (BusinessRules.checkCoursePrice(course.getPrice()) &&
                BusinessRules.checkNameIsExists(course.getCourseName())){
            _courseDao.add(course);
            _logger.log(course.getCourseName());
        }else{
            System.out.println("Course is not valid");
        }
    }

    public void delete(Course course) {
        _courseDao.delete(course);
        _logger.log(course.getCourseName());
    }

    public void update(Course course) {
        _courseDao.update(course);
        _logger.log(course.getCourseName());
    }
}

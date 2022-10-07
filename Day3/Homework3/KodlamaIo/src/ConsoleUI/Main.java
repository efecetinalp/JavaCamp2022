package ConsoleUI;

import Business.Concrete.CategoryManager;
import Business.Concrete.CourseManager;
import Business.Concrete.InstructorManager;
import Core.ConsoleLogger;
import Core.DatabaseLogger;
import Core.FileLogger;
import DataAccess.Concrete.Hibernate.HibernateCategoryDao;
import DataAccess.Concrete.Hibernate.HibernateInstructorDao;
import DataAccess.Concrete.Jdbc.JdbcCourseDao;
import Entities.Concrete.Category;
import Entities.Concrete.Course;
import Entities.Concrete.Instructor;

public class Main {
    public static void main(String[] args) {
        //addCourseTest();              //params database:Jdbc logger:Database
        //notValidCourseTest();         //course price is lover then 0;
        //addCategoryTest();            //params database:Hibernate logger:File
        //failCategoryTest();           //category name is exists
        //addInstructorTest();          //params database:Hibernate logger:Console
        updateInstructorTest();
        deleteInstructorTest();
    }

    private static void addInstructorTest(){
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), new ConsoleLogger());
        Instructor instructor = new Instructor();
        instructor.setId(1);
        instructor.setFirstName("Efe");
        instructor.setLastName("Cetinalp");
        instructorManager.add(instructor);
    }

    private static void updateInstructorTest(){
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), new ConsoleLogger());
        Instructor instructor = new Instructor();
        instructor.setId(1);
        instructor.setFirstName("Efe");
        instructor.setLastName("Cetinalp");
        instructorManager.update(instructor);
    }

    private static void deleteInstructorTest(){
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), new ConsoleLogger());
        Instructor instructor = new Instructor();
        instructor.setId(1);
        instructor.setFirstName("Efe");
        instructor.setLastName("Cetinalp");
        instructorManager.delete(instructor);
    }

    private static void addCategoryTest(){
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), new FileLogger());
        Category category = new Category();
        category.setId(1);
        category.setCategoryName("Programming");
        categoryManager.add(category);
    }

    private static void failCategoryTest(){
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), new FileLogger());
        Category category = new Category();
        category.setId(1);
        category.setCategoryName("");
        categoryManager.add(category);
    }

    private static void addCourseTest(){
        CourseManager courseManager = new CourseManager(new JdbcCourseDao(), new DatabaseLogger());
        Course course = new Course();
        course.setId(1);
        course.setCourseName("JAVA 2022");
        course.setPrice(2000);
        courseManager.add(course);
    }

    private static void notValidCourseTest(){
        CourseManager courseManager = new CourseManager(new JdbcCourseDao(), new DatabaseLogger());
        Course course = new Course();
        course.setId(1);
        course.setCourseName("JAVA 2022");
        course.setPrice(-2);
        courseManager.add(course);
    }



}



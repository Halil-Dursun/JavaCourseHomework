package Business;

import Core.Logging.Logger;
import DataAccess.CourseDao;
import Entities.Course;

import java.util.List;

public class CourseManager implements ICourseManager{
    private CourseDao courseDao;
    private List<Logger> loggers;
    private List<Course> courses;

    public CourseManager(CourseDao courseDao, List<Logger> loggers,List<Course> courses){
        this.courseDao = courseDao;
        this.courses = courses;
        this.loggers = loggers;
    }


    @Override
    public void add(Course course) throws Exception {
        if (course.getPrice() < 0 ){
            throw new Exception("Kurs fiyatı 0 dan büyük olmalıdır.");
        }
        for(Course courseValue :  courses) {
            if(courseValue.getCourseName() == course.getCourseName()) {
                throw new Exception("Kursu ismi daha önce kullanıldı.");
            }
            else {
                courseDao.add(course);

                for(Logger logger : loggers) {
                    logger.log(course.getCourseName());
                }
            }
        }
    }
}

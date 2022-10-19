package DataAccess.Hibarnate;

import DataAccess.CourseDao;
import Entities.Course;

public class HibernateCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName() + " Kursu Hibernate ile eklendi.");
    }
}

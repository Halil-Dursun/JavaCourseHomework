package DataAccess.Jdbc;

import DataAccess.CourseDao;
import Entities.Course;

public class JdbcCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName() + " Kursu Jdbc ile eklendi.");
    }
}

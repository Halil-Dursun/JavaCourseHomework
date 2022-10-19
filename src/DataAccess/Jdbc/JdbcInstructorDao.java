package DataAccess.Jdbc;

import DataAccess.InstructorDao;
import Entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " Eğitmenimiz Jdbc ile eklendi.");
    }
}

package DataAccess.Hibarnate;

import DataAccess.InstructorDao;
import Entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " Eğitmenimiz hibernate ile eklendi.");
    }
}

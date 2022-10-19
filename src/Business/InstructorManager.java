package Business;

import Core.Logging.Logger;
import DataAccess.CourseDao;
import DataAccess.InstructorDao;
import Entities.Instructor;

import java.util.List;

public class InstructorManager implements IInstructorManager{
    private InstructorDao instructorDao;
    private List<Logger> loggers;
    private List<Instructor> instructors;

    public InstructorManager(InstructorDao instructorDao , List<Logger> loggers, List<Instructor> instructors){
        this.instructorDao = instructorDao;
        this.instructors = instructors;
        this.loggers = loggers;
    }


    @Override
    public void add(Instructor instructor) throws Exception {

        for(Instructor  instructorValue :  instructors) {
            if(instructorValue.getFirstName() + instructorValue.getLastName() == instructor.getFirstName() + instructor.getLastName()) {
                throw new Exception("Bu eğitmen daha önce eklendi.");
            }
            else {
                instructorDao.add(instructor);

                for(Logger logger : loggers) {
                    logger.log(instructor.getFirstName() + instructor.getLastName());
                }
            }
        }
    }
}

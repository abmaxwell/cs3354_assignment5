package assign5;

import java.util.Observer;
import java.util.Observable;

/**
 * Class designed to observe the change to averages of
 * Student objects (subject) via the getAverage() method.
 * @author Alexander Maxwell
 */
public class AvgObserver implements Observer{

    /**
     * Private member variables.
     */
    private double studentAvg;

    /**
     * Constructor
     *
     * Adds an observer to the given student and
     * gets their current average grade.
     * @param student the student to observe
     */
    public AvgObserver(Student student){
        student.addObserver(this);
        studentAvg = student.getAverage();
    }

    /**
     * Public method to process an update to the observer
     * after change to the subject (Student) is detected.
     * @param obj the object being observed
     * @param arg a specific argument that can be passed
     *            into the update method.
     */
    public void update(Observable obj, Object arg){
        Student student = (Student)obj;
        int compareResult = Double.compare(studentAvg, student.getAverage());
        if(compareResult != 0){
            studentAvg = student.getAverage();
        }
    }
}

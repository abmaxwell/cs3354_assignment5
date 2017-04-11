package assign5;

import java.util.ArrayList;

/**
 * Extends the Average class by defining a specific method for
 * calculating a student's average grade using a drop assignment
 * condition.
 * @author Alexander Maxwell
 */
public class DropAssignAverage extends Average{

    /**
     * Overloaded Constructor
     * @param assignments the list of assignment grades for given student.
     * @param exams the list of exam grades for given student.
     */
    public DropAssignAverage(ArrayList<Double> assignments, ArrayList<Double> exams){
        super(assignments, exams);
    }
    /**
     * Calculates the total student's average grade using the formula
     * .60(exams) + .40(assignments) = 100, it also drops the
     * lowest assignment score thus raising the average slightly.
     *
     * @return average the alternate algorithm for calculating the student's average
     */
    public double calculateAverage(){
        double average;
        average = (EXAM_WEIGHTED * (totalExamsScore()/exams.size()) +
                (ASSIGN_WEIGHTED * ((totalAssignScore() -
                        assignments.get(findLowestAssign()))/(assignments.size()-1))));

        return average;
    }
}

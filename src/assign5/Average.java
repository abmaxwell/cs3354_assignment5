package assign5;

import java.util.ArrayList;

/**
 * This abstract class provides a definition for calculating a
 * student's average grade based on two sub-classes StandardAverage
 * and DropAssignAverage.
 * @author Alexander Maxwell
 */
abstract public class Average {

    /**
     * Static Member Variables.
     */
    static double EXAM_WEIGHTED = .60; // Exam worth of total grade.
    static double ASSIGN_WEIGHTED = .40; // Assignment worth of total grade.
    static double MAX_GRADE = 100.00; // Highest possible numerical grade.
    static ArrayList<Double> assignments;
    static ArrayList<Double> exams;

    /**
     *  Default Constructor
     */
    public Average(){/* DO NOTHING */}

    /**
     * Overloaded Constructor
     * @param assignments student's current list of assignment grades
     * @param exams student's current list of exam grades
     */
    public Average(ArrayList<Double> assignments, ArrayList<Double> exams){
        this.assignments = assignments;
        this.exams = exams;
    }

    /**
     * Calculates the accumulated exam scores for a student exams list.
     * @author Alexander Maxwell
     * @return totalExams the total score for all of the student's exams
     */
    public double totalExamsScore(){
        double totalExams = 0;
        for (double exam : exams) {
            totalExams += exam;
        }
        return totalExams;
    }

    /**
     * Calculates the accumulated exam scores for a student assignments list.
     * @author Alexander Maxwell
     * @return totalAssign the total score for all of the student's assignments
     */
    public double totalAssignScore(){
        double totalAssign = 0;
        for (double assignment : assignments) {
            totalAssign += assignment;
        }
        return totalAssign;
    }
    /**
     * Traverses the student's assignments and finds the lowest grade and
     * returns the index to it in the assignments list back to the caller.
     * @author Alexander Maxwell
     * @return indexLowest index of the student's lowest assignment grade
     */
    public int findLowestAssign(){
        double lowest = MAX_GRADE;
        int indexLowest = 0;
        for (double assignment : assignments){
            if(assignment < lowest){
                indexLowest = assignments.indexOf(assignment);
                lowest = assignment;
            }
        }
        return indexLowest;
    }

    /**
     * This abstract method is defind in sub-classes and calculates the
     * student's current average grade based on sub-classes defined
     * method.
     * @return averageGrade student's current grade averaged.
     */
    abstract public double calculateAverage();
}

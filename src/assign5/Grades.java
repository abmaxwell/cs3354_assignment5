package assign5;

/**
 * This interface provides a system by which to calculate
 * a student's average grade via two averaging algorithms.
 * @author Alexander Maxwell
 */
public interface Grades {

    /**
     * Member variables.
     */
    double EXAM_WEIGHTED = .60; // Exam worth of total grade.
    double ASSIGN_WEIGHTED = .40; // Assignment worth of total grade.
    double MAX_GRADE = 100.00; // Highest possible numerical grade.

    /**
     * Public interface methods.
     */

    /**
     * Calculates the average of grade for a student based on a
     * defined algorithm.
     * @author Alexander Maxwell
     * @return averageGrade the student's calculated average grade
     */
    public double calculateAverage();

    /**
     * Calculates the total exam score for a student (raw unweighted).
     *
     * @author Alexander Maxwell
     * @return totalExams the total score for all of the student's exams
     */
    public double totalExamsScore();

    /**
     * Calculates the total assignment score for a student (raw unweighted).
     *
     * @author Alexander Maxwell
     * @return totalAssign the total score for all of the student's assignments
     */
    public double totalAssignScore();

    /**
     * Traverses the student's assignments and finds the lowest grade and
     * returns the index of the lowest grade to the caller.
     *
     * @author Alexander Maxwell
     * @return indexLowest index of the student's lowest assignment grade
     */
    public int findLowestAssign();

    /**
     * Calculates the total student's average grade using the standard
     * .60(exams) and .40(assignments) calculation.
     *
     * @author Alexander Maxwell
     * @return average the standard algorithm for calculating the student's average
     */
    public double standardAverage();

    /**
     * Calculates the total student's average grade using the .60(exams)
     * and .40(assignments) calculation but also drops the lowest assignment score.
     *
     * @author Alexander Maxwell
     * @return average the alternate algorithm for calculating the student's average
     */
    public double dropAssignAverage();

}

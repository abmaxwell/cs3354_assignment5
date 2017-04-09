package assign5;

/**
 * This interface provides a system by which to calculate
 * a student's average grade via two averaging methods.
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
    public double calculateAverage();
    public double totalExamsScore();
    public double totalAssignScore();
    public int findLowestAssign();
    public double standardAverage();
    public double dropAssignAverage();

}

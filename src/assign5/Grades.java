package assign5;

/**
 * @author Alexander Maxwell
 */
public interface Grades {

    /*
     * Static variables.
     */
    static double EXAM_WEIGHTED = .60;
    static double ASSIGN_WEIGHTED = .40;
    static double MAX_GRADE = 100.00;

    /*
     * Public methods.
     */
    public double calculateAverage();
    public double totalExamsScore();
    public double totalAssignScore();
    public int findLowestAssign();
    public double standardAverage();
    public double dropAssignAverage();

}

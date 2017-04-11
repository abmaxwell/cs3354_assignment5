package assign5;

/**
 * Interface that's expected by the client. Used simply to conform to
 * Adapter design pattern where GradeTracker acts as the Adapter for
 * the Grades interface (Legacy Interface)
 * @author Alexander Maxwell
 */
public interface GTInterface {
    /**
     * @return letterGrade students grade represented as a character
     */
    public char getLetterGrade();
}

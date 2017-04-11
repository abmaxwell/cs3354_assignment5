package assign5;

/**
 * Interface that's expected by the client. Used simply to conform to
 * the "Adapter Design Pattern" where GradeTracker acts as the Adapter for
 * the Average interface (Legacy Interface) and the legacy class Student.
 * @author Alexander Maxwell
 */
public interface GTInterface {
    /**
     * @return letterGrade students grade represented as a character.
     */
    public char getLetterGrade();
}

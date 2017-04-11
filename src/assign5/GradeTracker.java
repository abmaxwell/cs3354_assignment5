package assign5;

/**
 * The GradeTracker class is an adapter class for the Interface called
 * GTInterface. It allows the client (driver) to get a student's current
 * grade in letter form using the preexisting legacy classes Student and
 * Average.
 * @author Alexander Maxwell
 */

public class GradeTracker implements GTInterface {

    /**
     * Private member variables.
     */
    private Student student;
    private double studentAvg;

    /**
     * Default Constructor
     */
    public GradeTracker(){/* DO NOTHING*/}

    /**
     * Overloaded Constructor
     *
     * @param student the current student to calculate letter grade for.
     */
    public GradeTracker(Student student){this.student=student;}

    /**
     * Implements the method getLetterGrade() from the GTInterface. Returns
     * the subject's current letter grade after calling preexisting legacy
     * class Student and its method getAverage().
     *
     * @return letterGrade the alphabetical representation of student's current grade
     */
    @Override
    public char getLetterGrade() {
        char letterGrade;
        studentAvg = student.getAverage();
        if (studentAvg >= 90.0) {
            // A
            letterGrade = 'A';
        } else if (studentAvg <= 89.9 && studentAvg >= 80.0) {
            // B
            letterGrade = 'B';
        } else if (studentAvg <= 79.9 && studentAvg >= 70.0) {
            // C
            letterGrade = 'C';
        } else if (studentAvg <= 69.9 && studentAvg >= 60.0) {
            // D
            letterGrade = 'D';
        } else {
            // F
            letterGrade = 'F';
        }
        return letterGrade;
    }
}
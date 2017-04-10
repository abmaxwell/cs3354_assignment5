package assign5;

/**
 * The GradeTracker class is an adapter class for the Grades interface.
 * It allows the client (driver) to get a student's current grade in
 * letter form.
 * @author Alexander Maxwell
 */

public class GradeTracker {
    /*
     * Private member variables.
     */
    private Student student;

    /**
     * Constructor
     * @param student the current student to calculate letter grade for.
     */
    public GradeTracker(Student student){
        this.student = student;
    }

    /**
     * Returns the subject's current letter grade.
     * @return letterGrade the alphabetical representation of student's current grade
     */
    public char getLetterGrade() {
        return calculateLetterGrade(student.getAverage());
    }

    /**
     * Returns the subject's average grade converted to its
     * letter grade equivalent.
     * @param studentAvgGrade
     * @return letterGrade the alphabetical representation of student's current grade
     */
    private char calculateLetterGrade(double studentAvgGrade){
        char letterGrade;
        if (studentAvgGrade >= 90.0){
            // A
            letterGrade = 'A';
        } else if (studentAvgGrade <= 89.9 && studentAvgGrade >= 80.0){
            // B
            letterGrade = 'B';
        } else if (studentAvgGrade <= 79.9 && studentAvgGrade >= 70.0){
            // C
            letterGrade = 'C';
        } else if (studentAvgGrade <= 69.9 && studentAvgGrade >= 60.0) {
            // D
            letterGrade = 'D';
        } else {
            // F
            letterGrade = 'F';
        }
        return letterGrade;
    }
}

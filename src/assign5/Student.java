package assign5;

import java.util.ArrayList;

/**
 * Represents a student and their scores in a class.
 * Stores the name, assignment scores and exam scores.
 * @author Jill Seaman
 *
 */
public class Student implements Grades {

    private String name;                    // Students full name
	private boolean algorithmSelect;
    private ArrayList<Double> assignments;  // scores for the assignments
    private ArrayList<Double> exams;        // scores for the exams
    
	/**
	 * Constructs the student from their name
	 * @param name  full name of the student.
	 */
	public Student(String name) {
		this.name = name;
        assignments = new ArrayList<Double>();
        exams = new ArrayList<Double>();
	}

	/**
	 * @return the student's full name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Adds an assignment score to the collection of assignment scores for the student.
	 * @param as the assignment score to add
	 */
	public void addAssignmentScore (double as) {
		assignments.add(as);
	}
	/**
	 * Adds an exam score to the collection of exam scores for the student.
	 * @param es the exam score to add
	 */
	public void addExamScore (double es) {
		exams.add(es);
	}

	/**
	 * Implements the Grades interface to calculate an average grade.
	 * @author Alexander Maxwell
	 * @return avgGrade
	 */
	public double getAverage(){
		return calculateAverage();
	}
	/**
	 * Sets private member variable for getAverage() function.
	 * @author Alexander Maxwell
	 */
	public void setDropLowestAssign(boolean algorithmSelect){
		this.algorithmSelect = algorithmSelect;
	}
	/**
	 * Implementation of the public method calculateAverage() from the
	 * Grades interface, which calculates the average of grade for a
	 * student based on a defined algorithm.
	 * @author Alexander Maxwell
	 * @return averageGrade
	 */
	public double calculateAverage(){
		double averageGrade = -1; // -1 Means error!

		if (!algorithmSelect) {
			// Select 60/40 average grade algorithm
			averageGrade = standardAverage();
		} else {
			// Select the 60/40 (drop) average grade algorithm
			if (assignments.size() >= 2) {
				return averageGrade = dropAssignAverage();
			} else {
				System.out.println("Cannot drop lowest! Must have at least" +
						"2 assignments posted.");
			}
		}
		return averageGrade;
	}
	/**
	 * Implementation for the public method totalExamsScore()
	 * from the Grades interface, which calculates the total
	 * exam score for a student.
	 *
	 * @author Alexander Maxwell
	 * @return totalExams
	 */
	public double totalExamsScore(){
		double totalExams = 0;
		for (double exam : exams) {
			totalExams += exam;
		}

		return totalExams;
	}
	/**
	 * Implementation for the public method totalAssignScore()
	 * from the Grades interface, which calculates the total
	 * assignment score for a student.
	 *
	 * @author Alexander Maxwell
	 * @return totalAssign
	 */
	public double totalAssignScore(){
		double totalAssign = 0;
		for (double assignment : assignments) {
			totalAssign += assignment;
		}
		return totalAssign;
	}
	/**
	 * Implementation for the public method standardAverage()
	 * from the Grades interface, which calculates the total
	 * student's average grade using the standard .60(exams)
	 * and .40(assignments) calculation.
	 *
	 * @author Alexander Maxwell
	 * @return average
	 */
	public double standardAverage(){
		//System.out.println("DEBUG: In standardAverage()");
		double average;
		average = (EXAM_WEIGHTED * (totalExamsScore()/exams.size())) +
				(ASSIGN_WEIGHTED * (totalAssignScore()/assignments.size()));
		return average;
	}
	/**
	 * Implementation for the public method standardAverage()
	 * from the Grades interface, which calculates the total
	 * student's average grade using the .60(exams)
	 * and .40(assignments) calculation but also drops the
	 * lowest assignment score.
	 *
	 * @author Alexander Maxwell
	 * @return average
	 */
	public double dropAssignAverage(){
		// System.out.println("DEBUG: In dropAssignAverage()");
		double average;
		average = (EXAM_WEIGHTED * (totalExamsScore()/exams.size()) +
				(ASSIGN_WEIGHTED * ((totalAssignScore() -
						assignments.get(findLowestAssign()))/(assignments.size()-1))));

		return average;
	}
	/**
	 * Implementation for the public method findLowestAssign()
	 * from the Grades interface, traverses the student's assignments
	 * and finds the lowest grade and returns the index of the lowest
	 * grade to the caller.
	 *
	 * @author Alexander Maxwell
	 * @return indexLowest
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



}

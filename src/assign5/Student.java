package assign5;

import java.util.Observable;
import java.util.ArrayList;

/**
 * Represents a student and their scores in a class.
 * Stores the name, assignment scores and exam scores.
 * @author Jill Seaman
 *
 */
public class Student extends Observable {

	private String name;                    // Students full name
	private boolean avgSelect;              // selects algorithm for average
	private ArrayList<Double> assignments;  // scores for the assignments
	private ArrayList<Double> exams;        // scores for the exams

	/**
	 * Constructs the student from their name
	 *
	 * @param name full name of the student.
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
	 *
	 * @param as the assignment score to add
	 */
	public void addAssignmentScore(double as) {
		assignments.add(as);
	}

	/**
	 * Adds an exam score to the collection of exam scores for the student.
	 *
	 * @param es the exam score to add
	 */
	public void addExamScore(double es) {
		exams.add(es);
	}

	/**
	 * Instantiates two Average class sub-classes to carryout
	 * calculating the student's average grade based on the
	 * condition set by setDropLowestAssign().
	 *
	 * @author Alexander Maxwell
	 * @return averageGrade the student's current average grade
	 */
	public double getAverage() {
		double averageGrade = -1; // -1 Means error!
		if (!avgSelect) {
			// Select 60/40 average grade algorithm
			StandardAverage grade = new StandardAverage(assignments, exams);
			averageGrade = grade.calculateAverage();
		} else {
			// Select the 60/40 (drop) average grade algorithm
			if (assignments.size() >= 2) {
				DropAssignAverage grade = new DropAssignAverage(assignments, exams);
				averageGrade = grade.calculateAverage();
			} else {
				System.out.println("Cannot drop lowest! Must have at least" +
						"2 assignments posted.");
			}
		}
		// Notify avgObserver of change to subject.
		setChanged();
		notifyObservers();
		return averageGrade;
	}

	/**
	 * Set private member variable algorithmSelect used in Grades
	 * method calculateAverage().
	 *
	 * @author Alexander Maxwell
	 * @param avgSelect boolean value used to select average calculation
	 *                   algorithm
	 */
	public void setDropLowestAssign(boolean avgSelect) {
		this.avgSelect = avgSelect;
	}
}


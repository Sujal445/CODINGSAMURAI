//  Task 3 : Grade Calculator
// importing Scanner class to take user input
import java.util.Scanner;
// importing InputMismatchException for exception handling
import java.util.InputMismatchException;
class CollectMarks {
	private Scanner sc;
	// constructor
	CollectMarks() {
		sc = new Scanner(System.in);
	}
	// taking assignment marks
	public double assignmentMarks() {
		System.out.println("Enter your assignment marks:");
		// try catch block
		try {
			double assignment_marks = sc.nextInt();           // if else statement
			if (assignment_marks >= 0 && assignment_marks <= 100) {
				return assignment_marks;
			} else {
				System.out.println("Invalid Marks\nassuming 0 marks");
				return 0;
			}
		}
		// catch block to handle exception
		catch (InputMismatchException e) {
			System.out.println("Invalid Marks\nassuming 0 marks");
			sc.nextLine();
			return 0;
		}
	}

// taking quizzes marks
	public double quizMarks() {
		System.out.println("Enter your quizzes marks:");
		// try catch block
		try {
			double quiz_marks = sc.nextInt();
			// if else block
			if (quiz_marks >= 0 && quiz_marks <= 100) {
				return quiz_marks;
			} else {
				System.out.println("Invalid Marks\nassuming 0 marks");
				return 0;
			}
		}
		// catch block to handle exception
		catch (InputMismatchException e) {
			System.out.println("Invalid Marks\nassuming 0 marks");
			sc.nextLine();
			return 0;
		}
	}

	public double unitTestMarks() {
		System.out.println("Enter your unit test  marks:");
		// try block
		try {
			double ut_marks = sc.nextInt();
			// if else statement
			if (ut_marks >= 0 && ut_marks <= 100) {
				return ut_marks;
			} else {
				System.out.println("Invalid Marks\nassuming 0 marks");
				return 0;
			}
		}
		// catch block to handle exception
		catch (InputMismatchException e) {
			System.out.println("Invalid Marks\nassuming 0 marks");
			sc.nextLine();
			return 0;
		}
	}

	public double midtermExamMarks() {
		System.out.println("Enter your midterm exam marks:");
		// try block
		try {
			double midterm_exam_marks = sc.nextInt();
			if (midterm_exam_marks >= 0 && midterm_exam_marks <= 100) {
				return midterm_exam_marks;
			} else {
				System.out.println("Invalid Marks\nassuming 0 marks");
				return 0;
			}
		}
		// catch block to handle exception
		catch (InputMismatchException e) {
			System.out.println("Invalid Marks\nassuming 0 marks");
			sc.nextLine();
			return 0;
		}
	}

// taking final exam marks from user
	public double finalExamMarks() {
		System.out.println("Enter your final exam marks:");
		// try block
		try {
			double final_exam_marks = sc.nextInt();
			// if else statement
			if (final_exam_marks >= 0 && final_exam_marks <= 100) {
				return final_exam_marks;
			} else {
				System.out.println("Invalid Marks\nassuming 0 marks");
				return 0;
			}
		}
		// catch block to handle exception
		catch (InputMismatchException e) {
			System.out.println("Invalid Marks\nassuming 0 marks");
			sc.nextLine();
			return 0;
		}
	}
// calculating marks
	public double marksCalculator(double a, double q, double u, double m, double f) {
		double total = a + q + u + m + f;
		double marks = total / 5;
		return marks;
	}
// grade calculating according marks got
	public char gradingScale(double marks) {
		if (marks >= 90) {
			return 'A';
		} else if (marks >= 80) {
			return 'B';
		} else if (marks >= 70) {
			return 'C';
		} else if (marks >= 50) {
			return 'D';
		} else if (marks >= 35) {
			return 'E';
		} else {
			return 'F';
		}
	}
}
// main class
public class GradeCalculator {
	// main method
	public static void main(String[] args) {
		// creating object of CollectMarks class
		CollectMarks student = new CollectMarks();
		// calling assignmentMarks method
		double amarks = student.assignmentMarks();
// calling quizMarks method
		double qmarks = student.quizMarks();
// calling unitTestMarks method
		double utmarks = student.unitTestMarks();
// calling midtermExamMarks method
		double memarks = student.midtermExamMarks();
// calling finalExamMarks method
		double femarks = student.finalExamMarks();
// calling marksCalculator method
		double total_marks = student.marksCalculator(amarks, qmarks, utmarks, memarks, femarks);

		System.out.println("You got total " + total_marks + " Marks");
// calling gradingScale method
		char grade = student.gradingScale(total_marks);
		System.out.println("You got " + grade + " Grade");

	}
}
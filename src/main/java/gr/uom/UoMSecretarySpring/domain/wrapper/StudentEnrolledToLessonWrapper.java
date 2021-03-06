/**
 * 
 */
package gr.uom.uomsecretaryspring.domain.wrapper;

import java.util.List;

import gr.uom.uomsecretaryspring.domain.StudentEnrolledToLesson;

/**
 * @author Georgios Digkas <mai153@uom.edu.gr>
 *
 */
public class StudentEnrolledToLessonWrapper {

	private List<StudentEnrolledToLesson> studentsEnrolledToLessonList;

	public StudentEnrolledToLessonWrapper() {
		//Empty constructor for setting values
	}

	public List<StudentEnrolledToLesson> getStudentsEnrolledToLessonList() {
		return studentsEnrolledToLessonList;
	}

	public void setStudentsEnrolledToLessonList(List<StudentEnrolledToLesson> studentsEnrolledToLessonList) {
		this.studentsEnrolledToLessonList = studentsEnrolledToLessonList;
	}

}

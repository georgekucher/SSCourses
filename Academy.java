import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Academy {
	private Set<Course> courses = new HashSet<Course>();
	
	public Academy() {
		
	}
	
	Academy(Set<Course> courses) {
		this.setCourses(courses);
	}

	
	public Set<Course> getCourses() {
		return this.courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
	public void addCourse(Course course) {
		this.courses.add(course);
	}
	
	public List<Test> getTestsOfCourse(String name) {
		List<Test> tests = new ArrayList<Test>();
		for (Course course : courses) {
			if (course.getName().equals(name)) tests = (course.getTests());
		}
		return tests;
	}
	
	public List<Course> weekCourses() {
		List<Course> soonCourses = new ArrayList<Course>();
		Calendar now = new GregorianCalendar();
		Calendar inAWeek = new GregorianCalendar(now.get(Calendar.YEAR),
				now.get(Calendar.MONTH), now.get(Calendar.DAY_OF_MONTH + 7));
		for (Course course : courses) {
			if ((course.getStartDate().compareTo(now) > 0)
					&& (course.getStartDate().compareTo(inAWeek) < 0))
				soonCourses.add(course);
		}
		return soonCourses;
		
	}

	@Override
	public String toString() {
		return "ACADEMY" + "\n" + getCourses();
	}
}

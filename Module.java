

public class Module {
	private String name;
	private int academicHours;
	private Test test;

	Module() {
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAcademicHours() {
		return academicHours;
	}

	public void setAcademicHours(int academicHours) {
		this.academicHours = academicHours;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	@Override
	public String toString() {
		return "Module name: " + name + "\n" + "Academic hours: "
				+ academicHours + "\n" + "Test results: " + "\n" + test;
	}
}

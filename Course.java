import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;


public class Course {
	private String name = new String();
	private Calendar startDate = new GregorianCalendar();
	private Calendar endDate = new GregorianCalendar();
	private List<Module> modules = new ArrayList<Module>();
	
	Course() {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setStartDate(String startDate) {
		String[] date = startDate.split("-");
		Calendar calendar = new GregorianCalendar(Integer.parseInt(date[0]),
				Integer.parseInt(date[1]) - 1, Integer.parseInt(date[2]));
		this.startDate = calendar;
	}
	public Calendar getStartDate() {
		return startDate;
	}
	public void setEndDate(String endDate) {
		String[] date = endDate.split("-");
		Calendar calendar = new GregorianCalendar(Integer.parseInt(date[0]),
				Integer.parseInt(date[1]) - 1, Integer.parseInt(date[2]));
		this.endDate = calendar;
	}
	public Calendar getEndDate() {
		return endDate;
	}
	public void setModules(List<Module> modules) {
		this.modules = modules;
	}
	public List<Module> getModules() {
		return modules;
	}
	public void addModules(Module module) {
		this.modules.add(module);
	}
	
	
	public List<Test> getTests() {
		List<Test> tests = new ArrayList<Test>();
		for (int i = 0; i < modules.size(); i++) {
			Test t = modules.get(i).getTest();
			if (t != null) tests.add(t);
		}
		return tests;
		
	}
	

	@Override
	public String toString() {
		return "Course name: " + name + "\n" + "Start date: "
				+ startDate.get(Calendar.YEAR) + "-"
				+ (startDate.get(Calendar.MONTH) + 1) + "-"
				+ startDate.get(Calendar.DAY_OF_MONTH) + "\n" + "End date: "
				+ endDate.get(Calendar.YEAR)
				+ "-" + (endDate.get(Calendar.MONTH) + 1) + "-"
				+ endDate.get(Calendar.DAY_OF_MONTH) + "\n" + "Modules: " + "\n"
				+ modules;
	}
}

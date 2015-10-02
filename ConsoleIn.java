import java.io.InputStream;
import java.util.Scanner;


public class ConsoleIn implements IO {
	private Scanner sc;
	
	@Override
	public Academy readAcademy(Object obj) throws Exception {
		/*Academy academy = new Academy();
		System.out.println("Enter the number of courses you want to add:");
		sc = new Scanner((InputStream) obj);
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= n; i++) readCourse()*/
		return null;
	}
	@Override
	public Course readCourse(Object obj) throws Exception {
		Course course = new Course();
		Validation val = new Validation();
		System.out.println("Enter course data in following format: Name | "
						+ "Start date (YYYY-MM-DD) | End date (YYYY-MM-DD) | "
						+ "Nubmer of Modules");
		sc = new Scanner((InputStream) obj);
		String[] s = sc.nextLine().split("\\|");
		
		course.setName(s[0]);
		if (val.validDate(s[1])) {
			course.setStartDate(s[1]);
		}
		if (val.validDate(s[2])) {
			course.setEndDate(s[2]);
		}
		int n = Integer.parseInt(s[3]);
		
		
		//System.out.print(data[0] + data[1] + data[2] + data[3]);
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter module-" + i + " data:");
			course.addModules(readModule(System.in));
		}
		return course;
	}
	@Override
	public Module readModule(Object obj) throws Exception {
		Module module = new Module();
		Validation validation = new Validation();
		System.out.println("Enter module data in following format: Name | "
								+ "Academic hours | Test availability (Y/N)");
		sc = new Scanner((InputStream) obj);
		String[] data = sc.nextLine().split("\\|");
		module.setName(data[0]);
		module.setAcademicHours(Integer.parseInt(data[1]));
		if (data[2].equals("Y")) module.setTest(new Test(data[0]));
		return module;
	}
	@Override
	public void writeAcademy(Academy academy, String file) throws Exception {
		// TODO Auto-generated method stub
	}	
	@Override
	public void writeCourse(Course course, String file) throws Exception {
		// TODO Auto-generated method stub		
	}
	@Override
	public void writeModule(Module module, String file) throws Exception {
		// TODO Auto-generated method stub
		
	}
}

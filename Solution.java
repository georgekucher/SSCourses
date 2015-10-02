import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		IO xml = new XmlIO(); // "json" "console"
		IO json = new JsonIO();
		IO qwe = new ConsoleIn();
		Academy ac = new Academy();
		try {
			ac = xml.readAcademy("C:\\Development\\Academy.xml");
		} catch (FileNotFoundException e) {
			System.out.println(e + "  We will create a new Academy!!!");
		}
		System.out.println("Enter the number of courses you want to add:");
		int courseNum = Integer.parseInt(sc.next()); 
		for (int i = 1; i <= courseNum; i++) {
			System.out.println("Enter course-" + i + " data:");
			Course course = qwe.readCourse(System.in);
			ac.addCourse(course);
		}
		/*System.out.println("Enter the number of modules you want to add:");
		int moduleNum = Integer.parseInt(sc.next()); 
		for (int i = 1; i <= moduleNum; i++) {
			System.out.println("Enter module-" + i + " data:");
			ac.addCourse(course);
		}*/
		xml.writeAcademy(ac, "C:\\Development\\Academy.xml");
		json.writeAcademy(ac, "C:\\Development\\Academy.txt");
		sc.close();
		
		System.out.println(ac.getTestsOfCourse("Java"));  // TASK #1
		
		System.out.println();
		
		System.out.println(ac.weekCourses());  // TASK #2
		
		
		
		//System.out.println(ac);
	}
}
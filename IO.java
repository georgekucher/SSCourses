
public interface IO {
	void writeAcademy(Academy academy, String file) throws Exception;
	void writeCourse(Course course, String file) throws Exception;
	void writeModule(Module module, String file) throws Exception;
	Academy readAcademy(Object obj) throws Exception;
	Course readCourse(Object obj) throws Exception;
	Module readModule(Object obj) throws Exception;
}
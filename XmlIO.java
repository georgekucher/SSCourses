import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;



public class XmlIO implements IO {

	@Override
	public void writeAcademy(Academy ac, String file) throws Exception {
		XStream xstream = new XStream(new StaxDriver()); // require XPP3 library
	    xstream.alias("ACADEMY",  Academy.class);
	    String xml = xstream.toXML(ac);
	    BufferedWriter bw = new BufferedWriter(new FileWriter(new File(file)));
		bw.write(xml);
		bw.close();
	}

	@Override
	public Academy readAcademy(Object obj) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader((String) obj));
		String s = br.readLine();
		br.close();
		XStream xstream = new XStream(new StaxDriver());
		xstream.alias("ACADEMY",  Academy.class);
		return (Academy) xstream.fromXML(s);
	}

	@Override
	public void writeCourse(Course course, String file) throws Exception {
		XStream xstream = new XStream(new StaxDriver()); // require XPP3 library
		xstream.alias("COURSE",  Course.class);
		String xml = xstream.toXML(course);
	    BufferedWriter bw = new BufferedWriter(new FileWriter(new File(file)));
		bw.write(xml);
		bw.close();
	}

	@Override
	public void writeModule(Module module, String file) throws Exception {
		XStream xstream = new XStream(new StaxDriver()); // require XPP3 library
		xstream.alias("MODULE",  Module.class);
	    String xml = xstream.toXML(module);
	    BufferedWriter bw = new BufferedWriter(new FileWriter(new File(file)));
		bw.write(xml);
		bw.close();
	}

	@Override
	public Course readCourse(Object obj) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader((String) obj));
		String s = br.readLine();
		br.close();
		XStream xstream = new XStream(new StaxDriver());
		xstream.alias("COURSE",  Course.class);
		return (Course) xstream.fromXML(s);
	}

	@Override
	public Module readModule(Object obj) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader((String) obj));
		String s = br.readLine();
		br.close();
		XStream xstream = new XStream(new StaxDriver());
		xstream.alias("MODULE",  Module.class);
		return (Module) xstream.fromXML(s);
	}
}



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import com.google.gson.Gson;



public class JsonIO implements IO {
	
	@Override
	public void writeAcademy(Academy ac, String file) throws Exception {
		Gson gson = new Gson();
		//Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(ac);
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(file)));
		bw.write(json);
		bw.close();
	}

	@Override
	public Academy readAcademy(Object obj) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader((String) obj));
		br.close();
		String s = br.readLine();
		Gson gson = new Gson();
		return gson.fromJson(s, Academy.class);
	}

	@Override
	public void writeCourse(Course course, String file) throws Exception {
		Gson gson = new Gson();
		//Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(course);
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(file)));
		bw.write(json);
		bw.close();
	}

	@Override
	public void writeModule(Module module, String file) throws Exception {
		Gson gson = new Gson();
		//Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(module);
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(file)));
		bw.write(json);
		bw.close();
	}

	@Override
	public Course readCourse(Object obj) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader((String) obj));
		br.close();
		String s = br.readLine();
		Gson gson = new Gson();
		return gson.fromJson(s, Course.class);
	}

	@Override
	public Module readModule(Object obj) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader((String) obj));
		br.close();
		String s = br.readLine();
		Gson gson = new Gson();
		return gson.fromJson(s, Module.class);
	}
}

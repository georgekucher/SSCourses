import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validation {
	private static final String DATE_PATTERN = 
			"((19|20)\\d\\d)-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])";
	
	public boolean validDate(String s) throws Exception {
		Pattern p = Pattern.compile(DATE_PATTERN);
		Matcher m = p.matcher(s);  
        return m.matches(); 
	}	
}

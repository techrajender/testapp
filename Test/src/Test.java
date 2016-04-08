import java.io.IOException;
import java.util.Properties;


public class Test {
	public static void main(String[] args) {
		Properties configFile = new XProperties();
		try {
			configFile.load(Test.class.getClassLoader().getResourceAsStream("config.properties"));
			String name = configFile.getProperty("app.url");
			System.out.println(name);
		} catch (IOException e) {
 
			e.printStackTrace();
		}
	}
}

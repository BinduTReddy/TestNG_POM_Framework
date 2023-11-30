package Base_Programs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Read_ConfigProperties_File {
	private Properties  props;

	public Read_ConfigProperties_File() throws IOException {
		props = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\main\\java\\DataProvider\\Config.properties");
		props.load(fis);
		fis.close();
	}
	
	public Properties getproperties() {
		return props;
	}
}



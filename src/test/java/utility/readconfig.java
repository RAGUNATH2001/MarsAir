package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class readconfig {

	public static Properties probj;
	static FileInputStream fileobj ;



	public static Properties readconfigfile()  {

		try {
			fileobj = new FileInputStream(new File("./Resource/config.properties"));
			probj = new Properties();
			probj.load(fileobj);
		}
		catch (FileNotFoundException e) {

		}
		catch (IOException e) {

		}

		return probj;




	}

}

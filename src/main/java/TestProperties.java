import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static java.time.chrono.ThaiBuddhistChronology.INSTANCE;

public class TestProperties extends Properties {

    private  final TestProperties properties = new Properties();

    private TestProperties() {
        System.setProperty("environment", "application");
        try {
            properties.load(new FileInputStream(new File("./" + System.getProperty("environment") + ".properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static TestProperties get.Instance() {
        if (INSTANCE == null) {
            INSTANCE = new TestProperties();
        }
        return INSTANCE;
    }

    public Properties getProperties() {return properties;}
}

public class BaseTest {
    protected static WebDriver driver; 
    protected static String baseUrl; 
    public static Properties properties = TestProperties.getInstance().getProperties();   

    @BeforeClass 
    public static void setUp() throws Exception { 
        switch (properties.getProperty("browser")){ 
            case "firefox": 
                System.setProperty("webdriver.gecko.driver", properties.getProperty("webdriver.gecko.driver")); 
                driver = new FirefoxDriver(); 
                break; 
            case "chrome": 
                System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver")); 
                driver = new ChromeDriver(); 
                break; 
            default: 
                System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver")); 
                driver = new ChromeDriver();             }  

        baseUrl = properties.getProperty("app.url"); 
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
        driver.manage().window().maximize(); 
    }  

    @AfterClass 
    public static void tearDown() throws Exception { 
        driver.quit();

    protected void fillField(By locator, String value) {
    driver.findElement(locator).clear();
    driver.findElement(locator).sendkeys(value);
    }
    }
}

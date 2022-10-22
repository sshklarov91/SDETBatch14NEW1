package Project;

public class TestWebDriver {
    public static void main(String[] args) {
        WebD[] arr = {new ChromeDriver12(), new FirefoxDriver12(), new SafariDriver12()};
        for (WebD obj : arr) {
            obj.open();
            obj.close();
            System.out.println("Title: " + obj.getTitle());
            // obj.navigate() and obj.getScreenshot() we don't access to them because they are not in WebDriver.
        }
    }
}

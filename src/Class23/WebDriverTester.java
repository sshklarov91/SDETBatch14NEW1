package Class23;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver webDriver[]={new ChromeDriver(),new FireFoxDriver()};
        for(WebDriver tester:webDriver){
            tester.openBrowser();
            tester.closeBrowser();
            tester.findElement();
            tester.maximizeWindow();
        }
    }
}

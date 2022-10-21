package Class23;

public interface WebDriverTester1 {
    public static void main(String[] args) {
        WebDriver1 webDriver1[]={new ChromeDriver1(),new FireFoxDriver1()};
        for(WebDriver1 tester:webDriver1){
            tester.openBrowser1();
            tester.closeBrowser1();
            tester.findElement1();
            tester.maximizeWindow1();
        }
    }
}


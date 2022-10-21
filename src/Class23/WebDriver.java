package Class23;

public abstract class WebDriver {
    abstract void openBrowser();
    abstract void closeBrowser ();
    abstract void maximizeWindow();
    abstract void findElement();
}
class ChromeDriver extends WebDriver{
    void openBrowser(){System.out.println("Open Chrome Browser");}
    void closeBrowser (){System.out.println("Close Chrome Browser");}
    void maximizeWindow(){System.out.println("Maximize Chrome Window");}
    void findElement(){System.out.println("Find Element In Chrome");}
}
class FireFoxDriver extends WebDriver {
    void openBrowser(){System.out.println("Open Firefox Browser");}
    void closeBrowser (){System.out.println("Close Firefox Browser");}
    void maximizeWindow(){System.out.println("Maximize Firefox Window");}
    void findElement(){System.out.println("Find Element In FireFox");}
}




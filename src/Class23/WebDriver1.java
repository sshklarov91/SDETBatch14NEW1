package Class23;

public interface WebDriver1 {
    void openBrowser1();
    void closeBrowser1 ();
    void maximizeWindow1();
    void findElement1();
}
class ChromeDriver1 implements WebDriver1{
    public void openBrowser1(){System.out.println("Open Chrome Browser");}
    public void closeBrowser1 (){System.out.println("Close Chrome Browser");}
    public void maximizeWindow1(){System.out.println("Maximize Chrome Window");}
    public void findElement1(){System.out.println("Find Element In Chrome");}
}
class FireFoxDriver1 implements WebDriver1 {
    public void openBrowser1(){System.out.println("Open Firefox Browser");}
    public void closeBrowser1 (){System.out.println("Close Firefox Browser");}
    public void maximizeWindow1(){System.out.println("Maximize Firefox Window");}
    public void findElement1(){System.out.println("Find Element In FireFox");}
}


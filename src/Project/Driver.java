package Project;

public class Driver {
}
interface WebD{
    void open();
    void close();
    String getTitle();
}
interface RemoteWebD extends WebD{
    void navigate();
}
interface TakesScreenshot extends RemoteWebD{
    void getScreenshot();
}
class ChromeDriver12 implements RemoteWebD{
    String title="Google";
    public void open(){
        System.out.println("Open Chrome");
    }
    public void close(){
        System.out.println("Close Chrome");
    }
    public String getTitle(){
        return title;
    }
    public void navigate(){
        System.out.println("Go To Chrome");
    }
}
class FirefoxDriver12 implements RemoteWebD{
    String title="Amazon";
    public void navigate(){
        System.out.println("Go To Firefox");
    }
    public void open(){
        System.out.println("Open Firefox");
    }
    public void close(){
        System.out.println("Close Firefox");
    }
    public String getTitle(){
        return title;
    }
}
class SafariDriver12 implements RemoteWebD{
    String title="Facebook";
    public void navigate(){
        System.out.println("Go To Safari");
    }
    public void open(){
        System.out.println("Open Safari");
    }
    public void close(){
        System.out.println("Close Safari");
    }
    public String getTitle(){
        return title;
    }
}


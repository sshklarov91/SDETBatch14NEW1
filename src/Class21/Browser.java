package Class21;

public class Browser {
    void openBrowser(){
        System.out.println("Opening a Browser");
    }
    void navigate(){
        System.out.println("opening the url");
    }
    void test(){
        System.out.println("Testing the webpage");
    }
    void closeBrowser(){
        System.out.println("close the browser");
    }
}

class Chrome extends Browser{
@Override
    void openBrowser(){
        System.out.println("opening the browser in less than 1 second");
    }
}
class fireFox1 extends Browser{
    public void openBrowser() {
        System.out.println("opening the browser in less than 1 second");
    }


}
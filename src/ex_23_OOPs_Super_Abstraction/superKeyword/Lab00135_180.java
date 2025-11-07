package ex_23_OOPs_Super_Abstraction.superKeyword;

public class Lab00135_180 {
}
class BaseClass{

    BaseClass(){
        System.out.println("DC- Parent");
    }
    BaseClass(String browser){
        this.browser = browser;
        System.out.println("DC- Parent");
    }

    private String browser;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    void openBrowser(){
        System.out.println("Opening Browser!!");

    }
    void openBrowser(String browserName) {
        System.out.println("Open Browser!! -> " + browserName);
    }

    void closeBrowser() {
        System.out.println("Close Browser!!");
    }

}
class TestCase extends BaseClass{
    void TestCase(){}

    TestCase(){
       // super();
        super("Chrome"); //PC
        super.openBrowser();//normal -T1
        super.openBrowser("Firefox");//typer 3
        super.closeBrowser();//Normal
        System.out.println(super.getBrowser());//get
        super.setBrowser("Edge");//set

    }
}
package ex_20_OOPs_Polymorphisim.methodoverloading;

public class WebUIAutomation {
    public static void main(String[] args){
        Browser b1 = new Browser();
        b1.stratBrowser();
        b1.stratBrowser("Chrome");
        b1.stratBrowser("Edge");
    }
}
class Browser{
    void stratBrowser(){
        System.out.println("Default Browser is started");
    }
    void stratBrowser(String browser){
        System.out.println("Starting browser " + browser);
    }
}
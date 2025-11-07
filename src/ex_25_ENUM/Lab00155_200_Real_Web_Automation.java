package ex_25_ENUM;

public class Lab00155_200_Real_Web_Automation {
    public static void main(String[] args){
        System.out.println(Locators.page_button.getM());
        System.out.println(Locators.page_input_Email.getM());
    }
}
enum Locators{
    page_input_Email("//*[@id=\"login-username\"]"),
    page_input_password("//*[@id=\"login-password\"]"),
    page_button("#btn");

    private String m;

    Locators (String m){
        this.m = m;
    }

    public String getM() {
        return m;
    }
}

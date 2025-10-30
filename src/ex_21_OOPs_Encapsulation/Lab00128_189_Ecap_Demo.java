package ex_21_OOPs_Encapsulation;

public class Lab00128_189_Ecap_Demo {
    public static void main(String[] arags){
        VWOLogin VWOLogin = new VWOLogin("admin", "pass 123");
        System.out.println(VWOLogin.password);
        VWOLogin.password = "1234";
        System.out.println(VWOLogin.password);

        GoodVWOLogin GoodvWOLogin = new GoodVWOLogin("admin", "4321");
        System.out.println(GoodvWOLogin.getUsername());
        System.out.println(GoodvWOLogin.getPassword());
        //GoodVWOLogin.setPassword("5678");
        System.out.println(GoodvWOLogin.getPassword());
        GoodvWOLogin.setUsername("Mansoor");
        System.out.println(GoodvWOLogin.getUsername());
        //GoodvWOLogin.setPassword("pass", true);
        String pass = GoodvWOLogin.getPassword();
        System.out.println(pass);
        GoodvWOLogin.setPassword("987", false);
        //System.out.println(pass);
    }
}
class VWOLogin {
    // Instance Variable | Data variable | Attribute | Fields |  properties | member variables
    public String username;
    public String password;

    public VWOLogin(String username, String password) {
        this.password = password;
        this.username = username;
    }
}
class GoodVWOLogin{
    private String username;
    private String password;
    GoodVWOLogin(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    //public void setPassword(String password) {
     //  this.password = password;


    public void setPassword(String password, boolean isGoodAdmin) {
        if (isGoodAdmin){
            this.password=password;
        }else {
            System.out.println("Not allowed to set the password");
        }
    }
}
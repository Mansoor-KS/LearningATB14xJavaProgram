package ex_25_ENUM;

public class Lab00153_199_Enum_P3 {
    public static void main(String[] args){
        System.out.println(HEX_COLORs.RED.getHex_code());
    }
}
enum HEX_COLORs{
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hex_code;

    HEX_COLORs (String hex_code){
        this.hex_code = hex_code;
    }

    public String getHex_code() {
        return hex_code;
    }
}

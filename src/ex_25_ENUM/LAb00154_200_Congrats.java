package ex_25_ENUM;

public class LAb00154_200_Congrats {
    public static void main(String[] args){
        System.out.println(Env.DEV.getBaseUrl());
        System.out.println(Env.STAGING);
        System.out.println(Env.PROD.getBaseUrl());
    }
}

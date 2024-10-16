package login;

public class UserID {
    private static String kd;
    
    public static void setUserLogin(String kode){
        kd = kode;
    }
    
    public static String getUserLogin(){
        return kd;
}
    
}

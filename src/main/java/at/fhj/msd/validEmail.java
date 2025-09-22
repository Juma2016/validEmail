package at.fhj.msd;

public class ValidEmail {

    public static boolean isValid(String email){
        
        if(email==null||email.isEmpty()||!email.contains("@"))
            return false;

        int atIndex= email.indexOf('@');
        int lastAtIndex=email.lastIndexOf('@');

        if(atIndex==-1||atIndex != lastAtIndex)
            return false;
        if(atIndex == 0||atIndex ==email.length() -1)
        return false;

        if(!email.endsWith(".com"))
            return false;

        return true;
    }
}
package JAVA_DATE类;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JAVA_DATE类 {
    public static void main(String[] args) throws ParseException {
        Date d=new Date();
        System.out.println(d);
        SimpleDateFormat sp=new SimpleDateFormat("yyyy:MM: dd HH:mm:ss");
        String s=sp.format(d);
        System.out.println(s);
        Date h=new Date();
        h=sp.parse(s);
        System.out.println(h);
    }
}

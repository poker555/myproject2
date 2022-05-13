package parking;

import javax.xml.crypto.Data;
import java.util.Date;

public class Runner
{
    public static void main(String[] args)
    {
        String id = "ABC-1234";
        String enterTime = "08:00";
        String exitTime = "11:00";
        Date d = new Date();
        System.out.println(d);
        //1970年至今的毫秒數
        System.out.println(d.getTime());
        long ms = 3*60*60*1000;
        Date d2 = new Date();
        System.out.println(d2);
        System.out.println(d2.getTime());
    }
}

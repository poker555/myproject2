package parking;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner
{
    public static void main(String[] args)
    {
        String id = "ABC-1234";
        String enterTime = "08:00";
        String exitTime = "11:00";
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date d = null;
        try
        {
            d = sdf.parse(enterTime);
        }
        catch (Exception e)
        {
            System.out.println("wrong format");
        }

        System.out.println(d);
        //1970年至今的毫秒數
        System.out.println(d.getTime());
        try
        {
            Date d2 = sdf.parse(exitTime);
            System.out.println(d2);
            System.out.println(d2.getTime());
            int mins = (int)((d2.getTime()-d.getTime())/1000/60);
            System.out.println(mins);
            int fee = 30*(mins/60);
            System.out.println("Fee:"+fee);
        }
        catch (Exception e)
        {
            System.out.println("exit wrong format");
        }
        long ms = 3*60*60*1000;
        Date d2 = new Date();
        System.out.println(d2);
        System.out.println(d2.getTime());
        d2.setTime(d.getTime()+ms);
        System.out.println(d2);
        System.out.println(d2.getTime());
    }
}

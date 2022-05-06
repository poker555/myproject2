package score;

public class ScoreNG
{
    public static void main(String[] args)
    {
        String[] name = {"Jack","Tom","Jane","David","Hank"};
        int[] english = {90,80,70,60,50};
        int[] math = {50,60,70,80,90};
        for (int i = 0;i<5;i++)
        {
            if (i != 3 )
            {
                System.out.println(name[i]+"\t"+english[i]+"\t"+math[i]+"\t"+(english[i]+math[i])/2);
            }
        }
    }
}

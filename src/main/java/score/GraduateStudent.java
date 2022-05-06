package score;

public class GraduateStudent extends Student
{
    int thesis;
    public GraduateStudent(String name,int math,int english,int thesis)
    {
        super(name,math,english);
        this.thesis = thesis;
    }
    @Override
    public void print()
    {
        System.out.println(name+"\t"+english+"\t"+english+"\t"+getAverage()+"\t"+thesis);
    }
}

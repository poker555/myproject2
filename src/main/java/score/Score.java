package score;

public class Score
{
    public static void main(String[] args)
    {
        Student jack = new Student("Jack",70,60);
        Student tom = new Student("Tom",50,30);
        GraduateStudent jane = new GraduateStudent("Jane",50,80,70);
        jack.print();
        tom.print();
        jane.print();
    }
}

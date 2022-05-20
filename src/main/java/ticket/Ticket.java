package ticket;

public class Ticket
{
    Station start;
    Station destination;
    int price;
    public Ticket(Station start,Station destination)
    {
        this.start = start;
        this.destination = destination;
        int diff = Math.abs(start.id - destination.id);
        System.out.println("diff"+diff);
        switch (diff)
        {
            case 100:
                price = 500;
                break;
            case 200:
                price = 600;
                break;
            case 300:
                price = 1100;
                break;
        }
    }
    public void print()
    {
        System.out.println(start.name+"\t"+destination.name+"\t"+price);
    }
}

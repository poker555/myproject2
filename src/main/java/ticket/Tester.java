package ticket;

import java.util.Scanner;

public class Tester
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station?(1:Taipei,2:Taichung,3:Kaohsiung)");
        int choice = Integer.parseInt(scanner.next());
        Station start = null;
        switch (choice)
        {
            case 1:
                start = Station.TAIPEI_STATION;
                break;
            case 2 :
                start = Station.TAICHUNG_STATION;
                break;
            case 3 :
                start = Station.KAOHSIUNG_STATION;

        }
        System.out.println("Your destination station?(1: Taipei,2:Taichung,3:Kaohsiung)");
        choice = Integer.parseInt(scanner.next());
        Station destination = null;
        switch (choice)
        {
            case 1:
                destination = Station.TAIPEI_STATION;
                break;
            case 2:
                destination = Station.TAICHUNG_STATION;
                break;
            case 3:
                destination = Station.KAOHSIUNG_STATION;
                break;
        }

        System.out.println("Which kind of ticket?(1:Normal,2:Student,3:Elder)");
        choice = Integer.parseInt(scanner.next());
        Ticket ticket = null;
        switch (choice)
        {
            case 1:
                ticket
        }


    }
}

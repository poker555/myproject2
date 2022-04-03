package sales;

import java.util.ArrayList;
import java.util.List;

public class SalesTester
{
    public static void main(String[] args)
    {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("0001",1200));
        customers.add(new Customer("0002",800));
        customers.add(new SilverCustomer("0003",2000));
        customers.add(new GoldenCustomer("0004",5000));
        for (Customer c:customers)
        {
            c.print();
        }
    }

}

package sales;

public class GoldenCustomer extends SilverCustomer
{
    public GoldenCustomer(String id,int amount)
    {
        super(id,amount);
        off = 0.2f;
        //如果還原金跟折扣沒掛勾就要另外寫
    }
}

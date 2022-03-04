package poker.brad;

public class Hello {
    public static void main(String[] args)
    {
        String[] name ={"Brad","Julia","Poker","Tom","Fish"};
        int[] english ={60,55,80,70,90};
        int[] math ={55,78,90,85,60};
        for(int i=0;i<5;i++){
        System.out.println(name[i]+" "+english[i]+" "+math[i]+" "+(english[i]+math[i])/2);
        }

    }
}


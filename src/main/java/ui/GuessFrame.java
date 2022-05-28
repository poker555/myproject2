package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame
{
    public GuessFrame()
    {
        super();
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JButton button = new JButton("Guess");
        JTextField number = new JTextField(8);
        Random r = new Random();
        int ans = r.nextInt(100)+1;
        JLabel label = new JLabel("ZZZZ");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int num = Integer.parseInt(number.getText());
                System.out.println(ans);
                if (num>ans)
                {
                    System.out.println("smaller");
                }
                else if (num<ans)
                {
                    System.out.println("Bigger");
                }
                else
                {
                    System.out.println("bingo,the secret number is"+ans);
                }


            }
        });
        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);
        setVisible(true);
    }













    public static void main(String[] args)
    {
        GuessFrame guessFrame = new GuessFrame();
        guessFrame.setVisible(true);
    }
}

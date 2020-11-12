import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;


public class CalculatorApp
{
    private static JButton  numPad [] = new JButton [11];

    public static void createNumPad()
    {
        for (int i=0;i<11;i++)
        {
            numPad[i]=new JButton();
            if (i==10)
            {
                numPad[i].setText(".");
            }
            else 
            {
                    numPad[i].setText(Integer.toString(i+1));
            }
        }
    }

    public static void main(String[] args) 
    {
        

        JFrame frame = new JFrame();
        JPanel centerPanel = new JPanel();
        JPanel leftPanel = new JPanel();
        JPanel rightPanel = new JPanel();

        JTextField displayArea = new JTextField();
        displayArea.setText("0.0");
        displayArea.setBackground(Color.YELLOW);

        JButton plusButton = new JButton("+");
        JButton minusButton = new JButton("-");
        JButton clearButton = new JButton("Clear");
        plusButton.setBackground(Color.GREEN);
        minusButton.setBackground(Color.GREEN);
        clearButton.setBackground(Color.GREEN);
        plusButton.setFont(new Font("Calibri",Font.BOLD,16));
        minusButton.setFont(new Font("Calibri",Font.BOLD,16));
        clearButton.setFont(new Font("Calibri",Font.BOLD,16));
        rightPanel.setLayout(new GridLayout(4,1));
        rightPanel.add(plusButton);
        rightPanel.add(minusButton);
        rightPanel.add(clearButton);
        rightPanel.setBackground(Color.BLUE);

        createNumPad();
        leftPanel.setLayout(new GridLayout(4,3));
        for(JButton i:numPad)
        {
            i.setBackground(Color.RED);
            i.setFont(new Font("Calibri",Font.BOLD,16));
            leftPanel.add(i);
        }
        leftPanel.setBackground(Color.BLUE);

        centerPanel.add(leftPanel);
        centerPanel.add(rightPanel);
        centerPanel.setBackground(Color.BLUE);
        /*
        * Border layout will align the panel and the text fields
        * BorderLayout will not align components in within a panel
        */
        frame.add(displayArea,BorderLayout.NORTH);
        frame.add(centerPanel,BorderLayout.CENTER);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.BLACK;
import static java.awt.Color.YELLOW;

public class Main {
    static JFrame frame;
    static JTextField textField;
    static JButton  [] numberOfButtons=new JButton[10];

    static JButton [] numberOfFunction = new JButton[8];


    static  JButton addBtn, subBtn , mulBtn ,divBtn,eqBtn,decBtn,clrBtn,delBtn;

    static JPanel panel;
    static double num1=0; static double num2=0; static double result=0;


    static char operator;
    public static void main(String[] args) {

        frame=new JFrame("STANDARD CALCULATOR");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,550);
        frame.setLocation(650,300); // OR WE CaN USE SETOUNDS
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(44, 62, 80));
        ImageIcon image = new ImageIcon("D:\\ALL DATA OF CODING\\JAVA\\Standard Calculator\\src\\calcuation.png");
        frame.setIconImage(image.getImage());

        Font myFont = new Font("my font ",Font.BOLD,30);
        textField= new JTextField();
        textField.setBounds(17,25,350,50);
        textField.setFont(myFont);
        textField.setEditable(false);
        textField.setBackground(Color.WHITE);
        textField.setForeground(BLACK);
        addBtn=new JButton("+");
        subBtn=new JButton("-");
        mulBtn=new JButton("*");
        divBtn=new JButton("/");
        clrBtn=new JButton("\u232B");
        delBtn=new JButton("\u2326");
        decBtn=new JButton(".");
        eqBtn=new JButton("=");


        numberOfFunction[0]=addBtn;
        numberOfFunction[1]=subBtn;
        numberOfFunction[2]=mulBtn;
        numberOfFunction[3]=divBtn;
        numberOfFunction[4]=clrBtn;
        numberOfFunction[5]=delBtn;
        numberOfFunction[6]=decBtn;
        numberOfFunction[7]=eqBtn;

        for (int i =0;i<8;i++){
            numberOfFunction[i].setFont(myFont);
            numberOfFunction[i].setFocusable(false);
            numberOfFunction[i].setBackground(new Color(231,76,60));
            numberOfFunction[i].setForeground(Color.WHITE);
            numberOfFunction[i].setBorder(BorderFactory.createLineBorder(BLACK,2));
        }
        for (int i =0; i<10;i++){
            numberOfButtons[i]=new JButton(String.valueOf(i));
            numberOfButtons[i].setFont(myFont);
            numberOfButtons[i].setFocusable(false);
            numberOfButtons[i].setBackground(new Color(2,151,219));
            numberOfButtons[i].setForeground(Color.WHITE);
            numberOfButtons[i].setBorder(BorderFactory.createLineBorder(BLACK,2));
        }
        delBtn.setBounds(17,425,160,70);
        clrBtn.setBounds(207,425,160,70);
        panel=new JPanel();
        panel.setBounds(17,100,350,310);
        panel.setLayout(new GridLayout(4,4,5,5));
        panel.setBackground(new Color(44,62,80));
        panel.setVisible(true);

// panel adding buttons

        panel.add(numberOfButtons[1]);
        panel.add(numberOfButtons[2]);
        panel.add(numberOfButtons[3]);
        panel.add(addBtn);
        panel.add(numberOfButtons[4]);
        panel.add(numberOfButtons[5]);
        panel.add(numberOfButtons[6]);
        panel.add(subBtn);
        panel.add(numberOfButtons[7]);
        panel.add(numberOfButtons[8]);
        panel.add(numberOfButtons[9]);
        panel.add(mulBtn);
        panel.add(decBtn);
        panel.add(numberOfButtons[0]);
        panel.add(divBtn);
        panel.add(eqBtn);
      // adding components to frame


        frame.add(textField);
        frame.add(delBtn);
        frame.add(clrBtn);
        frame.add(panel);
        frame.setVisible(true);


        for(int i =0;i<10;i++) {
            int Final = i;
            numberOfButtons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField.setText(textField.getText() + numberOfButtons[Final].getText());
                }
            });
        }
         decBtn.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {

                 textField.setText(textField.getText()+".");
             }
         });
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(textField.getText());
                operator='+';
                textField.setText("");
            }
        });
        subBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(textField.getText());
                operator='-';
                textField.setText("");
            }
        });
        mulBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(textField.getText());
                operator='*';
                textField.setText("");
            }
        });
        divBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(textField.getText());
                operator='/';
                textField.setText("");
            }
        });
        eqBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(textField.getText());
                switch (operator) {
                    case '+': {
                        result = num1 + num2;
                        break;

                    }


                    case '-': {
                        result = num1 - num2;
                        break;
                    }


                    case '*': {
                        result = num1 * num2;
                        break;

                    }


                    case '/': {
                        result = num1 / num2;
                        break;

                    }


                }// switch ends
                textField.setText(result + "");
                num1 = result;
            }
        });
        clrBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField.setText("");
            }
        });
        delBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().isEmpty()){
                String txt = textField.getText();
                textField.setText("");
              textField.setText(  txt.substring(0,txt.length()-1));}
//                String txt =textField.getText();
//                textField.setText("");
//                for (int i=0;i<txt.length()-1;i++){
//                    textField.setText(textField.getText()+txt.charAt(i));
//                }
            }
        });










    }
}
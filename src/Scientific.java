//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.*;

public class Scientific{
    static JFrame frame;
    static JTextField textField;
    static JButton  [] numberOfButtons=new JButton[10];

    static JButton [] numberOfFunction = new JButton[20];


    static  JButton addBtn, subBtn , mulBtn ,divBtn,eqBtn,decBtn,clrBtn,delBtn,cubeBtn ,naturalLogBtn ,sinBtn ,cosBtn,tanBtn,inverseSinBtn,inverseCosBtn,inverseTanBtn,squareBtn,powerBtn,commonLogBtn,rootBtn;

    static JPanel panel;
    static double num1=0; static double num2=0; static double result=0;


    static char operator;
    public static void main(String[] args) {

        frame=new JFrame("SCIENTIFIC CALCULATOR");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(475,575);
        frame.setLocation(650,300); // OR WE CaN USE SETOUNDS
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(44, 62, 80));
        ImageIcon image = new ImageIcon("D:\\ALL DATA OF CODING\\JAVA\\Calculator I\\src\\calcuation.png");
        frame.setIconImage(image.getImage());

        Font myFont = new Font("my font ",Font.BOLD,30);
        textField= new JTextField();
        textField.setBounds(30,25,400,50);
        textField.setFont(myFont);
        textField.setEditable(false);
        textField.setBackground(BLACK);
        textField.setForeground(WHITE);
        addBtn=new JButton("+");
        subBtn=new JButton("-");
        mulBtn=new JButton("*");
        divBtn=new JButton("/");
        clrBtn=new JButton("\u232B");
        delBtn=new JButton("\u2326");
        decBtn=new JButton(".");
        eqBtn=new JButton("=");
        naturalLogBtn= new JButton("ln");
        cubeBtn=new JButton("\u00B3");
        powerBtn=new JButton("^");
        squareBtn=new JButton("\u00B2");
        sinBtn=new JButton("Sin");
        cosBtn=new JButton("Cos");
        tanBtn=new JButton("Tan");
        inverseSinBtn=new JButton("1/sin");
        inverseCosBtn=new JButton("1/Cos");
        inverseTanBtn=new JButton("1/tan");
        commonLogBtn=new JButton("log");
        rootBtn=new JButton("\u221A");



        numberOfFunction[0]=addBtn;
        numberOfFunction[1]=subBtn;
        numberOfFunction[2]=mulBtn;
        numberOfFunction[3]=divBtn;
        numberOfFunction[4]=clrBtn;
        numberOfFunction[5]=delBtn;
        numberOfFunction[6]=decBtn;
        numberOfFunction[7]=eqBtn;
        numberOfFunction[8]=naturalLogBtn;
        numberOfFunction[9]=cubeBtn;
        numberOfFunction[10]=squareBtn;
        numberOfFunction[11]=powerBtn;
        numberOfFunction[12]=inverseSinBtn;
        numberOfFunction[13]=inverseCosBtn;
        numberOfFunction[14]=inverseTanBtn;
        numberOfFunction[15]=sinBtn;
        numberOfFunction[16]=cosBtn;
        numberOfFunction[17]=tanBtn;
        numberOfFunction[18]=commonLogBtn;
        numberOfFunction[19]=rootBtn;













        for (int i =0;i<20;i++){
            numberOfFunction[i].setFont(myFont);
            numberOfFunction[i].setFocusable(false);
            numberOfFunction[i].setBackground(BLACK);
            numberOfFunction[i].setForeground(new Color(255,105,0));
            numberOfFunction[i].setBorder(BorderFactory.createLineBorder(BLACK,2));
        }
        for (int i =0; i<10;i++){
            numberOfButtons[i]=new JButton(String.valueOf(i));
            numberOfButtons[i].setFont(myFont);
            numberOfButtons[i].setFocusable(false);
            numberOfButtons[i].setBackground(BLACK);
            numberOfButtons[i].setForeground(WHITE);
            numberOfButtons[i].setBorder(BorderFactory.createLineBorder(BLACK,2));
        }
//        delBtn.setBounds(17,425,160,70);
//        clrBtn.setBounds(207,425,160,70);
        panel=new JPanel();
        panel.setBounds(30,100,400,400);
        panel.setLayout(new GridLayout(6,5,5,5));
        panel.setBackground(new Color(44,62,80));
        panel.setVisible(true);

// panel adding buttons
        panel.add(clrBtn);
        panel.add(delBtn);
        panel.add(squareBtn);
        panel.add(powerBtn);




        panel.add(sinBtn);

        panel.add(numberOfButtons[1]);
        panel.add(numberOfButtons[2]);
        panel.add(numberOfButtons[3]);
        panel.add(addBtn);
        panel.add(cosBtn);

        panel.add(numberOfButtons[4]);
        panel.add(numberOfButtons[5]);
        panel.add(numberOfButtons[6]);
        panel.add(subBtn);
        panel.add(tanBtn);

        panel.add(numberOfButtons[7]);
        panel.add(numberOfButtons[8]);
        panel.add(numberOfButtons[9]);
        panel.add(mulBtn);
        panel.add(inverseSinBtn);

        panel.add(decBtn);
        panel.add(numberOfButtons[0]);
        panel.add(eqBtn);
        panel.add(divBtn);

        panel.add(inverseCosBtn);

        panel.add(naturalLogBtn);
        panel.add(commonLogBtn);
        panel.add(cubeBtn);
        panel.add(rootBtn);
        panel.add(inverseTanBtn);







        // adding components to frame


        frame.add(textField);
//        frame.add(delBtn);
//        frame.add(clrBtn);
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
if(!textField.getText().contains(".")){
                textField.setText(textField.getText()+".");
            }
            else{
                textField.setText("ERROR");
            }
            }
        });
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().isEmpty()){
                num1=Double.parseDouble(textField.getText());
                operator='+';
                textField.setText("");
            }
            }
        });
        subBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().isEmpty()){
                num1=Double.parseDouble(textField.getText());
                operator='-';
                textField.setText("");
            }}
        });
        mulBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().isEmpty()){
                num1=Double.parseDouble(textField.getText());
                operator='*';
                textField.setText("");
            }}
        });
        divBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().isEmpty()){
                num1=Double.parseDouble(textField.getText());
                operator='/';
                textField.setText("");
            }}
        });
        powerBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().isEmpty()){
                num1=Double.parseDouble(textField.getText());
                operator='^';
                textField.setText("");
            }}
        });
        squareBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().isEmpty()){
                num1=Double.parseDouble(textField.getText());
                result=Math.pow(num1,2);

                textField.setText(String.valueOf(result));
                operator='\0';
            }}
        });
        rootBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().isEmpty()){
                num1=Double.parseDouble(textField.getText());
                result=Math.sqrt(num1);
                textField.setText(String.valueOf(result));
                operator='\0';
            }}
        });
        commonLogBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().isEmpty()){
                num1=Double.parseDouble(textField.getText());
                  result=Math.log10(num1);
                  textField.setText(String.valueOf(result));
                  operator='\0';

            }}
        });
        naturalLogBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().isEmpty()) {
                    num1 = Double.parseDouble(textField.getText());
                    result = Math.log(num1);
                    textField.setText(String.valueOf(result));
                    operator='\0';


                }
            }
        });
        cubeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().isEmpty()){
                    num1=Double.parseDouble(textField.getText());
                    result=Math.pow(num1,3);

                    textField.setText(String.valueOf(result));
                    operator='\0';


                }
            }
        });
        sinBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().isEmpty()) {
                    num1 = Double.parseDouble(textField.getText());
                    result = Math.sin(Math.toRadians(num1));
                    textField.setText(String.valueOf(result));
                    operator='\0';
                }
            }
        });
        cosBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().isEmpty()) {
                    num1 = Double.parseDouble(textField.getText());
                    result = Math.cos(Math.toRadians(num1));
                    textField.setText(String.valueOf(result));
                    operator='\0';
                }
            }
        });
        tanBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().isEmpty()) {
                    num1 = Double.parseDouble(textField.getText());
                    if (num1!=90){
                    result = Math.tan(Math.toRadians(num1));
                    textField.setText(String.valueOf(result));
                    operator='\0';
                }else {
                    textField.setText("ERROR");
                    return;
                }}
            }
        });
        inverseSinBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().isEmpty()) {
                    num1 = Double.parseDouble(textField.getText());
                    result = 1/(Math.sin(Math.toRadians(num1)));
                    textField.setText(String.valueOf(result));
                    operator='\0';
                }
            }
        });
        inverseCosBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().isEmpty()) {
                    num1 = Double.parseDouble(textField.getText());
                    result = 1/(Math.cos(Math.toRadians(num1)));
                    textField.setText(String.valueOf(result));
                    operator='\0';
                }
            }
        });
        inverseTanBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().isEmpty()) {
                    num1 = Double.parseDouble(textField.getText());
                    if (num1!=0){
                        result = 1/(Math.tan(Math.toRadians(num1)));
                        textField.setText(String.valueOf(result));
                        operator='\0';
                    }else {
                        textField.setText("ERROR");
                        return;
                    }}
            }
        });


        eqBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setText("Error");
                    return;
                }
                if(operator=='\0'){
                    return;
                }
                if(operator=='\u221A'){
                    return;
                }









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
                        if (num2!=0){
                        result = num1 / num2;
                        break;}
                        else{
                            textField.setText("ERROR");
                            return;
                        }

                    }
                    case '^':{
                        result=Math.pow(num1,num2);
                        break;
                    }






                }// switch ends
                textField.setText(String.valueOf(result));
                num1 = result;
                operator='\0';
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
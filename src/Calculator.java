import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Calculator extends JFrame implements ActionListener {

    JLabel answer = new JLabel();
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonMul = new JButton("*");
    JButton buttonDiv = new JButton("/");
    JButton buttonC = new JButton("C");
    JButton buttonEquals = new JButton("=");

    Calculator() {


        button0.setFont(new Font("Comic Sans MS", Font.PLAIN, 60));
        button1.setFont(new Font("Comic Sans MS", Font.PLAIN, 60));
        button2.setFont(new Font("Comic Sans MS", Font.PLAIN, 60));
        button3.setFont(new Font("Comic Sans MS", Font.PLAIN, 60));
        button4.setFont(new Font("Comic Sans MS", Font.PLAIN, 60));
        button5.setFont(new Font("Comic Sans MS", Font.PLAIN, 60));
        button6.setFont(new Font("Comic Sans MS", Font.PLAIN, 60));
        button7.setFont(new Font("Comic Sans MS", Font.PLAIN, 60));
        button8.setFont(new Font("Comic Sans MS", Font.PLAIN, 60));
        button9.setFont(new Font("Comic Sans MS", Font.PLAIN, 60));
        buttonPlus.setFont(new Font("Comic Sans MS", Font.PLAIN, 60));
        buttonMinus.setFont(new Font("Comic Sans MS", Font.PLAIN, 60));
        buttonMul.setFont(new Font("Comic Sans MS", Font.PLAIN, 60));
        buttonDiv.setFont(new Font("Comic Sans MS", Font.PLAIN, 60));
        buttonC.setFont(new Font("Comic Sans MS", Font.PLAIN, 60));
        buttonEquals.setFont(new Font("Comic Sans MS", Font.PLAIN, 60));

        button0.setForeground(Color.WHITE);
        button0.setBackground(new Color(30, 4, 33));
        button1.setForeground(Color.WHITE);
        button1.setBackground(new Color(30, 4, 33));
        button2.setForeground(Color.WHITE);
        button2.setBackground(new Color(30, 4, 33));
        button3.setForeground(Color.WHITE);
        button3.setBackground(new Color(30, 4, 33));
        button5.setForeground(Color.WHITE);
        button5.setBackground(new Color(30, 4, 33));
        button6.setForeground(Color.WHITE);
        button6.setBackground(new Color(30, 4, 33));
        button7.setForeground(Color.WHITE);
        button7.setBackground(new Color(30, 4, 33));
        button8.setForeground(Color.WHITE);
        button8.setBackground(new Color(30, 4, 33));
        button9.setForeground(Color.WHITE);
        button9.setBackground(new Color(30, 4, 33));
        buttonPlus.setForeground(Color.WHITE);
        buttonPlus.setBackground(new Color(30, 4, 33));
        buttonMinus.setForeground(Color.WHITE);
        buttonMinus.setBackground(new Color(30, 4, 33));
        buttonMul.setForeground(Color.WHITE);
        buttonMul.setBackground(new Color(30, 4, 33));
        buttonDiv.setForeground(Color.WHITE);
        buttonDiv.setBackground(new Color(30, 4, 33));
        buttonC.setForeground(Color.WHITE);
        buttonC.setBackground(new Color(30, 4, 33));
        buttonEquals.setForeground(Color.WHITE);
        buttonEquals.setBackground(new Color(30, 4, 33));
        button4.setForeground(Color.WHITE);
        button4.setBackground(new Color(30, 4, 33));
        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonC.addActionListener(this);
        buttonEquals.addActionListener(this);


        answer.setFont(new Font("Comic Sans MS", Font.PLAIN, 70));


        JPanel resultPanel = new JPanel();
        resultPanel.setPreferredSize(new Dimension(500, 200));
        resultPanel.setBackground(new Color(35, 6, 38));
        resultPanel.setLayout(new BorderLayout());
        resultPanel.add(answer, BorderLayout.EAST);

        JPanel keysPanel = new JPanel();
        keysPanel.setLayout(new GridLayout(4, 4, 5, 5));
        keysPanel.setPreferredSize(new Dimension(500, 600));
        keysPanel.setBackground(Color.BLACK);
        keysPanel.add(button7);
        keysPanel.add(button8);
        keysPanel.add(button9);
        keysPanel.add(buttonC);
        keysPanel.add(button4);
        keysPanel.add(button5);
        keysPanel.add(button6);
        keysPanel.add(buttonMul);
        keysPanel.add(button1);
        keysPanel.add(button2);
        keysPanel.add(button3);
        keysPanel.add(buttonDiv);
        keysPanel.add(button0);
        keysPanel.add(buttonPlus);
        keysPanel.add(buttonMinus);
        keysPanel.add(buttonEquals);

        this.setSize(500, 800);
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(resultPanel);
        this.add(keysPanel);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    Double firstInput = null;
    Double secondInput = null;
    Character operation = null;
    boolean turn = true;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {

            if (operation == null && secondInput == null) {
                if (firstInput == null) firstInput = 1.0;
                else {
                    firstInput *= 10;
                    firstInput += 1;
                }

            } else if (operation != null) {
                System.out.println(operation);
                if (secondInput == null) secondInput = 1.0;
                else {
                    secondInput *= 10;
                    secondInput += 1;
                }

            }
            showL();

        } else if (e.getSource() == button0) {
            if (operation == null && secondInput == null) {
                if (firstInput == null) firstInput = 0.0;
                else {
                    firstInput *= 10;
                    firstInput += 0;
                }
            } else if (operation != null) {
                if (secondInput == null) secondInput = 0.0;
                else {
                    secondInput *= 10;
                    secondInput += 0;
                }
            }
            showL();
        } else if (e.getSource() == button2) {
            if (operation == null && secondInput == null) {
                if (firstInput == null) firstInput = 2.0;
                else {
                    firstInput *= 10;
                    firstInput += 2;
                }
            } else if (operation != null) {
                if (secondInput == null) secondInput = 2.0;
                else {
                    secondInput *= 10;
                    secondInput += 2;
                }
            }
            showL();
        } else if (e.getSource() == button3) {
            if (operation == null && secondInput == null) {
                if (firstInput == null) firstInput = 3.0;
                else {
                    firstInput *= 10;
                    firstInput += 3;
                }
            } else if (operation != null) {
                if (secondInput == null) secondInput = 3.0;
                else {
                    secondInput *= 10;
                    secondInput += 3;
                }
            }
            showL();
        } else if (e.getSource() == button4) {
            if (operation == null && secondInput == null) {
                if (firstInput == null) firstInput = 4.0;
                else {
                    firstInput *= 10;
                    firstInput += 4;
                }
            } else if (operation != null) {
                if (secondInput == null) secondInput = 4.0;
                else {
                    secondInput *= 10;
                    secondInput += 4;
                }
            }
            showL();
        } else if (e.getSource() == button5) {
            if (operation == null && secondInput == null) {
                if (firstInput == null) firstInput = 5.0;
                else {
                    firstInput *= 10;
                    firstInput += 5;
                }
            } else if (operation != null) {
                if (secondInput == null) secondInput = 5.0;
                else {
                    secondInput *= 10;
                    secondInput += 5;
                }
            }
            showL();
        } else if (e.getSource() == button6) {
            if (operation == null && secondInput == null) {
                if (firstInput == null) firstInput = 6.0;
                else {
                    firstInput *= 10;
                    firstInput += 6;
                }
            } else if (operation != null) {
                if (secondInput == null) secondInput = 6.0;
                else {
                    secondInput *= 10;
                    secondInput += 6;
                }
            }
            showL();
        } else if (e.getSource() == button7) {
            if (operation == null && secondInput == null) {
                if (firstInput == null) firstInput = 7.0;
                else {
                    firstInput *= 10;
                    firstInput += 7;
                }
            } else if (operation != null) {
                if (secondInput == null) secondInput = 7.0;
                else {
                    secondInput *= 10;
                    secondInput += 7;
                }
            }
            showL();
        } else if (e.getSource() == button8) {
            if (operation == null && secondInput == null) {
                if (firstInput == null) firstInput = 8.0;
                else {
                    firstInput *= 10;
                    firstInput += 8;
                }
            } else if (operation != null) {
                if (secondInput == null) secondInput = 8.0;
                else {
                    secondInput *= 10;
                    secondInput += 8;
                }
            }
            showL();
        } else if (e.getSource() == button9) {
            if (operation == null && secondInput == null) {
                if (firstInput == null) firstInput = 9.0;
                else {
                    firstInput *= 10;
                    firstInput += 9;
                }
            } else if (operation != null) {
                if (secondInput == null) secondInput = 9.0;
                else {
                    secondInput *= 10;
                    secondInput += 9;
                }
            }
            showL();
        } else if (e.getSource() == buttonC) {
            firstInput = null;
            secondInput = null;
            operation = null;
            turn = true;
            answer.setText(String.valueOf(""));
        } else if (e.getSource() == buttonPlus) {
            operation = '+';
            turn = false;
        } else if (e.getSource() == buttonMinus) {
            operation = '-';
            turn = false;
        } else if (e.getSource() == buttonMul) {
            operation = '*';
            turn = false;
        } else if (e.getSource() == buttonDiv) {
            operation = '/';
            turn = false;
        } else if (e.getSource() == buttonEquals) {
            if (firstInput == null || secondInput == null || operation == null) {

                answer.setText("Error");
                firstInput = null;
                secondInput = null;
                turn = true;
                operation = null;
            } else firstInput = switch (operation) {
                case '+' -> firstInput + secondInput;
                case '-' -> firstInput - secondInput;
                case '*' -> firstInput * secondInput;
                case '/' -> {
                    if (secondInput == 0) {
                        secondInput = null;
                        turn = true;
                        yield null;
                    } else yield firstInput / secondInput;
                }
                default -> throw new IllegalStateException("Unexpected value: " + operation);
            };
            if (firstInput != null) chang(firstInput);
            else answer.setText("Error");
            turn = true;
            secondInput = null;

        }
    }

    DecimalFormat format = new DecimalFormat("0.#");
    private void showL(){
        if (turn) {
            if (firstInput == null) answer.setText("");
            if(firstInput%1==0){
                answer.setText(String.valueOf(format.format(firstInput)));
            }else  answer.setText(String.valueOf((firstInput)));
        } else {
            if (secondInput == null) answer.setText("");
            if (secondInput%1==0){
            answer.setText(String.valueOf(format.format(secondInput)));}
            else answer.setText(String.valueOf(secondInput));
        }
    }
    private void chang(Double x){
        if(x%1==0){
            answer.setText(String.valueOf(format.format(x)));
        }else  answer.setText(String.valueOf((x)));
    }
}

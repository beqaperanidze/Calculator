import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    Calculator(){
        JLabel answer = new JLabel();
        answer.setText("123123213");
        answer.setFont(new Font("",Font.PLAIN,50));

        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new BorderLayout());
        resultPanel.setBounds(0,0,600,200);
        resultPanel.setBackground(Color.GRAY);
        resultPanel.add(answer,BorderLayout.EAST);

        JPanel keysPanel = new JPanel();
        keysPanel.setBounds(0,300,600,600);
        keysPanel.setBackground(Color.BLACK);

        this.setSize(500,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(resultPanel);
        this.add(keysPanel);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
